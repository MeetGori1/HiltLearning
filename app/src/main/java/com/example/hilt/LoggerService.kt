package com.example.hilt

import android.os.Message
import android.util.Log
import android.widget.Toast
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class LoggerService @Inject constructor() {
    fun log(message: String) {
        Log.e("LoggerService.log", message)
    }
    /* fun toast1(@ApplicationContext context: ApplicationContext ,  message: String){
         Toast.makeText(context ,"message",Toast.LENGTH_LONG).
     }*/
}