package com.knick.mvvmsampleapp.ui.auth

import androidx.lifecycle.LiveData

interface AuthListner {
    fun onStarted();
    fun onSuccess(loginResponse: LiveData<String>);
    fun onFailed(message:String);


}