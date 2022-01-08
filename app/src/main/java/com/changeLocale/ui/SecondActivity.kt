package com.changeLocale.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.changeLocale.R
import com.changeLocale.utils.Constants
import com.changeLocale.utils.Utilites

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utilites.changeLanguage(this,Constants.LANGUAGE)
        setContentView(R.layout.activity_second)
    }
}