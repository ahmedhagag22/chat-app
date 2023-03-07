package com.example.chat_app.ui.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.EditText
import android.widget.ImageView
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.chat_app.BaseActivity
import com.example.chat_app.R
import com.example.chat_app.databinding.ActivityRegisterBinding

class RegisterActivity : BaseActivity() {
    lateinit var viewBinding: ActivityRegisterBinding
    lateinit var viewModel: RegisterViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_register)
        viewModel = ViewModelProvider(this)[RegisterViewModel::class.java]
        viewBinding.vm = viewModel
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
        viewBinding.back.setOnClickListener{
            finish()
        }

    }




}



