package com.knick.mvvmsampleapp.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.knick.mvvmsampleapp.R
import com.knick.mvvmsampleapp.databinding.ActivityLoginBinding
import com.knick.mvvmsampleapp.util.hide
import com.knick.mvvmsampleapp.util.show
import com.knick.mvvmsampleapp.util.toast
import kotlinx.android.synthetic.main.activity_sign_up.*

class LoginActivity : AppCompatActivity() ,AuthListner{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityLoginBinding=DataBindingUtil.setContentView(this,R.layout.activity_login)
        val  viewModel=ViewModelProviders.of(this).get(AuthViewModel::class.java)

        binding.viewmodel=viewModel
        viewModel.authListner=this

    }

    override fun onStarted() {
        progress_bar.show()
    }
    override fun onSuccess(loginResponse: LiveData<String>) {

        loginResponse.observe(this,
                Observer {
                    progress_bar.hide()
                    toast(it) })

    }
    override fun onFailed(message: String) {
        progress_bar.hide()
    toast(message)
    }
}