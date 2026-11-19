package com.example.data

import com.example.domain.model.*

object LoboroDemoRepository {

    val supportedCountries = listOf("India", "UAE (Coming Soon)", "Singapore (Coming Soon)")

    val indianStates = listOf(
        "All States",
        "Telangana",
        "Andhra Pradesh",
        "Tamil Nadu",
        "Karnataka",
        "Maharashtra",
        "Gujarat",
        "Assam",
        "Bihar",
        "Uttar Pradesh",
        "West Bengal",
        "Odisha",
        "Kerala",
        "Punjab"
    )

    val demoWorkerProfile = UserProfile(
        loboroId = "LB269",
        role = UserRole.WORKER,
        fullName = "Raju Das (Demo Worker)",
        mobileMasked = "+91 98••••4310",
        homeState = "Assam",
        homeDistrict = "Barpeta",
        currentCityState = "Hyderabad, Telangana",
        willingToRelocate = true,
        skills = listOf("Mason / Rajmistri", "Tile Work", "Plastering"),
        experienceYears = 6,
        jobPreference = JobType.DAILY,
        badgeLevel = BadgeLevel.GOLD,
        verifiedWorkdays = 64,
        completedJobs = 58,
        rating = 4.7,
        memberMonths = 14,
        emergencyContactName = "Bimala Das (Mother)",
        emergencyContactPhoneMasked = "+91 97••••1120",
        emergencyConsentGiven = true,
        faceRegistrationCaptured = true,
        isOwnerAccount = false
    )

    val demoEmployerProfile = UserProfile(
        loboroId = "LB3232",
        role = UserRole.EMPLOYER,
        fullName = "Sri Sai Builders & Infra (Demo Employer)",
        mobileMasked = "+91 90••••8899",
        homeState = "Telangana",
        homeDistrict = "Hyderabad",
        currentCityState = "Hyderabad, Telangana",
        willingToRelocate = false,
        skills = listOf("Civil Construction", "Commercial Masonry"),
        experienceYears = 11,
        jobPreference = JobType.DAILY,
        badgeLevel = BadgeLevel.DIAMOND,
        verifiedWorkdays = 420,
        completedJobs = 142,
        rating = 4.8,
        memberMonths = 22,
        emergencyContactName = "Site Manager Office",
        emergencyContactPhoneMasked = "+91 40••••2200",
        emergencyConsentGiven = true,
        faceRegistrationCaptured = true,
        isOwnerAccount = false
    )

    private val job101Titles = mapOf(
        SupportedLanguage.ENGLISH to "Senior Mason / Rajmistri for Apartment Plastering",
        SupportedLanguage.HINDI to "अपार्टमेंट प्लास्टर के लिए अनुभवी राजमिस्त्री",
        SupportedLanguage.GUJARATI to "એપાર્ટમેન્ટ પ્લાસ્ટર માટે અનુભવી કડિયો",
        SupportedLanguage.MARATHI to "अपार्टमेंट प्लास्टरिंगसाठी अनुभवी गवंडी",
        SupportedLanguage.TELUGU to "అపార్ట్‌మెంట్ ప్లాస్టరింగ్ కోసం అనుభవజ్ఞుడైన మేస్త్రీ",
        SupportedLanguage.TAMIL to "அடுக்குமாடி பூச்சு வேலைக்கு அனுபவ கொத்தனார்",
        SupportedLanguage.BENGALI to "অ্যাপার্টমেন্ট প্লাস্টারিংয়ের জন্য অভিজ্ঞ রাজমিস্ত্রি",
        SupportedLanguage.ASSAMESE to "এপাৰ্টমেণ্ট প্লাষ্টাৰৰ বাবে অভিজ্ঞ ৰাজমিস্ত্ৰী",
        SupportedLanguage.KANNADA to "ಅಪಾರ್ಟ್‌ಮೆಂಟ್ ಪ್ಲಾಸ್ಟರಿಂಗ್‌ಗಾಗಿ ಅನುಭವಿ ಮೇಸ್ತ್ರಿ",
        SupportedLanguage.MALAYALAM to "അപ്പാർട്ട്മെന്റ് പ്ലാസ്റ്ററിംഗിനായി പരിചയസമ്പന്നനായ മേസ്തിരി",
        SupportedLanguage.PUNJABI to "ਅਪਾਰਟਮੈਂਟ ਪਲਾਸਟਰ ਲਈ ਤਜਰਬੇਕਾਰ ਰਾਜਮਿਸਤਰੀ",
        SupportedLanguage.ODIA to "ଆପାର୍ଟମେଣ୍ଟ ପ୍ଲାଷ୍ଟର ପାଇଁ ଅଭିଜ୍ଞ ରାଜମିସ୍ତ୍ରୀ"
    )

    private val job101Descs = mapOf(
        SupportedLanguage.ENGLISH to "Need 6 experienced Masons for brick & wall plastering near Gachibowli. Tools provided on site. Water and tea arranged.",
        SupportedLanguage.HINDI to "गाचीबोवली के पास ईंट और दीवार प्लास्टर के लिए 6 अनुभवी राजमिस्त्री चाहिए। औजार साइट पर मिलेंगे। पानी व चाय की व्यवस्था है।",
        SupportedLanguage.GUJARATI to "ગચીબોવલી નજીક ઈંટ અને દિવાલ પ્લાસ્ટર માટે 6 અનુભવી કડિયા જોઈએ છે. સાધનો, પાણી અને ચા સાઇટ પર મળશે.",
        SupportedLanguage.MARATHI to "गाचीबोवलीजवळ वीटकाम आणि भिंत प्लास्टरिंगसाठी 6 अनुभवी गवंडी हवे आहेत. साहित्य, पाणी आणि चहाची सोय आहे.",
        SupportedLanguage.TELUGU to "గచ్చిబౌలి వద్ద ఇటుక మరియు గోడ ప్లాస్టరింగ్ కోసం 6 మంది అనుభవజ్ఞులైన మేస్త్రీలు అవసరం. పనిముట్లు, నీరు మరియు టీ సైట్‌లో ఏర్పాటు చేస్తారు.",
        SupportedLanguage.TAMIL to "கச்சிபௌலி அருகே செங்கல் மற்றும் சுவர் பூச்சு வேலைக்கு 6 அனுபவ கொத்தனார்கள் தேவை. கருவிகள், குடிநீர் மற்றும் தேநீர் வழங்கப்படும்.",
        SupportedLanguage.BENGALI to "গাচিবৌলির কাছে ইট ও দেয়াল প্লাস্টারিংয়ের জন্য ৬ জন অভিজ্ঞ রাজমিস্ত্রি প্রয়োজন। সাইটে যন্ত্রপাতি, জল ও চায়ের ব্যবস্থা আছে।",
        SupportedLanguage.ASSAMESE to "গাচিবৌলিৰ ওচৰত ইটা আৰু বেৰ প্লাষ্টাৰৰ বাবে ৬ জন অভিজ্ঞ ৰাজমিস্ত্ৰী লাগে। কামৰ সঁজুলি, খোৱা পানী আৰু চাহৰ ব্যৱস্থা আছে।",
        SupportedLanguage.KANNADA to "ಗಚಿಬೌಲಿ ಬಳಿ ಇಟ್ಟಿಗೆ ಮತ್ತು ಗೋಡೆ ಪ್ಲಾಸ್ಟರಿಂಗ್‌ಗಾಗಿ 6 ಅನುಭವಿ ಮೇಸ್ತ್ರಿಗಳು ಬೇಕು. ಸಲಕರಣೆ, ಕುಡಿಯುವ ನೀರು ಮತ್ತು ಚಹಾ ವ್ಯವಸ್ಥೆ ಇದೆ.",
        SupportedLanguage.MALAYALAM to "ഗച്ചിബൗളിക്ക് സമീപം കല്ല്, ചുമർ പ്ലാസ്റ്ററിംഗിനായി 6 പരിചയസമ്പന്നരായ മേസ്തിരിമാരെ ആവശ്യമുണ്ട്. ഉപകരണങ്ങളും വെള്ളവും ചായയും സൈറ്റിൽ ലഭിക്കും.",
        SupportedLanguage.PUNJABI to "ਗਚੀਬੋਵਲੀ ਨੇੜੇ ਇੱਟਾਂ ਅਤੇ ਕੰਧ ਪਲਾਸਟਰ ਲਈ 6 ਤਜਰਬੇਕਾਰ ਰਾਜਮਿਸਤਰੀ ਚਾਹੀਦੇ ਹਨ। ਔਜ਼ਾਰ, ਪਾਣੀ ਅਤੇ ਚਾਹ ਸਾਈਟ 'ਤੇ ਮਿਲਣਗੇ।",
        SupportedLanguage.ODIA to "ଗାଚିବୌଲି ନିକଟରେ ଇଟା ଓ କାନ୍ଥ ପ୍ଲାଷ୍ଟର ପାଇଁ ୬ ଜଣ ଅଭିଜ୍ଞ ରାଜମିସ୍ତ୍ରୀ ଆବଶ୍ୟକ। ସାଇଟ୍‌ରେ ଯନ୍ତ୍ରପାତି, ପାଣି ଓ ଚା’ ବ୍ୟବସ୍ଥା ଅଛି।"
    )

    private val job102Titles = mapOf(
        SupportedLanguage.ENGLISH to "Commercial Site Electrician (Wiring & Panel)",
        SupportedLanguage.HINDI to "कमर्शियल साइट इलेक्ट्रीशियन (वायरिंग और पैनल)",
        SupportedLanguage.GUJARATI to "કોમર્શિયલ સાઇટ ઇલેક્ટ્રિશિયન (વાયરિંગ અને પેનલ)",
        SupportedLanguage.MARATHI to "कमर्शियल साईट इलेक्ट्रिशियन (वायरिंग आणि पॅनेल)",
        SupportedLanguage.TELUGU to "కమర్షియల్ సైట్ ఎలక్ట్రీషియన్ (వైరింగ్ & ప్యానెల్)",
        SupportedLanguage.TAMIL to "வணிக தள எலக்ட்ரீஷியன் (வயரிங் & பேனல்)",
        SupportedLanguage.BENGALI to "কমার্শিয়াল সাইট ইলেকট্রিশিয়ান (ওয়্যারিং ও প্যানেল)",
        SupportedLanguage.ASSAMESE to "কমাৰ্চিয়েল ছাইট ইলেক্ট্ৰিচিয়ান (ৱায়াৰিং আৰু পেনেল)",
        SupportedLanguage.KANNADA to "ಕಮರ್ಷಿಯಲ್ ಸೈಟ್ ಎಲೆಕ್ಟ್ರಿಷಿಯನ್ (ವೈರಿಂಗ್ ಮತ್ತು ಪ್ಯಾನಲ್)",
        SupportedLanguage.MALAYALAM to "കൊമേഴ്സ്യൽ സൈറ്റ് ഇലക്ട്രീഷ്യൻ (വയറിംഗ് & പാനൽ)",
        SupportedLanguage.PUNJABI to "ਕਮਰਸ਼ੀਅਲ ਸਾਈਟ ਇਲੈਕਟ੍ਰੀਸ਼ੀਅਨ (ਵਾਇਰਿੰਗ ਅਤੇ ਪੈਨਲ)",
        SupportedLanguage.ODIA to "କମର୍ସିଆଲ୍ ସାଇଟ୍ ଇଲେକ୍ଟ୍ରିସିଆନ୍ (ୱାୟାରିଂ ଓ ପ୍ୟାନେଲ୍)"
    )

    private val job102Descs = mapOf(
        SupportedLanguage.ENGLISH to "Conduit wiring and distribution box fitting in Hinjewadi Phase 2. Safety helmet and boots provided.",
        SupportedLanguage.HINDI to "हिंजेवाड़ी फेज 2 में वायरिंग और पैनल फिटिंग का काम। सेफ्टी हेलमेट और जूते मिलेंगे।",
        SupportedLanguage.GUJARATI to "હિંજેવાડી ફેઝ 2 માં વાયરિંગ અને ડિસ્ટ્રિબ્યુશન બોક્સ ફિટિંગનું કામ. સેફ્ટી હેલ્મેટ અને બૂટ મળશે.",
        SupportedLanguage.MARATHI to "हिंजवडी फेज २ मध्ये वायरिंग आणि पॅनेल फिटिंगचे काम. सेफ्टी हेल्मेट आणि बूट दिले जातील.",
        SupportedLanguage.TELUGU to "హింజేవాడి ఫేజ్ 2 లో వైరింగ్ మరియు డిస్ట్రిబ్యూషన్ బాక్స్ ఫిట్టింగ్ పని. సేఫ్టీ హెల్మెట్ మరియు బూట్లు ఇవ్వబడతాయి.",
        SupportedLanguage.TAMIL to "ஹிஞ்சேவாடி பேஸ் 2 இல் வயரிங் மற்றும் பேனல் பொருத்தும் வேலை. பாதுகாப்பு ஹெல்மெட் மற்றும் காலணி வழங்கப்படும்.",
        SupportedLanguage.BENGALI to "হিঞ্জেওয়াড়ি ফেজ ২-এ ওয়্যারিং এবং ডিস্ট্রিবিউশন বক্স ফিটিংয়ের কাজ। সেফটি হেলমেট ও বুট দেওয়া হবে।",
        SupportedLanguage.ASSAMESE to "হিনজেৱাডী ফেজ ২ ত ৱায়াৰিং আৰু পেনেল ফিটিঙৰ কাম। সুৰক্ষা হেলমেট আৰু জোতা দিয়া হ'ব।",
        SupportedLanguage.KANNADA to "ಹಿಂಜೆವಾಡಿ ಫೇಸ್ 2 ರಲ್ಲಿ ವೈರಿಂಗ್ ಮತ್ತು ಪ್ಯಾನಲ್ ಫಿಟ್ಟಿಂಗ್ ಕೆಲಸ. ಸುರಕ್ಷತಾ ಹೆಲ್ಮೆಟ್ ಮತ್ತು ಬೂಟುಗಳನ್ನು ನೀಡಲಾಗುತ್ತದೆ.",
        SupportedLanguage.MALAYALAM to "ഹിഞ്ചേവാഡി ഫേസ് 2-ൽ വയറിംഗ് & ഡിസ്ട്രിബ്യൂഷൻ ബോക്സ് ഫിറ്റിംഗ് ജോലി. സേഫ്റ്റി ഹെൽമെറ്റും ബൂട്ടും നൽകും.",
        SupportedLanguage.PUNJABI to "ਹਿੰਜੇਵਾੜੀ ਫੇਜ਼ 2 ਵਿੱਚ ਵਾਇਰਿੰਗ ਅਤੇ ਪੈਨਲ ਫਿਟਿੰਗ ਦਾ ਕੰਮ। ਸੇਫਟੀ ਹੈਲਮੇਟ ਅਤੇ ਬੂਟ ਦਿੱਤੇ ਜਾਣਗੇ।",
        SupportedLanguage.ODIA to "ହିଞ୍ଜେୱାଡ଼ି ଫେଜ୍ ୨ ରେ ୱାୟାରିଂ ଓ ପ୍ୟାନେଲ୍ ଫିଟିଂ କାମ। ସେଫ୍ଟି ହେଲମେଟ୍ ଓ ଜୋତା ଯୋଗାଇ ଦିଆଯିବ।"
    )

    private val job103Titles = mapOf(
        SupportedLanguage.ENGLISH to "Construction Helper & Material Shifting",
        SupportedLanguage.HINDI to "निर्माण सहायक और सामग्री शिफ्टिंग",
        SupportedLanguage.GUJARATI to "બાંધકામ હેલ્પર અને સામાન હેરફેર",
        SupportedLanguage.MARATHI to "बांधकाम मदतनीस आणि साहित्य हलवण्याचे काम",
        SupportedLanguage.TELUGU to "నిర్మాణ సహాయకుడు & సామాగ్రి తరలింపు",
        SupportedLanguage.TAMIL to "கட்டுமான உதவியாளர் & பொருள் நகர்த்தும் பணி",
        SupportedLanguage.BENGALI to "নির্মাণ সহায়ক ও সামগ্রী স্থানান্তর কাজ",
        SupportedLanguage.ASSAMESE to "নিৰ্মাণ সহায়ক আৰু সামগ্ৰী কঢ়িওৱা কাম",
        SupportedLanguage.KANNADA to "ನಿರ್ಮಾಣ ಸಹಾಯಕ ಮತ್ತು ಸಾಮಗ್ರಿ ಸಾಗಣೆ ಕೆಲಸ",
        SupportedLanguage.MALAYALAM to "നിർമ്മാണ സഹായി & മെറ്റീരിയൽ ഷിഫ്റ്റിംഗ്",
        SupportedLanguage.PUNJABI to "ਉਸਾਰੀ ਸਹਾਇਕ ਅਤੇ ਸਾਮਾਨ ਢੋਆ-ਢੁਆਈ",
        SupportedLanguage.ODIA to "ନିର୍ମାଣ ସହାୟକ ଓ ସାମଗ୍ରୀ ସ୍ଥାନାନ୍ତର କାମ"
    )

    private val job103Descs = mapOf(
        SupportedLanguage.ENGLISH to "Out-of-state workers welcome. Safe shared room with fan and drinking water available near site.",
        SupportedLanguage.HINDI to "दूसरे राज्य के मज़दूरों का स्वागत है। साइट के पास पंखे और पीने के पानी वाला सुरक्षित कमरा उपलब्ध है।",
        SupportedLanguage.GUJARATI to "અન્ય રાજ્યના કામદારોનું સ્વાગત છે. સાઇટ નજીક પંખા અને પીવાના પાણી સાથે સુરક્ષિત રૂમ ઉપલબ્ધ છે.",
        SupportedLanguage.MARATHI to "परराज्यातील कामगारांचे स्वागत आहे. कामाच्या जागेजवळ पंखा व पिण्याच्या पाण्यासह सुरक्षित खोली उपलब्ध आहे.",
        SupportedLanguage.TELUGU to "ఇతర రాష్ట్రాల కార్మికులకు స్వాగతం. సైట్ దగ్గర ఫ్యాన్ మరియు త్రాగునీటితో సురక్షిత గది అందుబాటులో ఉంది.",
        SupportedLanguage.TAMIL to "வெளிமாநில தொழிலாளர்கள் வரவேற்கப்படுகிறார்கள். தளத்திற்கு அருகே மின்விசிறி மற்றும் குடிநீருடன் பாதுகாப்பான அறை உள்ளது.",
        SupportedLanguage.BENGALI to "অন্য রাজ্যের কর্মীদের স্বাগতম। সাইটের কাছে পাখা ও পানীয় জলসহ নিরাপদ ঘরের ব্যবস্থা আছে।",
        SupportedLanguage.ASSAMESE to "আন ৰাজ্যৰ শ্ৰমিকসকলক স্বাগতম। কামৰ ওচৰত ফেন আৰু খোৱা পানীৰ সৈতে সুৰক্ষিত কোঠা আছে।",
        SupportedLanguage.KANNADA to "ಹೊರರಾಜ್ಯದ ಕಾರ್ಮಿಕರಿಗೆ ಸ್ವಾಗತ. ಸೈಟ್ ಬಳಿ ಫ್ಯಾನ್ ಮತ್ತು ಕುಡಿಯುವ ನೀರಿನೊಂದಿಗೆ ಸುರಕ್ಷಿತ ಕೊಠಡಿ ಲಭ್ಯವಿದೆ.",
        SupportedLanguage.MALAYALAM to "അന്യസംസ്ഥാന തൊഴിലാളികൾക്ക് സ്വാഗതം. സൈറ്റിനടുത്ത് ഫാനും കുടിവെള്ളവുമുള്ള സുരക്ഷിത മുറി ലഭ്യമാണ്.",
        SupportedLanguage.PUNJABI to "ਹੋਰ ਰਾਜਾਂ ਦੇ ਮਜ਼ਦੂਰਾਂ ਦਾ ਸਵਾਗਤ ਹੈ। ਸਾਈਟ ਨੇੜੇ ਪੱਖੇ ਅਤੇ ਪੀਣ ਵਾਲੇ ਪਾਣੀ ਵਾਲਾ ਸੁਰੱਖਿਅਤ ਕਮਰਾ ਉਪਲਬਧ ਹੈ।",
        SupportedLanguage.ODIA to "ଅନ୍ୟ ରାଜ୍ୟର ଶ୍ରମିକଙ୍କୁ ସ୍ୱାଗତ। ସାଇଟ୍ ନିକଟରେ ପଙ୍ଖା ଓ ପାନୀୟ ଜଳ ସହ ସୁରକ୍ଷିତ କୋଠରୀ ଉପଲବ୍ଧ।"
    )

    private val job201Titles = mapOf(
        SupportedLanguage.ENGLISH to "South & North Indian Hotel Cook (Monthly)",
        SupportedLanguage.HINDI to "दक्षिण व उत्तर भारतीय होटल रसोइया (मासिक)",
        SupportedLanguage.GUJARATI to "દક્ષિણ અને ઉત્તર ભારતીય હોટેલ રસોઈયો (માસિક)",
        SupportedLanguage.MARATHI to "दक्षिण व उत्तर भारतीय हॉटेल स्वयंपाकी (मासिक)",
        SupportedLanguage.TELUGU to "సౌత్ & నార్త్ ఇండియన్ హోటల్ వంటవారు (నెలవారీ)",
        SupportedLanguage.TAMIL to "தென் & வட இந்திய ஹோட்டல் சமையல்காரர் (மாத சம்பளம்)",
        SupportedLanguage.BENGALI to "হোটেল রাঁধুনি - দক্ষিণ ও উত্তর ভারতীয় খাবার (মাসিক)",
        SupportedLanguage.ASSAMESE to "হোটেল ৰান্ধনী - দক্ষিণ আৰু উত্তৰ ভাৰতীয় খাদ্য (মাহিলী)",
        SupportedLanguage.KANNADA to "ಹೋಟೆಲ್ ಅಡುಗೆಯವರು - ದಕ್ಷಿಣ ಮತ್ತು ಉತ್ತರ ಭಾರತೀಯ (ತಿಂಗಳ ಸಂಬಳ)",
        SupportedLanguage.MALAYALAM to "ഹോട്ടൽ പാചകക്കാരൻ - സൗത്ത് & നോർത്ത് ഇന്ത്യൻ (മാസശമ്പളം)",
        SupportedLanguage.PUNJABI to "ਹੋਟਲ ਰਸੋਈਆ - ਦੱਖਣੀ ਅਤੇ ਉੱਤਰੀ ਭਾਰਤੀ (ਮਹੀਨਾਵਾਰ)",
        SupportedLanguage.ODIA to "ହୋଟେଲ୍ ରୋଷେୟା - ଦକ୍ଷିଣ ଓ ଉତ୍ତର ଭାରତୀୟ (ମାସିକ)"
    )

    private val job201Descs = mapOf(
        SupportedLanguage.ENGLISH to "Clean family restaurant in T. Nagar, Chennai. Free 3 meals daily and clean staff quarters provided.",
        SupportedLanguage.HINDI to "चेन्नई के टी. नगर में स्वच्छ फैमिली होटल। रोज़ 3 समय का मुफ्त खाना और साफ स्टाफ कमरा उपलब्ध है।",
        SupportedLanguage.GUJARATI to "ચેન્નાઈના ટી. નગરમાં સ્વચ્છ ફેમિલી રેસ્ટોરન્ટ. દરરોજ 3 ટંકનું મફત ભોજન અને રહેવા માટે સ્વચ્છ ક્વાર્ટર્સ.",
        SupportedLanguage.MARATHI to "चेन्नईच्या टी. नगरमध्ये स्वच्छ फॅमिली हॉटेल. दररोज 3 वेळा मोफत जेवण आणि स्वच्छ राहण्याची सोय.",
        SupportedLanguage.TELUGU to "చెన్నై టి. నగర్‌లోని శుభ్రమైన ఫ్యామిలీ హోటల్. రోజుకు 3 పూటలా ఉచిత భోజనం మరియు శుభ్రమైన వసతి కల్పిస్తారు.",
        SupportedLanguage.TAMIL to "சென்னை தி. நகரில் உள்ள குடும்ப உணவகம். தினமும் 3 வேளை இலவச உணவு மற்றும் சுத்தமான தங்கும் அறை வழங்கப்படும்.",
        SupportedLanguage.BENGALI to "চেন্নাইয়ের টি. নগরে পরিচ্ছন্ন পারিবারিক রেস্তোরাঁ। প্রতিদিন ৩ বেলা বিনামূল্যে খাবার ও থাকার ঘর দেওয়া হবে।",
        SupportedLanguage.ASSAMESE to "চেন্নাইৰ টি. নগৰৰ পৰিষ্কাৰ পৰিয়াল হোটেল। দৈনিক ৩ সাজ বিনামূলীয়া খাদ্য আৰু চাফা থকা কোঠা দিয়া হ'ব।",
        SupportedLanguage.KANNADA to "ಚೆನ್ನೈನ ಟಿ. ನಗರದಲ್ಲಿ ಸ್ವಚ್ಛ ಫ್ಯಾಮಿಲಿ ರೆಸ್ಟೋರೆಂಟ್. ಪ್ರತಿದಿನ 3 ಹೊತ್ತು ಉಚಿತ ಊಟ ಮತ್ತು ಸ್ವಚ್ಛ ಸಿಬ್ಬಂದಿ ವಸತಿ.",
        SupportedLanguage.MALAYALAM to "ചെന്നൈ ടി. നഗറിലെ വൃത്തിയുള്ള ഫാമിലി റെസ്റ്റോറന്റ്. ദിവസവും 3 നേരം സൗജന്യ ഭക്ഷണവും താമസസൗകര്യവും.",
        SupportedLanguage.PUNJABI to "ਚੇਨਈ ਦੇ ਟੀ. ਨਗਰ ਵਿੱਚ ਸਾਫ਼-ਸੁਥਰਾ ਫੈਮਿਲੀ ਰੈਸਟੋਰੈਂਟ। ਰੋਜ਼ 3 ਵਕਤ ਮੁਫ਼ਤ ਖਾਣਾ ਅਤੇ ਸਾਫ਼ ਰਿਹਾਇਸ਼।",
        SupportedLanguage.ODIA to "ଚେନ୍ନାଇ ଟି. ନଗରରେ ପରିଷ୍କାର ଫ୍ୟାମିଲି ରେଷ୍ଟୁରାଣ୍ଟ। ଦୈନିକ ୩ ଓଳା ମାଗଣା ଖାଦ୍ୟ ଓ ସଫା ରହିବା ଘର।"
    )

    private val job202Titles = mapOf(
        SupportedLanguage.ENGLISH to "Commercial Light Vehicle Driver (Monthly)",
        SupportedLanguage.HINDI to "कमर्शियल लाइट वाहन ड्राइवर (मासिक वेतन)",
        SupportedLanguage.GUJARATI to "કોમર્શિયલ લાઇટ વાહન ડ્રાઈવર (માસિક પગાર)",
        SupportedLanguage.MARATHI to "कमर्शियल लाइट वाहन ड्रायव्हर (मासिक पगार)",
        SupportedLanguage.TELUGU to "లైట్ కమర్షియల్ వాహన డ్రైవర్ (నెలవారీ జీతం)",
        SupportedLanguage.TAMIL to "வணிக இலகுரக வாகன ஓட்டுநர் (மாத சம்பளம்)",
        SupportedLanguage.BENGALI to "কমার্শিয়াল লাইট গাড়ি ড্রাইভার (মাসিক বেতন)",
        SupportedLanguage.ASSAMESE to "কমাৰ্চিয়েল লাইট বাহন ড্ৰাইভাৰ (মাহিলী দৰমহা)",
        SupportedLanguage.KANNADA to "ಲಘು ವಾಣಿಜ್ಯ ವಾಹನ ಡ್ರೈವರ್ (ತಿಂಗಳ ಸಂಬಳ)",
        SupportedLanguage.MALAYALAM to "കൊമേഴ്സ്യൽ ലൈറ്റ് വാഹന ഡ്രൈവർ (മാസശമ്പളം)",
        SupportedLanguage.PUNJABI to "ਕਮਰਸ਼ੀਅਲ ਲਾਈਟ ਵਾਹਨ ਡਰਾਈਵਰ (ਮਹੀਨਾਵਾਰ ਤਨਖਾਹ)",
        SupportedLanguage.ODIA to "କମର୍ସିଆଲ୍ ଲାଇଟ୍ ଗାଡ଼ି ଡ୍ରাইଭର୍ (ମାସିକ ଦରମା)"
    )

    private val job202Descs = mapOf(
        SupportedLanguage.ENGLISH to "Delivery van route between Vijayawada and Guntur. Valid LMV/Transport license required.",
        SupportedLanguage.HINDI to "विजयवाड़ा और गुंटूर के बीच डिलीवरी वैन रूट। वैध ड्राइविंग लाइसेंस आवश्यक।",
        SupportedLanguage.GUJARATI to "વિજયવાડા અને ગુંટુર વચ્ચે ડિલિવરી વાન રૂટ. માન્ય LMV/ટ્રાન્સપોર્ટ લાઇસન્સ જરૂરી છે.",
        SupportedLanguage.MARATHI to "विजयवाडा ते गुंटूर दरम्यान डिलिव्हरी व्हॅन मार्ग. वैध LMV/ट्रान्सपोर्ट परवाना आवश्यक.",
        SupportedLanguage.TELUGU to "విజయవాడ మరియు గుంటూరు మధ్య డెలివరీ వ్యాన్ రూట్. చెల్లుబాటు అయ్యే LMV/ట్రాన్స్‌పోర్ట్ లైసెన్స్ అవసరం.",
        SupportedLanguage.TAMIL to "விஜயவாடா மற்றும் குண்டூர் இடையே டெலிவரி வேன் ஓட்டும் பணி. செல்லுபடியாகும் LMV உரிமம் தேவை.",
        SupportedLanguage.BENGALI to "বিজয়ওয়াড়া থেকে গুন্টুর ডেলিভারি ভ্যান রুট। বৈধ LMV/ট্রান্সপোর্ট ড্রাইভিং লাইসেন্স আবশ্যক।",
        SupportedLanguage.ASSAMESE to "বিজয়ৱাড়া আৰু গুণ্টুৰৰ মাজত ডেলিভাৰী ভেন পথ। বৈধ LMV/ট্ৰান্সপ'ৰ্ট অনুজ্ঞাপত্ৰ আৱশ্যক।",
        SupportedLanguage.KANNADA to "ವಿಜಯವಾಡ ಮತ್ತು ಗುಂಟೂರು ನಡುವೆ ಡೆಲಿವರಿ ವ್ಯಾನ್ ಮಾರ್ಗ. ಮಾನ್ಯ LMV/ಟ್ರಾನ್ಸ್‌ಪೋರ್ಟ್ ಪರವಾನಗಿ ಅಗತ್ಯವಿದೆ.",
        SupportedLanguage.MALAYALAM to "വിജയവാഡയ്ക്കും ഗുണ്ടൂരിനും ഇടയിൽ ഡെലിവറി വാൻ റൂട്ട്. സാധുവായ LMV/ട്രാൻസ്‌പോർട്ട് ലൈസൻസ് ആവശ്യമാണ്.",
        SupportedLanguage.PUNJABI to "ਵਿਜੇਵਾੜਾ ਅਤੇ ਗੁੰਟੂਰ ਵਿਚਕਾਰ ਡਿਲੀਵਰੀ ਵੈਨ ਰੂਟ। ਵੈਧ LMV/ਟ੍ਰਾਂਸਪੋਰਟ ਲਾਇਸੈਂਸ ਲੋੜੀਂਦਾ ਹੈ।",
        SupportedLanguage.ODIA to "ବିଜୟୱାଡ଼ା ଓ ଗୁଣ୍ଟୁର ମଧ୍ୟରେ ଡେଲିଭରି ଭ୍ୟାନ୍ ରୁଟ୍। ବୈଧ LMV/ଟ୍ରାନ୍ସପୋର୍ଟ ଲାଇସେନ୍ସ ଆବଶ୍ୟକ।"
    )

    private val job203Titles = mapOf(
        SupportedLanguage.ENGLISH to "Textile Packing & Machine Helper (Monthly)",
        SupportedLanguage.HINDI to "टेक्सटाइल पैकिंग और मशीन हेल्पर (मासिक)",
        SupportedLanguage.GUJARATI to "ટેક્સટાઇલ પેકિંગ અને મશીન હેલ્પર (માસિક)",
        SupportedLanguage.MARATHI to "टेक्सटाईल पॅकिंग आणि मशीन मदतनीस (मासिक)",
        SupportedLanguage.TELUGU to "టెక్స్‌టైల్ ప్యాకింగ్ & మెషిన్ హెల్పర్ (నెలవారీ)",
        SupportedLanguage.TAMIL to "துணி பேக்கிங் & இயந்திர உதவியாளர் (மாத சம்பளம்)",
        SupportedLanguage.BENGALI to "টেক্সটাইল প্যাকিং ও মেশিন হেল্পার (মাসিক)",
        SupportedLanguage.ASSAMESE to "টেক্সটাইল পেকিং আৰু মেচিন হেল্পাৰ (মাহিলী)",
        SupportedLanguage.KANNADA to "ಜವಳಿ ಪ್ಯಾಕಿಂಗ್ ಮತ್ತು ಮೆಷಿನ್ ಸಹಾಯಕ (ತಿಂಗಳ ಸಂಬಳ)",
        SupportedLanguage.MALAYALAM to "ടെക്സ്റ്റൈൽ പാക്കിംഗ് & മെഷീൻ ഹെൽപ്പർ (മാസശമ്പളം)",
        SupportedLanguage.PUNJABI to "ਟੈਕਸਟਾਈਲ ਪੈਕਿੰਗ ਅਤੇ ਮਸ਼ੀਨ ਹੈਲਪਰ (ਮਹੀਨਾਵਾਰ)",
        SupportedLanguage.ODIA to "ଟେକ୍ସଟାଇଲ୍ ପ୍ୟାକିଂ ଓ ମେସିନ୍ ହେଲ୍ପର୍ (ମାସିକ)"
    )

    private val job203Descs = mapOf(
        SupportedLanguage.ENGLISH to "Modern textile unit in Surat. Out-of-state teams from Bihar, UP, Assam, and Odisha welcome. Hostel accommodation included.",
        SupportedLanguage.HINDI to "सूरत की आधुनिक टेक्सटाइल यूनिट। बिहार, यूपी, असम व ओडिशा के कामगारों का स्वागत है। हॉस्टल सुविधा उपलब्ध है।",
        SupportedLanguage.GUJARATI to "સુરતની આધુનિક ટેક્સટાઇલ યુનિટ. બિહાર, યુપી, આસામ અને ઓડિશાની ટીમોનું સ્વાગત છે. હોસ્ટેલ સુવિધા સામેલ છે.",
        SupportedLanguage.MARATHI to "सुरत येथील आधुनिक टेक्सटाईल युनिट. बिहार, यूपी, आसाम आणि ओडिशातील कामगारांचे स्वागत. हॉस्टेल निवास सुविधा.",
        SupportedLanguage.TELUGU to "సూరత్‌లోని ఆధునిక టెక్స్‌టైల్ యూనిట్. బీహార్, యూపీ, అస్సాం, ఒడిశా కార్మికులకు స్వాగతం. హాస్టల్ వసతి ఉంది.",
        SupportedLanguage.TAMIL to "சூரத்தில் உள்ள நவீன ஜவுளி ஆலை. பீகார், உ.பி, அசாம், ஒடிசா தொழிலாளர்கள் வரவேற்கப்படுகிறார்கள். விடுதி வசதி உண்டு.",
        SupportedLanguage.BENGALI to "সুরাটের আধুনিক টেক্সটাইল ইউনিট। বিহার, ইউপি, আসাম ও ওড়িশার কর্মীদের স্বাগতম। হোস্টেল থাকার ব্যবস্থা রয়েছে।",
        SupportedLanguage.ASSAMESE to "চুৰাটৰ আধুনিক টেক্সটাইল ইউনিট। বিহাৰ, ইউপি, অসম আৰু ওড়িশাৰ শ্ৰমিকক স্বাগতম। হোষ্টেল থকা ব্যৱস্থা আছে।",
        SupportedLanguage.KANNADA to "ಸೂರತ್‌ನ ಆಧುನಿಕ ಜವಳಿ ಘಟಕ. ಬಿಹಾರ, ಯುಪಿ, ಅಸ್ಸಾಂ ಮತ್ತು ಒಡಿಶಾದ ತಂಡಗಳಿಗೆ ಸ್ವಾಗತ. ಹಾಸ್ಟೆಲ್ ವಸತಿ ಸೇರಿದೆ.",
        SupportedLanguage.MALAYALAM to "സൂറത്തിലെ ആധുനിക ടെക്സ്റ്റൈൽ യൂണിറ്റ്. ബീഹാർ, യുപി, അസം, ഒഡീഷ എന്നിവിടങ്ങളിൽ നിന്നുള്ളവർക്ക് സ്വാഗതം. ഹോസ്റ്റൽ സൗകര്യം ഉൾപ്പെടുന്നു.",
        SupportedLanguage.PUNJABI to "ਸੂਰਤ ਦੀ ਆਧੁਨਿਕ ਟੈਕਸਟਾਈਲ ਯੂਨਿਟ। ਬਿਹਾਰ, ਯੂਪੀ, ਅਸਾਮ ਅਤੇ ਉੜੀਸਾ ਦੀਆਂ ਟੀਮਾਂ ਦਾ ਸਵਾਗਤ ਹੈ। ਹੋਸਟਲ ਰਿਹਾਇਸ਼ ਸ਼ਾਮਲ ਹੈ।",
        SupportedLanguage.ODIA to "ସୁରଟର ଆଧୁନିକ ଟେକ୍ସଟାଇଲ୍ ୟୁନିଟ୍। ବିହାର, ୟୁପି, ଆସାମ ଓ ଓଡ଼ିଶାର ଶ୍ରମିକଙ୍କୁ ସ୍ୱାଗତ। ହଷ୍ଟେଲ୍ ରହିବା ସୁବିଧା ଅଛି।"
    )

    val demoJobs: List<JobListing> = listOf(
        JobListing(
            id = "JOB-D-101",
            title = job101Titles.getValue(SupportedLanguage.ENGLISH),
            originalLanguage = SupportedLanguage.TELUGU,
            localizedTitles = job101Titles,
            description = job101Descs.getValue(SupportedLanguage.ENGLISH),
            localizedDescriptions = job101Descs,
            jobType = JobType.DAILY,
            category = JobCategoryId.MASON,
            wageOrSalaryInr = 950,
            state = "Telangana",
            district = "Rangareddy",
            city = "Hyderabad",
            distanceKm = 4,
            workHours = "8:30 AM – 5:30 PM (1 hr lunch)",
            workersRequired = 6,
            foodProvided = true,
            accommodationProvided = true,
            overtimeDetails = "₹140/hr extra after 5:30 PM",
            paymentFrequency = "Paid daily every evening",
            requiredSkills = listOf("Bricklaying", "Wall Plastering"),
            employerLoboroId = "LB3232",
            employerName = "Sri Sai Builders",
            employerBadge = BadgeLevel.DIAMOND,
            employerRating = 4.8,
            expiryLabel = "4 days"
        ),
        JobListing(
            id = "JOB-D-102",
            title = job102Titles.getValue(SupportedLanguage.ENGLISH),
            originalLanguage = SupportedLanguage.MARATHI,
            localizedTitles = job102Titles,
            description = job102Descs.getValue(SupportedLanguage.ENGLISH),
            localizedDescriptions = job102Descs,
            jobType = JobType.DAILY,
            category = JobCategoryId.ELECTRICIAN,
            wageOrSalaryInr = 850,
            state = "Maharashtra",
            district = "Pune",
            city = "Pune",
            distanceKm = 12,
            workHours = "9:00 AM – 6:00 PM",
            workersRequired = 4,
            foodProvided = false,
            accommodationProvided = true,
            overtimeDetails = "₹120/hr overtime",
            paymentFrequency = "Daily UPI / Cash option",
            requiredSkills = listOf("3-Phase Wiring", "MCB Panel"),
            employerLoboroId = "LB418",
            employerName = "Deccan Electro Works",
            employerBadge = BadgeLevel.GOLD,
            employerRating = 4.5,
            expiryLabel = "2 days"
        ),
        JobListing(
            id = "JOB-D-103",
            title = job103Titles.getValue(SupportedLanguage.ENGLISH),
            originalLanguage = SupportedLanguage.ENGLISH,
            localizedTitles = job103Titles,
            description = job103Descs.getValue(SupportedLanguage.ENGLISH),
            localizedDescriptions = job103Descs,
            jobType = JobType.DAILY,
            category = JobCategoryId.CONSTRUCTION_LABOUR,
            wageOrSalaryInr = 650,
            state = "Telangana",
            district = "Hyderabad",
            city = "Secunderabad",
            distanceKm = 8,
            workHours = "8:00 AM – 5:00 PM",
            workersRequired = 12,
            foodProvided = true,
            accommodationProvided = true,
            overtimeDetails = "₹90/hr optional",
            paymentFrequency = "Paid daily at 5:30 PM",
            requiredSkills = listOf("Site Assistance"),
            employerLoboroId = "LB3232",
            employerName = "Sri Sai Builders",
            employerBadge = BadgeLevel.DIAMOND,
            employerRating = 4.8,
            expiryLabel = "6 days"
        ),
        JobListing(
            id = "JOB-M-201",
            title = job201Titles.getValue(SupportedLanguage.ENGLISH),
            originalLanguage = SupportedLanguage.TAMIL,
            localizedTitles = job201Titles,
            description = job201Descs.getValue(SupportedLanguage.ENGLISH),
            localizedDescriptions = job201Descs,
            jobType = JobType.MONTHLY,
            category = JobCategoryId.COOK,
            wageOrSalaryInr = 24000,
            state = "Tamil Nadu",
            district = "Chennai",
            city = "Chennai",
            distanceKm = 620,
            workHours = "7:00 AM – 3:00 PM / Split Shift",
            workersRequired = 3,
            foodProvided = true,
            accommodationProvided = true,
            overtimeDetails = "Double pay on festival days",
            paymentFrequency = "Monthly on 5th via Bank/UPI",
            weeklyHoliday = "1 Paid Off / Week (Tuesday)",
            leavePolicy = "12 Paid Leaves / Year + Emergency Home Leave",
            joiningDate = "Immediate / Within 5 days",
            requiredSkills = listOf("Tandoor / Curry", "Hygiene"),
            employerLoboroId = "LB502",
            employerName = "Ananda Bhavan Kitchen",
            employerBadge = BadgeLevel.GOLD,
            employerRating = 4.6,
            expiryLabel = "14 days"
        ),
        JobListing(
            id = "JOB-M-202",
            title = job202Titles.getValue(SupportedLanguage.ENGLISH),
            originalLanguage = SupportedLanguage.TELUGU,
            localizedTitles = job202Titles,
            description = job202Descs.getValue(SupportedLanguage.ENGLISH),
            localizedDescriptions = job202Descs,
            jobType = JobType.MONTHLY,
            category = JobCategoryId.DRIVER,
            wageOrSalaryInr = 21500,
            state = "Andhra Pradesh",
            district = "NTR",
            city = "Vijayawada",
            distanceKm = 275,
            workHours = "8:30 AM – 6:30 PM",
            workersRequired = 2,
            foodProvided = false,
            accommodationProvided = true,
            overtimeDetails = "₹100/hr after 6:30 PM + trip allowance",
            paymentFrequency = "Monthly on 1st",
            weeklyHoliday = "Sunday Off",
            leavePolicy = "2 Paid Casual Leaves / Month",
            joiningDate = "1st of next month",
            requiredSkills = listOf("LMV License", "Highway Navigation"),
            employerLoboroId = "LB049",
            employerName = "Krishna Agro Logistics",
            employerBadge = BadgeLevel.SILVER,
            employerRating = 4.4,
            expiryLabel = "10 days"
        ),
        JobListing(
            id = "JOB-M-203",
            title = job203Titles.getValue(SupportedLanguage.ENGLISH),
            originalLanguage = SupportedLanguage.GUJARATI,
            localizedTitles = job203Titles,
            description = job203Descs.getValue(SupportedLanguage.ENGLISH),
            localizedDescriptions = job203Descs,
            jobType = JobType.MONTHLY,
            category = JobCategoryId.PACKING_WORKER,
            wageOrSalaryInr = 18500,
            state = "Gujarat",
            district = "Surat",
            city = "Surat",
            distanceKm = 890,
            workHours = "9:00 AM – 6:00 PM",
            workersRequired = 15,
            foodProvided = true,
            accommodationProvided = true,
            overtimeDetails = "1.5x hourly overtime",
            paymentFrequency = "Monthly on 7th",
            weeklyHoliday = "Sunday Off",
            leavePolicy = "18 Earned Leaves / Year",
            joiningDate = "Immediate",
            requiredSkills = listOf("Quality Check", "Garment Packing"),
            employerLoboroId = "LB611",
            employerName = "Navrang Textiles Pvt Ltd",
            employerBadge = BadgeLevel.PLATINUM,
            employerRating = 4.9,
            expiryLabel = "20 days"
        )
    )

    val demoApplications: List<JobApplication> = listOf(
        JobApplication(
            id = "APP-901",
            jobId = "JOB-D-101",
            jobTitle = job101Titles.getValue(SupportedLanguage.ENGLISH),
            localizedTitles = job101Titles,
            jobType = JobType.DAILY,
            cityState = "Hyderabad, Telangana",
            wageLabel = "₹950 / day",
            workerLoboroId = "LB269",
            workerName = "Raju Das",
            employerLoboroId = "LB3232",
            employerName = "Sri Sai Builders",
            status = ApplicationStatus.SHORTLISTED,
            appliedAtLabel = "Today, 9:15 AM"
        ),
        JobApplication(
            id = "APP-902",
            jobId = "JOB-M-201",
            jobTitle = job201Titles.getValue(SupportedLanguage.ENGLISH),
            localizedTitles = job201Titles,
            jobType = JobType.MONTHLY,
            cityState = "Chennai, Tamil Nadu",
            wageLabel = "₹24,000 / month",
            workerLoboroId = "LB269",
            workerName = "Raju Das",
            employerLoboroId = "LB502",
            employerName = "Ananda Bhavan Kitchen",
            status = ApplicationStatus.UNDER_REVIEW,
            appliedAtLabel = "Yesterday"
        ),
        JobApplication(
            id = "APP-903",
            jobId = "JOB-D-103",
            jobTitle = job103Titles.getValue(SupportedLanguage.ENGLISH),
            localizedTitles = job103Titles,
            jobType = JobType.DAILY,
            cityState = "Secunderabad, Telangana",
            wageLabel = "₹650 / day",
            workerLoboroId = "LB269",
            workerName = "Raju Das",
            employerLoboroId = "LB3232",
            employerName = "Sri Sai Builders",
            status = ApplicationStatus.COMPLETED,
            appliedAtLabel = "5 days ago"
        )
    )

    private val tx501Titles = mapOf(
        SupportedLanguage.ENGLISH to "Coin Purchase (20 Coins)",
        SupportedLanguage.HINDI to "कॉइन खरीद (20 कॉइन)",
        SupportedLanguage.GUJARATI to "કોઇન ખરીદી (20 કોઇન)",
        SupportedLanguage.MARATHI to "कॉइन खरेदी (20 कॉइन)",
        SupportedLanguage.TELUGU to "కాయిన్ కొనుగోలు (20 కాయిన్లు)",
        SupportedLanguage.TAMIL to "நாணயம் வாங்குதல் (20 நாணயங்கள்)",
        SupportedLanguage.BENGALI to "কয়েন ক্রয় (২০ কয়েন)",
        SupportedLanguage.ASSAMESE to "কইন ক্ৰয় (২০ কইন)",
        SupportedLanguage.KANNADA to "ನಾಣ್ಯ ಖರೀದಿ (20 ನಾಣ್ಯಗಳು)",
        SupportedLanguage.MALAYALAM to "കോയിൻ വാങ്ങൽ (20 കോയിനുകൾ)",
        SupportedLanguage.PUNJABI to "ਸਿੱਕਾ ਖਰੀਦ (20 ਸਿੱਕੇ)",
        SupportedLanguage.ODIA to "କଏନ୍ କ୍ରୟ (୨୦ କଏନ୍)"
    )

    private val tx502Titles = mapOf(
        SupportedLanguage.ENGLISH to "Referral Bonus (Friend LB418 Joined)",
        SupportedLanguage.HINDI to "रेफरल बोनस (मित्र LB418 जुड़ा)",
        SupportedLanguage.GUJARATI to "રેફરલ બોનસ (મિત્ર LB418 જોડાયા)",
        SupportedLanguage.MARATHI to "रेफरल बोनस (मित्र LB418 सामील)",
        SupportedLanguage.TELUGU to "రిఫరల్ బోనస్ (మిత్రుడు LB418 చేరారు)",
        SupportedLanguage.TAMIL to "பரிந்துரை போனஸ் (நண்பர் LB418 இணைந்தார்)",
        SupportedLanguage.BENGALI to "রেফারেল বোনাস (বন্ধু LB418 যুক্ত হয়েছে)",
        SupportedLanguage.ASSAMESE to "ৰেফাৰেল বোনাছ (বন্ধু LB418 যোগ হ'ল)",
        SupportedLanguage.KANNADA to "ರೆಫರಲ್ ಬೋನಸ್ (ಸ್ನೇಹಿತ LB418 ಸೇರಿದರು)",
        SupportedLanguage.MALAYALAM to "റഫറൽ ബോണസ് (സുഹൃത്ത് LB418 ചേർന്നു)",
        SupportedLanguage.PUNJABI to "ਰੈਫਰਲ ਬੋਨਸ (ਦੋਸਤ LB418 ਸ਼ਾਮਲ ਹੋਇਆ)",
        SupportedLanguage.ODIA to "ରେଫରାଲ୍ ବୋନସ୍ (ବନ୍ଧୁ LB418 ଯୋଗ ଦେଲେ)"
    )

    private val tx503Titles = mapOf(
        SupportedLanguage.ENGLISH to "Gold Badge Milestone Reward",
        SupportedLanguage.HINDI to "गोल्ड बैज माइलस्टोन इनाम",
        SupportedLanguage.GUJARATI to "ગોલ્ડ બેજ માઇલસ્ટોન ઈનામ",
        SupportedLanguage.MARATHI to "गोल्ड बॅज टप्पा बक्षीस",
        SupportedLanguage.TELUGU to "గోల్డ్ బ్యాడ్జ్ మైలురాయి బహుమతి",
        SupportedLanguage.TAMIL to "கோல்ட் பேட்ஜ் மைல்கல் வெகுமதி",
        SupportedLanguage.BENGALI to "গোল্ড ব্যাজ মাইলফলক পুরস্কার",
        SupportedLanguage.ASSAMESE to "গোল্ড বেজ মাইলৰ খুঁটি পুৰস্কাৰ",
        SupportedLanguage.KANNADA to "ಗೋಲ್ಡ್ ಬ್ಯಾಡ್ಜ್ ಮೈಲಿಗಲ್ಲು ಬಹುಮಾನ",
        SupportedLanguage.MALAYALAM to "ഗോൾഡ് ബാഡ്ജ് നാഴികക്കല്ല് സമ്മാനം",
        SupportedLanguage.PUNJABI to "ਗੋਲਡ ਬੈਜ ਮੀਲ-ਪੱਥਰ ਇਨਾਮ",
        SupportedLanguage.ODIA to "ଗୋଲ୍ଡ ବ୍ୟାଜ୍ ମାଇଲଖୁଣ୍ଟ ପୁରସ୍କାର"
    )

    private val tx504Titles = mapOf(
        SupportedLanguage.ENGLISH to "Special Job Connection Fee",
        SupportedLanguage.HINDI to "विशेष जॉब कनेक्शन शुल्क",
        SupportedLanguage.GUJARATI to "ખાસ જોબ કનેક્શન ફી",
        SupportedLanguage.MARATHI to "विशेष जॉब कनेक्शन शुल्क",
        SupportedLanguage.TELUGU to "ప్రత్యేక జాబ్ కనెక్షన్ ఫీజు",
        SupportedLanguage.TAMIL to "சிறப்பு வேலை இணைப்புக் கட்டணம்",
        SupportedLanguage.BENGALI to "বিশেষ জব সংযোগ ফি",
        SupportedLanguage.ASSAMESE to "বিশেষ চাকৰি সংযোগ মাচুল",
        SupportedLanguage.KANNADA to "ವಿಶೇಷ ಜಾಬ್ ಸಂಪರ್ಕ ಶುಲ್ಕ",
        SupportedLanguage.MALAYALAM to "പ്രത്യേക ജോബ് കണക്ഷൻ ഫീസ്",
        SupportedLanguage.PUNJABI to "ਖਾਸ ਜੌਬ ਕਨੈਕਸ਼ਨ ਫੀਸ",
        SupportedLanguage.ODIA to "ବିଶେଷ ଜବ୍ ସଂଯୋଗ ଫି"
    )

    private val tx505Titles = mapOf(
        SupportedLanguage.ENGLISH to "Diwali Safety Check-In Promo",
        SupportedLanguage.HINDI to "दिवाली सुरक्षा जांच प्रोमो बोनस",
        SupportedLanguage.GUJARATI to "દિવાળી સુરક્ષા તપાસ પ્રોમો બોનસ",
        SupportedLanguage.MARATHI to "दिवाळी सुरक्षा तपासणी प्रोमो बोनस",
        SupportedLanguage.TELUGU to "దీపావళి భద్రతా తనిఖీ ప్రోమో బోనస్",
        SupportedLanguage.TAMIL to "தீபாவளி பாதுகாப்பு சோதனை சலுகை",
        SupportedLanguage.BENGALI to "দীপাবলি সুরক্ষা যাচাই প্রোমো বোনাস",
        SupportedLanguage.ASSAMESE to "দীপাৱলী সুৰক্ষা পৰীক্ষা প্ৰমো বোনাছ",
        SupportedLanguage.KANNADA to "ದೀಪಾವಳಿ ಸುರಕ್ಷತಾ ತಪಾಸಣೆ ಪ್ರೋಮೋ",
        SupportedLanguage.MALAYALAM to "ദീപാവലി സുരക്ഷാ പരിശോധന പ്രോമോ",
        SupportedLanguage.PUNJABI to "ਦੀਵਾਲੀ ਸੁਰੱਖਿਆ ਜਾਂਚ ਪ੍ਰੋਮੋ ਬੋਨਸ",
        SupportedLanguage.ODIA to "ଦୀପାବଳି ସୁରକ୍ଷା ଯାଞ୍ଚ ପ୍ରମୋ ବୋନସ୍"
    )

    private val tx506Titles = mapOf(
        SupportedLanguage.ENGLISH to "Bank Withdrawal Request (₹60)",
        SupportedLanguage.HINDI to "बैंक निकासी अनुरोध (₹60)",
        SupportedLanguage.GUJARATI to "બેંક ઉપાડ વિનંતી (₹60)",
        SupportedLanguage.MARATHI to "बँक पैसे काढण्याची विनंती (₹60)",
        SupportedLanguage.TELUGU to "బ్యాంక్ విత్‌డ్రా అభ్యర్థన (₹60)",
        SupportedLanguage.TAMIL to "வங்கி பணம் எடுப்பு கோரிக்கை (₹60)",
        SupportedLanguage.BENGALI to "ব্যাংক উত্তোলন অনুরোধ (₹৬০)",
        SupportedLanguage.ASSAMESE to "বেংক টকা উলিওৱা অনুৰোধ (₹৬০)",
        SupportedLanguage.KANNADA to "ಬ್ಯಾಂಕ್ ಹಣ ಹಿಂಪಡೆಯುವ ವಿನಂತಿ (₹60)",
        SupportedLanguage.MALAYALAM to "ബാങ്ക് പിൻവലിക്കൽ അഭ്യർത്ഥന (₹60)",
        SupportedLanguage.PUNJABI to "ਬੈਂਕ ਕਢਵਾਉਣ ਬੇਨਤੀ (₹60)",
        SupportedLanguage.ODIA to "ବ୍ୟାଙ୍କ ଟଙ୍କା ଉଠାଣ ଅନୁରୋଧ (₹୬୦)"
    )

    val demoWallet = WalletAccount(
        ownerLoboroId = "LB269",
        availableCoins = 42,
        coinValueInr = 10,
        withdrawableBalanceInr = 420,
        payoutDestinationMasked = "SBI •••• 7814 / raju••••@oksbi",
        hasWalletPinSet = true,
        hasFaceEnrollment = true,
        withdrawalsFrozenByUser = false,
        transactions = listOf(
            WalletTransaction("TX-501", "ORD-LB-88412", TransactionType.PURCHASE, 20, 200, TransactionStatus.SUCCESSFUL, tx501Titles.getValue(SupportedLanguage.ENGLISH), "15 Nov · 10:30 AM", localizedTitles = tx501Titles),
            WalletTransaction("TX-502", "REF-LB-44210", TransactionType.REFERRAL, 10, 100, TransactionStatus.SUCCESSFUL, tx502Titles.getValue(SupportedLanguage.ENGLISH), "14 Nov · 04:10 PM", localizedTitles = tx502Titles),
            WalletTransaction("TX-503", "BDG-LB-31090", TransactionType.BADGE_REWARD, 15, 150, TransactionStatus.SUCCESSFUL, tx503Titles.getValue(SupportedLanguage.ENGLISH), "11 Nov · 01:05 PM", localizedTitles = tx503Titles),
            WalletTransaction("TX-504", "FEE-LB-22901", TransactionType.JOB_FEE, -2, 20, TransactionStatus.SUCCESSFUL, tx504Titles.getValue(SupportedLanguage.ENGLISH), "10 Nov · 09:00 AM", localizedTitles = tx504Titles),
            WalletTransaction("TX-505", "PRM-LB-19002", TransactionType.PROMO, 5, 50, TransactionStatus.SUCCESSFUL, tx505Titles.getValue(SupportedLanguage.ENGLISH), "06 Nov · 06:45 PM", localizedTitles = tx505Titles),
            WalletTransaction("TX-506", "WDR-LB-11044", TransactionType.WITHDRAWAL, -6, 60, TransactionStatus.PENDING, tx506Titles.getValue(SupportedLanguage.ENGLISH), "04 Nov · 08:20 PM", localizedTitles = tx506Titles)
        )
    )

    private val safe301Titles = mapOf(
        SupportedLanguage.ENGLISH to "Warehouse Helper (Out-of-state)",
        SupportedLanguage.HINDI to "गोदाम सहायक (दूसरे राज्य का काम)",
        SupportedLanguage.GUJARATI to "વેરહાઉસ હેલ્પર (અન્ય રાજ્ય)",
        SupportedLanguage.MARATHI to "गोदाम मदतनीस (परराज्य)",
        SupportedLanguage.TELUGU to "వేర్‌హౌస్ హెల్పర్ (ఇతర రాష్ట్రం)",
        SupportedLanguage.TAMIL to "கிடங்கு உதவியாளர் (வெளிமாநிலம்)",
        SupportedLanguage.BENGALI to "গুদাম সহায়ক (অন্য রাজ্য)",
        SupportedLanguage.ASSAMESE to "গুদাম সহায়ক (আন ৰাজ্য)",
        SupportedLanguage.KANNADA to "ಗೋದಾಮು ಸಹಾಯಕ (ಹೊರರಾಜ್ಯ)",
        SupportedLanguage.MALAYALAM to "വെയർഹൗസ് ഹെൽപ്പർ (അന്യസംസ്ഥാനം)",
        SupportedLanguage.PUNJABI to "ਵੇਅਰਹਾਊਸ ਹੈਲਪਰ (ਹੋਰ ਰਾਜ)",
        SupportedLanguage.ODIA to "ଗୋଦାମ ସହାୟକ (ଅନ୍ୟ ରାଜ୍ୟ)"
    )

    private val safe301Descs = mapOf(
        SupportedLanguage.ENGLISH to "Demo case: 4 days daily wage delayed after site completion. Worker requested mediation.",
        SupportedLanguage.HINDI to "डेमो मामला: काम पूरा होने के बाद 4 दिन की दैनिक मजदूरी में देरी। मज़दूर ने मध्यस्थता का अनुरोध किया।",
        SupportedLanguage.GUJARATI to "ડેમો કેસ: કામ પૂર્ણ થયા પછી 4 દિવસની દૈનિક મજૂરી મોડી પડી. કામદારે મધ્યસ્થીની વિનંતી કરી.",
        SupportedLanguage.MARATHI to "डेमो प्रकरण: काम पूर्ण झाल्यावर 4 दिवसांची मजुरी थकली. कामगाराने मध्यस्थीची विनंती केली.",
        SupportedLanguage.TELUGU to "డెమో కేసు: పని పూర్తయిన తర్వాత 4 రోజుల కూలీ ఆలస్యమైంది. కార్మికుడు మధ్యవర్తిత్వం కోరారు.",
        SupportedLanguage.TAMIL to "டெமோ வழக்கு: பணி முடிந்தபின் 4 நாள் தினக்கூலி தாமதமானது. தொழிலாளி சமரசம் கோரினார்.",
        SupportedLanguage.BENGALI to "ডেমো কেস: কাজ শেষ হওয়ার পর ৪ দিনের দৈনিক মজুরি বকেয়া। কর্মী মধ্যস্থতার আবেদন করেছেন।",
        SupportedLanguage.ASSAMESE to "ডেমো গোচৰ: কাম শেষ হোৱাৰ পিছত ৪ দিনৰ দৈনিক হাজিৰা বাকী। শ্ৰমিকে মধ্যস্থতা বিচাৰিছে।",
        SupportedLanguage.KANNADA to "ಡೆಮೊ ಪ್ರಕರಣ: ಕೆಲಸ ಮುಗಿದ ನಂತರ 4 ದಿನಗಳ ದಿನಗೂಲಿ ವಿಳಂಬವಾಗಿದೆ. ಕಾರ್ಮಿಕರು ಮಧ್ಯಸ್ಥಿಕೆ ಕೋರಿದ್ದಾರೆ.",
        SupportedLanguage.MALAYALAM to "ഡെമോ കേസ്: ജോലി കഴിഞ്ഞിട്ടും 4 ദിവസത്തെ ദിവസക്കൂലി വൈകി. തൊഴിലാളി മധ്യസ്ഥത അഭ്യർത്ഥിച്ചു.",
        SupportedLanguage.PUNJABI to "ਡੈਮੋ ਮਾਮਲਾ: ਕੰਮ ਪੂਰਾ ਹੋਣ ਤੋਂ ਬਾਅਦ 4 ਦਿਨਾਂ ਦੀ ਦਿਹਾੜੀ ਵਿੱਚ ਦੇਰੀ। ਮਜ਼ਦੂਰ ਨੇ ਵਿਚੋਲਗੀ ਮੰਗੀ।",
        SupportedLanguage.ODIA to "ଡେମୋ ମାମଲା: କାମ ସରିବା ପରେ ୪ ଦିନର ଦୈନିକ ମଜୁରୀ ବାକି। ଶ୍ରମିକ ମଧ୍ୟସ୍ଥତା ଅନୁରୋଧ କରିଛନ୍ତି।"
    )

    private val safe302Titles = mapOf(
        SupportedLanguage.ENGLISH to "Monthly Security Guard",
        SupportedLanguage.HINDI to "मासिक सुरक्षा गार्ड",
        SupportedLanguage.GUJARATI to "માસિક સિક્યોરિટી ગાર્ડ",
        SupportedLanguage.MARATHI to "मासिक सुरक्षा रक्षक",
        SupportedLanguage.TELUGU to "నెలవారీ సెక్యూరిటీ గార్డ్",
        SupportedLanguage.TAMIL to "மாத சம்பள பாதுகாப்பு காவலர்",
        SupportedLanguage.BENGALI to "মাসিক নিরাপত্তা প্রহরী",
        SupportedLanguage.ASSAMESE to "মাহিলী সুৰক্ষাৰক্ষী",
        SupportedLanguage.KANNADA to "ತಿಂಗಳ ಸಂಬಳದ ಸೆಕ್ಯುರಿಟಿ ಗಾರ್డ్",
        SupportedLanguage.MALAYALAM to "മാസശമ്പള സെക്യൂരിറ്റി ഗാർഡ്",
        SupportedLanguage.PUNJABI to "ਮਹੀਨਾਵਾਰ ਸੁਰੱਖਿਆ ਗਾਰਡ",
        SupportedLanguage.ODIA to "ମାସିକ ସୁରକ୍ଷା ରକ୍ଷୀ"
    )

    private val safe302Descs = mapOf(
        SupportedLanguage.ENGLISH to "Demo case: Drinking water shortage reported in staff quarters; missed weekly check-in follow-up.",
        SupportedLanguage.HINDI to "डेमो मामला: स्टाफ कमरे में पीने के पानी की कमी की शिकायत; साप्ताहिक जांच फॉलो-अप सक्रिय।",
        SupportedLanguage.GUJARATI to "ડેમો કેસ: સ્ટાફ ક્વાર્ટર્સમાં પીવાના પાણીની અછતની ફરિયાદ; સાપ્તાહિક તપાસ ફોલો-અપ.",
        SupportedLanguage.MARATHI to "डेमो प्रकरण: कर्मचाऱ्यांच्या खोलीत पिण्याच्या पाण्याची कमतरता तक्रार; साप्ताहिक तपासणी पाठपुरावा.",
        SupportedLanguage.TELUGU to "డెమో కేసు: సిబ్బంది వసతిలో త్రాగునీటి కొరత ఫిర్యాదు; వారపు తనిఖీ ఫాలో-అప్.",
        SupportedLanguage.TAMIL to "டெமோ வழக்கு: ஊழியர் அறையில் குடிநீர் பற்றாக்குறை புகார்; வாராந்திர சோதனை தொடர் நடவடிக்கை.",
        SupportedLanguage.BENGALI to "ডেমো কেস: কর্মীদের ঘরে পানীয় জলের অভাবের অভিযোগ; সাপ্তাহিক যাচাই ফলো-আপ।",
        SupportedLanguage.ASSAMESE to "ডেমো গোচৰ: কৰ্মচাৰী কোঠাত খোৱা পানীৰ অভাৱৰ অভিযোগ; সাপ্তাহিক পৰীক্ষা ফলো-আপ।",
        SupportedLanguage.KANNADA to "ಡೆಮೊ ಪ್ರಕರಣ: ಸಿಬ್ಬಂದಿ ವಸತಿಯಲ್ಲಿ ಕುಡಿಯುವ ನೀರಿನ ಕೊರತೆ ದೂರು; ವಾರದ ತಪಾಸಣೆ ಫಾಲೋ-ಅಪ್.",
        SupportedLanguage.MALAYALAM to "ഡെമോ കേസ്: ജീവനക്കാരുടെ മുറിയിൽ കുടിവെള്ള ക്ഷാമം റിപ്പോർട്ട് ചെയ്തു; പ്രതിവാര പരിശോധന തുടർനടപടി.",
        SupportedLanguage.PUNJABI to "ਡੈਮੋ ਮਾਮਲਾ: ਸਟਾਫ ਕਮਰਿਆਂ ਵਿੱਚ ਪੀਣ ਵਾਲੇ ਪਾਣੀ ਦੀ ਕਮੀ ਦੀ ਸ਼ਿਕਾਇਤ; ਹਫ਼ਤਾਵਾਰੀ ਜਾਂਚ ਫਾਲੋ-ਅੱਪ।",
        SupportedLanguage.ODIA to "ଡେମୋ ମାମଲା: କର୍ମଚାରୀ ଘରେ ପାନୀୟ ଜଳ ଅଭାବ ଅଭିଯୋଗ; ସାପ୍ତାହିକ ଯାଞ୍ଚ ଅନୁସନ୍ଧାନ।"
    )

    val demoSafetyCases = listOf(
        SafetyCase(
            id = "SAFE-301",
            workerLoboroId = "LB269",
            employerLoboroId = "LB819",
            jobTitle = safe301Titles.getValue(SupportedLanguage.ENGLISH),
            localizedJobTitles = safe301Titles,
            location = "Kukatpally, Hyderabad, Telangana",
            category = SafetyComplaintCategory.UNPAID_WAGES,
            description = safe301Descs.getValue(SupportedLanguage.ENGLISH),
            localizedDescriptions = safe301Descs,
            timestampLabel = "Today · 11:20 AM",
            urgency = SafetyUrgency.HIGH,
            status = SafetyCaseStatus.IN_REVIEW,
            actionHistory = listOf(
                "Case logged by Worker LB269",
                "Safety Desk notified Employer LB819 (Under neutral review)",
                "Admin callback scheduled"
            )
        ),
        SafetyCase(
            id = "SAFE-302",
            workerLoboroId = "LB712",
            employerLoboroId = "LB904",
            jobTitle = safe302Titles.getValue(SupportedLanguage.ENGLISH),
            localizedJobTitles = safe302Titles,
            location = "Ambattur, Chennai, Tamil Nadu",
            category = SafetyComplaintCategory.FOOD_ACCOMMODATION,
            description = safe302Descs.getValue(SupportedLanguage.ENGLISH),
            localizedDescriptions = safe302Descs,
            timestampLabel = "Yesterday · 07:40 PM",
            urgency = SafetyUrgency.CRITICAL,
            status = SafetyCaseStatus.ADMIN_VERIFIED,
            actionHistory = listOf(
                "Weekly IVR check-in key '2' pressed",
                "Safety Admin spoke with worker",
                "Emergency family contact informed with consent"
            )
        )
    )

    private val ntc01Messages = mapOf(
        SupportedLanguage.ENGLISH to "Out-of-state workers: Enable Weekly Safety Check-In and verify your Emergency Family Contact. Call 112 in immediate danger.",
        SupportedLanguage.HINDI to "दूसरे राज्य के मज़दूर: साप्ताहिक सुरक्षा जांच चालू रखें और आपातकालीन परिवार संपर्क जांचें। तत्काल खतरे में 112 पर कॉल करें।",
        SupportedLanguage.GUJARATI to "અન્ય રાજ્યના કામદારો: સાપ્તાહિક સુરક્ષા તપાસ ચાલુ રાખો અને કટોકટી પરિવાર સંપર્ક ચકાસો. તાત્કાલિક જોખમમાં 112 પર કૉલ કરો.",
        SupportedLanguage.MARATHI to "परराज्यातील कामगार: साप्ताहिक सुरक्षा तपासणी सुरू ठेवा आणि आपत्कालीन कुटुंब संपर्क तपासा. तात्काळ धोक्यात 112 वर कॉल करा.",
        SupportedLanguage.TELUGU to "ఇతర రాష్ట్రాల కార్మికులు: వారపు భద్రతా తనిఖీని ఆన్ చేసి మీ అత్యవసర కుటుంబ సంప్రదింపును ధృవీకరించండి. తక్షణ ప్రమాదంలో 112 కు కాల్ చేయండి.",
        SupportedLanguage.TAMIL to "வெளிமாநில தொழிலாளர்கள்: வாராந்திர பாதுகாப்பு சோதனையை இயக்கி அவசர குடும்ப தொடர்பைச் சரிபார்க்கவும். உடனடி ஆபத்தில் 112 அழைக்கவும்.",
        SupportedLanguage.BENGALI to "অন্য রাজ্যের কর্মীরা: সাপ্তাহিক সুরক্ষা যাচাই চালু রাখুন ও জরুরি পারিবারিক যোগাযোগ যাচাই করুন। তাৎক্ষণিক বিপদে ১১২ নম্বরে কল করুন।",
        SupportedLanguage.ASSAMESE to "আন ৰাজ্যৰ শ্ৰমিকসকল: সাপ্তাহিক সুৰক্ষা পৰীক্ষা সক্ৰিয় কৰক আৰু জৰুৰী পৰিয়ালৰ যোগাযোগ পৰীক্ষা কৰক। তাৎক্ষণিক বিপদত ১১২ ত কল কৰক।",
        SupportedLanguage.KANNADA to "ಹೊರರಾಜ್ಯದ ಕಾರ್ಮಿಕರು: ವಾರದ ಸುರಕ್ಷತಾ ತಪಾಸಣೆ ಸಕ್ರಿಯಗೊಳಿಸಿ ಮತ್ತು ತುರ್ತು ಕುಟುಂಬ ಸಂಪರ್ಕ ಪರಿಶೀಲಿಸಿ. ತಕ್ಷಣದ ಅಪಾಯದಲ್ಲಿ 112 ಗೆ ಕರೆ ಮಾಡಿ.",
        SupportedLanguage.MALAYALAM to "അന്യസംസ്ഥാന തൊഴിലാളികൾ: പ്രതിവാര സുരക്ഷാ പരിശോധന സജീവമാക്കി അടിയന്തര കുടുംബ ബന്ധം ഉറപ്പാക്കുക. അപകടത്തിൽ 112 വിളിക്കുക.",
        SupportedLanguage.PUNJABI to "ਹੋਰ ਰਾਜਾਂ ਦੇ ਮਜ਼ਦੂਰ: ਹਫ਼ਤਾਵਾਰੀ ਸੁਰੱਖਿਆ ਜਾਂਚ ਚਾਲੂ ਰੱਖੋ ਅਤੇ ਐਮਰਜੈਂਸੀ ਪਰਿਵਾਰ ਸੰਪਰਕ ਪੁਸ਼ਟੀ ਕਰੋ। ਤੁਰੰਤ ਖ਼ਤਰੇ ਵਿੱਚ 112 'ਤੇ ਕਾਲ ਕਰੋ।",
        SupportedLanguage.ODIA to "ଅନ୍ୟ ରାଜ୍ୟର ଶ୍ରମିକ: ସାପ୍ତାହିକ ସୁରକ୍ଷା ଯାଞ୍ଚ ସକ୍ରିୟ କରନ୍ତୁ ଓ ଜରୁରୀ ପରିବାର ଯୋଗାଯୋଗ ଯାଞ୍ଚ କରନ୍ତୁ। ତତ୍କାଳ ବିପଦରେ ୧୧୨ କୁ କଲ୍ କରନ୍ତୁ।"
    )

    private val ntc02Messages = mapOf(
        SupportedLanguage.ENGLISH to "All LOBORO Coins (purchased, promo, referral & badge rewards) remain 100% withdrawable with equal cash value.",
        SupportedLanguage.HINDI to "सभी LOBORO कॉइन (खरीदे गए, प्रोमो, रेफरल और बैज इनाम) समान नकद मूल्य के साथ 100% निकासी योग्य हैं।",
        SupportedLanguage.GUJARATI to "તમામ LOBORO કોઇન (ખરીદેલા, પ્રોમો, રેફરલ અને બેજ ઈનામ) સમાન રોકડ મૂલ્ય સાથે 100% ઉપાડી શકાય છે.",
        SupportedLanguage.MARATHI to "सर्व LOBORO कॉइन (खरेदी केलेले, प्रोमो, रेफरल आणि बॅज बक्षिसे) समान रोख मूल्यासह 100% काढता येण्याजोगे आहेत.",
        SupportedLanguage.TELUGU to "అన్ని LOBORO కాయిన్లు (కొన్నవి, ప్రోమో, రిఫరల్ & బ్యాడ్జ్ బహుమతులు) సమాన నగదు విలువతో 100% విత్‌డ్రా చేయవచ్చు.",
        SupportedLanguage.TAMIL to "அனைத்து LOBORO நாணயங்களும் (வாங்கியவை, சலுகை, பரிந்துரை & பேட்ஜ் வெகுமதி) சம மதிப்புடன் 100% எடுக்கக்கூடியவை.",
        SupportedLanguage.BENGALI to "সমস্ত LOBORO কয়েন (কেনা, প্রোমো, রেফারেল ও ব্যাজ পুরস্কার) সমান নগদ মূল্যসহ ১০০% উত্তোলনযোগ্য।",
        SupportedLanguage.ASSAMESE to "সকলো LOBORO কইন (ক্ৰয় কৰা, প্ৰমো, ৰেফাৰেল আৰু বেজ পুৰস্কাৰ) সমান নগদ মূল্যৰ সৈতে ১০০% উলিয়াব পৰা।",
        SupportedLanguage.KANNADA to "ಎಲ್ಲಾ LOBORO ನಾಣ್ಯಗಳು (ಖರೀದಿಸಿದ, ಪ್ರೋಮೋ, ರೆಫರಲ್ ಮತ್ತು ಬ್ಯಾಡ್ಜ್ ಬಹುಮಾನ) ಸಮಾನ ನಗದು ಮೌಲ್ಯದೊಂದಿಗೆ 100% ಹಿಂಪಡೆಯಬಹುದು.",
        SupportedLanguage.MALAYALAM to "എല്ലാ LOBORO കോയിനുകളും (വാങ്ങിയവ, പ്രോമോ, റഫറൽ & ബാഡ്ജ് സമ്മാനങ്ങൾ) തുല്യ പണമൂല്യത്തോടെ 100% പിൻവലിക്കാവുന്നതാണ്.",
        SupportedLanguage.PUNJABI to "ਸਾਰੇ LOBORO ਸਿੱਕੇ (ਖਰੀਦੇ, ਪ੍ਰੋਮੋ, ਰੈਫਰਲ ਅਤੇ ਬੈਜ ਇਨਾਮ) ਬਰਾਬਰ ਨਕਦ ਮੁੱਲ ਨਾਲ 100% ਕਢਵਾਉਣ ਯੋਗ ਹਨ।",
        SupportedLanguage.ODIA to "ସମସ୍ତ LOBORO କଏନ୍ (କିଣାଯାଇଥିବା, ପ୍ରମୋ, ରେଫରାଲ୍ ଓ ବ୍ୟାଜ୍ ପୁରସ୍କାର) ସମାନ ନଗଦ ମୂଲ୍ୟ ସହ ୧୦୦% ଉଠାଣଯୋଗ୍ୟ।"
    )

    val demoAdminNotices = listOf(
        AdminNotice(
            id = "NTC-01",
            message = ntc01Messages.getValue(SupportedLanguage.ENGLISH),
            localizedMessages = ntc01Messages,
            actionLabel = "OPEN SAFETY",
            targetRoute = "safety",
            targetAudience = "All Users",
            regionScope = "India (All States)",
            expiryLabel = "30 Nov 2026",
            isRead = false,
            timestampLabel = "Today · 08:00 AM",
            isActive = true
        ),
        AdminNotice(
            id = "NTC-02",
            message = ntc02Messages.getValue(SupportedLanguage.ENGLISH),
            localizedMessages = ntc02Messages,
            actionLabel = "VIEW WALLET",
            targetRoute = "wallet",
            targetAudience = "Workers & Employers",
            regionScope = "Global",
            expiryLabel = "15 Dec 2026",
            isRead = true,
            timestampLabel = "2 days ago",
            isActive = false
        )
    )

    val demoChatThreads = listOf(
        ChatThread(
            id = "CHAT-01",
            jobId = "JOB-D-101",
            jobTitle = "Senior Mason / Rajmistri · Hyderabad",
            workerLoboroId = "LB269",
            employerLoboroId = "LB3232",
            employerName = "Sri Sai Builders",
            phoneNumberShared = false,
            isBlocked = false,
            messages = listOf(
                ChatMessage("M1", "LB3232", "Employer LB3232", "Namaste! Work starts 8:30 AM near Gachibowli Gate 2. Shared room & dinner arranged.", "09:20 AM"),
                ChatMessage("M2", "LB269", "You (LB269)", "Namaste Sir. Is ₹950/day paid every evening? Also I am from Assam, room has drinking water?", "09:24 AM"),
                ChatMessage("M3", "LB3232", "Employer LB3232", "Yes, ₹950 paid daily at 5:30 PM. Room has fan, RO water & lockable locker.", "09:28 AM")
            )
        )
    )
}
