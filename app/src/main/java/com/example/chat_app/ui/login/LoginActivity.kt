package com.example.chat_app.ui.login

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.chat_app.BaseActivity
import com.example.chat_app.R
import com.example.chat_app.databinding.ActivityLoginBinding


class LoginActivity : BaseActivity() {
    lateinit var viewModel: LoginViewModel
    lateinit var viewBinding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        viewModel = ViewModelProvider(this)[LoginViewModel::class.java]
        viewBinding.vm = viewModel
        showpass(
            viewBinding.contentLogin.password,
            viewBinding.contentLogin.icon,
            viewBinding.contentLogin.icon2
        )
        hide(
            viewBinding.contentLogin.password,
            viewBinding.contentLogin.icon2,
            viewBinding.contentLogin.icon
        )


    }
}