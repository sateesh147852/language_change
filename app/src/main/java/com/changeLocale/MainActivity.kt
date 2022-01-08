package com.changeLocale

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.changeLocale.ui.SecondActivity
import com.changeLocale.utils.Constants
import com.changeLocale.utils.Utilites

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("onClick", "onCreate: ")
        Utilites.changeLanguage(this, Constants.LANGUAGE)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        Constants.LANGUAGE = "hi"
        Log.i("onClick: ", "onClick called")
        val newIntent = Intent(this, SecondActivity::class.java)
        //val newIntent = Intent(this, MainActivity::class.java)
        newIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
        startActivity(newIntent)
        overridePendingTransition(0, 0)
    }
}