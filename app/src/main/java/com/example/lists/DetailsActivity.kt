package com.example.lists

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val fullName = intent.extras?.getString(KEY_NAME)
        val phoneNumber = intent.extras?.getString(KEY_PHONE)

        println("extras data $fullName $phoneNumber")
    }
}