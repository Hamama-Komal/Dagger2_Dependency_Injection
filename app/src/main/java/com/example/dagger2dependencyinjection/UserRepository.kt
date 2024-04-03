package com.example.dagger2dependencyinjection

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){

    fun saveUser(email: String, password: String){
        Log.d("TESTING", "User saved in Database")
    }
}