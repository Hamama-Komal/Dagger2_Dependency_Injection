package com.example.dagger2dependencyinjection

import android.content.ContentValues.TAG
import android.util.Log

class UserRepository {

    fun saveUser(email: String, password: String){
        Log.d("TESTING", "User saved in Database")
    }
}