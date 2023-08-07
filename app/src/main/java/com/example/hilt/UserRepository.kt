package com.example.hilt

import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email:String,password:String)
}

class SQLRepository @Inject constructor(val loggerService: LoggerService) :UserRepository{
    override fun saveUser(email:String, password:String){
        loggerService.log("water")
        Log.e("UserReposiroty.saveUser","$email Saved")
    }
}


class FireBaseRepository :UserRepository{
    override fun saveUser(email:String, password:String){
        Log.e("FireBaseRepository.saveUser","$email Saved")
    }
}