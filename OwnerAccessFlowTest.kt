package com.example

import android.app.Application
import androidx.test.core.app.ApplicationProvider
import com.example.domain.integrations.HttpNormalUserAuthProvider
import com.example.domain.integrations.HttpOwnerAuthProvider
import com.example.domain.integrations.IntegrationStatus
import com.example.domain.integrations.NormalUserAuthResult
import com.example.domain.integrations.OwnerBootstrapStatus
import com.example.domain.integrations.OwnerPinVerificationResult
import com.example.domain.integrations.OwnerRegistrationResult
import com.example.domain.model.LoboroIdRegistry
import com.example.domain.model.NormalAccountRole
import com.example.domain.model.UserRole
import com.example.ui.viewmodel.LoboroViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@OptIn(ExperimentalCoroutinesApi::class)
@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class OwnerAccessFlowTest {

    @Test
    fun `emblem tap requires exactly 10 taps before unlocking hidden flow`() {
        val app = ApplicationProvider.getApplicationContext<Application>()
        val vm = LoboroViewModel(app)

        repeat(9) {
            assertFalse("Tap ${it + 1} must not trigger hidden Owner access", vm.onLoboroEmblemTap())
        }
        assertTrue("10th tap must trigger hidden Owner access", vm.onLoboroEmblemTap())
        assertFalse("Counter must reset after 10th tap", vm.onLoboroEmblemTap())
    }

    @Test
    fun `ordinary users cannot escalate to OWNER_SUPER_ADMIN via preview or profile registration`() {
        val app = ApplicationProvider.getApplicationContext<Application>()
        val vm = LoboroViewModel(app)

        vm.switchRolePreview(UserRole.OWNER_SUPER_ADMIN)
        assertEquals(UserRole.WORKER, vm.uiState.value.activeRole)
        assertFalse(vm.uiState.value.ownerSession.isAuthenticated)

        vm.registerPreviewProfile(
            role = UserRole.OWNER_SUPER_ADMIN,
            fullName = "Test User",
            homeState = "Assam",
            homeDistrict = "Barpeta",
            currentCity = "Hyderabad",
            skillsText = "Mason",
            emergencyName = "Family",
            emergencyPhone = "9800000000",
            emergencyConsent = true,
            photoUri = null,
            faceCaptured = false
        )
        assertEquals(UserRole.WORKER, vm.uiState.value.activeRole)
        assertFalse(vm.uiState.value.ownerSession.isOwnerInitialized)
    }

    @Test
    fun `unconfigured backend does not fake OTP success or allow registration or PIN bypass`() = runTest {
        val provider = HttpOwnerAuthProvider("")
        assertEquals(IntegrationStatus.NOT_CONFIGURED, provider.status)
        assertTrue(provider.checkOwnerBootstrapStatus() is OwnerBootstrapStatus.BackendNotConfigured)
        assertTrue(provider.requestFirstOwnerRegistrationOtp("BOOT-1", "+919876543210").isFailure)
        assertTrue(provider.verifyFirstOwnerRegistrationOtp("sess-1", "123456").isFailure)
        assertTrue(
            provider.registerFirstOwner(
                setupAuthorizationCode = "BOOT-1",
                fullName = "Owner",
                mobileNumber = "+919876543210",
                otpSessionId = "sess-1",
                loginPassword = "StrongPassword!1",
                adminPin = "7391"
            ) is OwnerRegistrationResult.BackendNotConfigured
        )
        assertTrue(provider.verifyOwnerPin("7391") is OwnerPinVerificationResult.BackendNotConfigured)
    }

    @Test
    fun `first owner registration validates bootstrap secret, OTP, password match, and 4-digit PIN match`() {
        val app = ApplicationProvider.getApplicationContext<Application>()
        val vm = LoboroViewModel(app)

        // Missing setup authorization code
        vm.submitFirstOwnerRegistration()
        assertTrue(vm.uiState.value.ownerRegistrationForm.isError)
        assertFalse(vm.uiState.value.ownerSession.isOwnerInitialized)

        // Mismatched password or unverified OTP blocked before submission
        vm.updateOwnerRegistrationForm {
            it.copy(
                setupAuthorizationCode = "SETUP-TOKEN",
                fullName = "Bipin Owner",
                mobileNumber = "+919876543210",
                otpVerifiedOnServer = true,
                otpSessionId = "otp-sess",
                loginPassword = "Password123!",
                confirmLoginPassword = "MismatchPassword!",
                adminPin = "7391",
                confirmAdminPin = "7391"
            )
        }
        vm.submitFirstOwnerRegistration()
        assertTrue(vm.uiState.value.ownerRegistrationForm.isError)
        assertTrue(
            vm.uiState.value.ownerRegistrationForm.statusMessage.orEmpty()
                .contains("do not match", ignoreCase = true)
        )

        // Mismatched 4-digit PIN
        vm.updateOwnerRegistrationForm {
            it.copy(
                confirmLoginPassword = "Password123!",
                confirmAdminPin = "9999"
            )
        }
        vm.submitFirstOwnerRegistration()
        assertTrue(vm.uiState.value.ownerRegistrationForm.isError)
        assertTrue(
            vm.uiState.value.ownerRegistrationForm.statusMessage.orEmpty()
                .contains("PIN", ignoreCase = true)
        )
    }

    @Test
    fun `normal user registration and login are limited to Worker and Employer and fail closed without backend`() = runTest {
        assertEquals(setOf(NormalAccountRole.WORKER, NormalAccountRole.EMPLOYER), NormalAccountRole.entries.toSet())

        val normalProvider = HttpNormalUserAuthProvider("")
        assertEquals(IntegrationStatus.NOT_CONFIGURED, normalProvider.status)
        assertTrue(normalProvider.requestRegistrationOtp(NormalAccountRole.WORKER, "+919876543210").isFailure)
        assertTrue(normalProvider.verifyRegistrationOtp("user-sess", "123456").isFailure)
        assertTrue(
            normalProvider.completeRegistration(
                role = NormalAccountRole.EMPLOYER,
                fullName = "Arjun Builders",
                mobileNumber = "+919876543210",
                otpSessionId = "user-sess",
                homeState = "Karnataka",
                homeDistrict = "Bengaluru",
                currentCityState = "Bengaluru, Karnataka",
                skills = listOf("Civil Contracting"),
                emergencyContactName = "",
                emergencyContactPhone = "",
                emergencyConsentGiven = true
            ) is NormalUserAuthResult.BackendNotConfigured
        )
        assertTrue(normalProvider.requestLoginOtp("+919876543210").isFailure)
        assertTrue(normalProvider.verifyLoginOtp("login-sess", "123456") is NormalUserAuthResult.BackendNotConfigured)
    }

    @Test
    fun `normal user registry blocks VIP and Owner IDs and generates unique LB2000 plus IDs`() {
        assertTrue(LoboroIdRegistry.isReservedVipId("LB1"))
        assertTrue(LoboroIdRegistry.isReservedVipId("LB10"))
        assertTrue(LoboroIdRegistry.isReservedVipId("LB777"))
        assertTrue(LoboroIdRegistry.isReservedVipId("LB9999"))
        assertTrue(LoboroIdRegistry.isReservedVipId("OWNER-MASTER-01"))
        assertTrue(LoboroIdRegistry.isReservedVipId("ADMIN-99"))

        val first = LoboroIdRegistry.generateNextStandardId(2349)
        val second = LoboroIdRegistry.generateNextStandardId(2349)
        assertEquals("LB2349", first)
        assertEquals("LB2350", second)
        assertNotEquals(first, second)

        // VIP number LB2222 must be skipped automatically
        val skippingVip = LoboroIdRegistry.generateNextStandardId(2222)
        assertEquals("LB2223", skippingVip)
    }

    @Test
    fun `normal user ViewModel OTP flows validate input and do not fake OTP success`() = runTest {
        val app = ApplicationProvider.getApplicationContext<Application>()
        val vm = LoboroViewModel(app)

        vm.updateNormalUserRegForm {
            it.copy(selectedRole = NormalAccountRole.WORKER, fullName = "A", mobileNumber = "123")
        }
        vm.requestNormalUserRegistrationOtp()
        assertTrue(vm.uiState.value.normalUserRegForm.isError)
        assertFalse(vm.uiState.value.normalUserRegForm.otpSent)

        vm.updateNormalUserRegForm {
            it.copy(fullName = "Raju Das", mobileNumber = "+919876543210")
        }
        vm.requestNormalUserRegistrationOtp()
        advanceUntilIdle()
        assertTrue(vm.uiState.value.normalUserRegForm.isError)
        assertFalse(vm.uiState.value.normalUserRegForm.otpSent)
        assertFalse(vm.uiState.value.normalUserSession.isSignedIn)
    }
}
