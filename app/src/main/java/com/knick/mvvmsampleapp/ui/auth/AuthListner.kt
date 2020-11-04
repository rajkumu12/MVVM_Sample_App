package com.knick.mvvmsampleapp.ui.auth

interface AuthListner {
    fun onStarted();
    fun onSuccess();
    fun onFailed(message:String);


}