package com.example.dagger2dependencyinjection

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.util.Log

class EmailService {

    fun sentEmail(to: String, from: String, message : String?){
        Log.d("TESTING", "Email Sent")
    }
}