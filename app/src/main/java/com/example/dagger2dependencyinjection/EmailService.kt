package com.example.dagger2dependencyinjection

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {

    fun sentEmail(to: String, from: String, message : String?){
        Log.d("TESTING", "Email Sent")
    }
}