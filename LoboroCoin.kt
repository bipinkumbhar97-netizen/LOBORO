package com.example.ui.components

import android.provider.Settings
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.ui.theme.LoboroGoldDeep
import com.example.ui.theme.LoboroGoldEdge
import com.example.ui.theme.LoboroGoldHighlight
import com.example.ui.theme.LoboroGoldMid
import com.example.ui.theme.LoboroNavy
import com.example.ui.theme.LoboroYellow

/**
 * Golden Animated LOBORO Coin.
 * Features metallic gold gradients, engraved circular "L" mark, and a smooth diagonal shimmer
 * + subtle halo glow. Respects system reduced-motion settings & in-app reduced-motion mode.
 *
 * Uses drawWithCache + deferred State reads so animation runs purely in the draw phase
 * with zero recompositions and zero per-frame Path/Brush heap allocations.
 */
@Composable
fun LoboroCoin(
    modifier: Modifier = Modifier,
    size: Dp = 36.dp,
    reducedMotionOverride: Boolean = false,
    contentDescriptionText: String = "LOBORO Coin"
) {
    val context = LocalContext.current
    val systemAnimationsDisabled = remember(context) {
        runCatching {
            Settings.Global.getFloat(
                context.contentResolver,
                Settings.Global.ANIMATOR_DURATION_SCALE,
                1f
            ) == 0f
        }.getOrDefault(false)
    }
    val disableAnimation = reducedMotionOverride || systemAnimationsDisabled

    val shineProgressState: State<Float>
    val glowAlphaState: State<Float>

    if (disableAnimation) {
        shineProgressState = remember { mutableFloatStateOf(0.35f) }
        glowAlphaState = remember { mutableFloatStateOf(0.25f) }
    } else {
        val infiniteTransition = rememberInfiniteTransition(label = "loboro_coin_anim")
        shineProgressState = infiniteTransition.animateFloat(
            initialValue = -0.4f,
            targetValue = 1.4f,
            animationSpec = infiniteRepeatable(
                animation = tween(durationMillis = 2800, easing = LinearEasing),
                repeatMode = RepeatMode.Restart
            ),
            label = "coin_shine"
        )
        glowAlphaState = infiniteTransition.animateFloat(
            initialValue = 0.16f,
            targetValue = 0.38f,
            animationSpec = infiniteRepeatable(
                animation = tween(durationMillis = 1900, easing = LinearEasing),
                repeatMode = RepeatMode.Reverse
            ),
            label = "coin_glow"
        )
    }

    Spacer(
        modifier = modifier
            .size(size)
            .semantics { contentDescription = contentDescriptionText }
            .drawWithCache {
                val w = this.size.width
                val h = this.size.height
                val center = Offset(w / 2f, h / 2f)
                val outerR = minOf(w, h) / 2f
                val coinR = outerR * 0.88f
                val faceR = coinR * 0.84f

                val haloBrush = Brush.radialGradient(
                    colors = listOf(LoboroYellow, Color.Transparent),
                    center = center,
                    radius = outerR.coerceAtLeast(1f)
                )
                val rimBrush = Brush.linearGradient(
                    colors = listOf(LoboroGoldHighlight, LoboroGoldMid, LoboroGoldEdge),
                    start = Offset.Zero,
                    end = Offset(w, h)
                )
                val faceBrush = Brush.radialGradient(
                    colors = listOf(LoboroGoldHighlight, LoboroGoldMid, LoboroGoldDeep),
                    center = Offset(center.x - faceR * 0.22f, center.y - faceR * 0.22f),
                    radius = (faceR * 1.4f).coerceAtLeast(1f)
                )
                val innerBorderColor = LoboroNavy.copy(alpha = 0.28f)
                val innerBorderStroke = Stroke(width = (coinR * 0.05f).coerceAtLeast(1f))
                val letterColor = LoboroNavy.copy(alpha = 0.88f)

                val lLeft = center.x - coinR * 0.28f
                val lTop = center.y - coinR * 0.42f
                val lBottom = center.y + coinR * 0.42f
                val lStem = coinR * 0.22f
                val lRight = center.x + coinR * 0.34f
                val lFoot = coinR * 0.20f

                val lPath = Path().apply {
                    moveTo(lLeft, lTop)
                    lineTo(lLeft + lStem, lTop)
                    lineTo(lLeft + lStem, lBottom - lFoot)
                    lineTo(lRight, lBottom - lFoot)
                    lineTo(lRight - coinR * 0.04f, lBottom)
                    lineTo(lLeft, lBottom)
                    close()
                }

                val coinClip = Path().apply {
                    addOval(
                        Rect(
                            center.x - coinR,
                            center.y - coinR,
                            center.x + coinR,
                            center.y + coinR
                        )
                    )
                }

                val bandWidth = w * 0.28f
                val shineBrush = Brush.linearGradient(
                    colors = listOf(
                        Color.Transparent,
                        Color.White.copy(alpha = 0.55f),
                        Color.Transparent
                    ),
                    start = Offset(-bandWidth, 0f),
                    end = Offset(bandWidth, h)
                )
                val shineStart = Offset(-bandWidth * 0.6f, -h * 0.1f)
                val shineEnd = Offset(bandWidth * 0.6f, h * 1.1f)
                val shineStrokeWidth = bandWidth * 0.85f

                onDrawBehind {
                    // Soft ambient golden halo glow using cached brush + animated alpha
                    drawCircle(
                        brush = haloBrush,
                        radius = outerR,
                        center = center,
                        alpha = glowAlphaState.value
                    )

                    // Outer metallic gold rim
                    drawCircle(
                        brush = rimBrush,
                        radius = coinR,
                        center = center
                    )

                    // Inner recessed gold face
                    drawCircle(
                        brush = faceBrush,
                        radius = faceR,
                        center = center
                    )

                    // Engraved navy inner circle border for crispness
                    drawCircle(
                        color = innerBorderColor,
                        radius = faceR,
                        center = center,
                        style = innerBorderStroke
                    )

                    // Bold embossed "L" symbol in the center
                    drawPath(path = lPath, color = letterColor)

                    // Moving diagonal golden shine clipped to coin face using cached brush + translate
                    clipPath(coinClip) {
                        val bandCenter = w * shineProgressState.value
                        translate(left = bandCenter) {
                            drawLine(
                                brush = shineBrush,
                                start = shineStart,
                                end = shineEnd,
                                strokeWidth = shineStrokeWidth
                            )
                        }
                    }
                }
            }
    )
}

