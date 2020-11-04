package com.knick.mvvmsampleapp.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {
    var email:String?=null
    var password:String?=null

    var authListner:AuthListner?=null

    fun onButtonCLickLogin(view:View){
        authListner?.onStarted()

        if (email.isNullOrEmpty() || password.isNullOrEmpty()){
            authListner?.onFailed("Invalid email or password")
            return
        }
        authListner?.onSuccess()
    }

}