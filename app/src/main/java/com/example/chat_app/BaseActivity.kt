package com.example.chat_app

import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

open class BaseActivity :AppCompatActivity() {
    fun showpass(editText: EditText, eye: ImageView, hide: ImageView) {
        eye.setOnClickListener {
            editText.transformationMethod = HideReturnsTransformationMethod.getInstance()
            eye.isVisible = false
            hide.isVisible = true
        }

    }

    fun hide(editText: EditText, hide: ImageView, eye: ImageView) {

        hide.setOnClickListener {
            editText.transformationMethod = PasswordTransformationMethod.getInstance()
            hide.isVisible = false
            eye.isVisible = true
        }
    }


}