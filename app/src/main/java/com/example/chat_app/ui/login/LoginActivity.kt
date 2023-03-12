package com.example.chat_app.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.chat_app.BaseActivity
import com.example.chat_app.R
import com.example.chat_app.databinding.ActivityLoginBinding
import com.example.chat_app.ui.Home.HomeActivity
import com.example.chat_app.ui.register.RegisterActivity

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>(), LoginNavigator {
    override fun getLayoutId(): Int {
        return R.layout.activity_login
    }

    override fun getViewModelId(): LoginViewModel {
        return ViewModelProvider(this)[LoginViewModel::class.java]
    }
    override lateinit var viewBinding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding.vm = viewModel
        viewModel.navigator = this

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


    override fun goToHome() {
        var intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

    override fun goToRegister() {
        var intetn = Intent(this, RegisterActivity::class.java)
        startActivity(intetn)
    }
}
