package com.knick.mvvmsampleapp.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.knick.mvvmsampleapp.R
import com.knick.mvvmsampleapp.databinding.ActivityLoginBinding
import com.knick.mvvmsampleapp.util.toast

class LoginActivity : AppCompatActivity() ,AuthListner{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityLoginBinding=DataBindingUtil.setContentView(this,R.layout.activity_login)
        val  viewModel=ViewModelProviders.of(this).get(AuthViewModel::class.java)

        binding.viewmodel=viewModel
        viewModel.authListner=this

    }

    override fun onStarted() {
 toast("Started")
    }
    override fun onSuccess() {
toast("success")
    }
    override fun onFailed(message: String) {
    toast(message)
    }
}