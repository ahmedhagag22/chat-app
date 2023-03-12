package com.example.chat_app.ui.register

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.chat_app.BaseActivity
import com.example.chat_app.R
import com.example.chat_app.databinding.ActivityRegisterBinding

class RegisterActivity : BaseActivity<ActivityRegisterBinding
        , RegisterViewModel>(), Navigator {
    override fun getLayoutId(): Int {
        return R.layout.activity_register
    }

    override fun getViewModelId(): RegisterViewModel {
        return ViewModelProvider(this)[RegisterViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding.vm = viewModel
        viewModel.navigator = this

        showpass(
            viewBinding.included.password,
            viewBinding.included.icon,
            viewBinding.included.icon2
        )
        showpass(
            viewBinding.included.confirmPassword,
            viewBinding.included.iconre1,
            viewBinding.included.icon2r2
        )
        hide(viewBinding.included.password, viewBinding.included.icon2, viewBinding.included.icon)
        hide(
            viewBinding.included.confirmPassword,
            viewBinding.included.icon2r2,
            viewBinding.included.iconre1
        )
        viewBinding.back.setOnClickListener {
            finish()
        }


    }


}






