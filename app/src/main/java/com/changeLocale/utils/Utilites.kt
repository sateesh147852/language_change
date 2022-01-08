package com.changeLocale.utils

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import android.util.DisplayMetrics
import java.util.*


object Utilites {

    fun changeLanguage(context: Context, langCode: String) {
        val res: Resources = context.resources
// Change locale settings in the app.
// Change locale settings in the app.
        val dm: DisplayMetrics = res.getDisplayMetrics()
        val conf: Configuration = res.getConfiguration()
        conf.setLocale(Locale(langCode.toLowerCase())) // API 17+ only.

// Use conf.locale = new Locale(...) if targeting lower versions
// Use conf.locale = new Locale(...) if targeting lower versions
        res.updateConfiguration(conf, dm)
    }
}