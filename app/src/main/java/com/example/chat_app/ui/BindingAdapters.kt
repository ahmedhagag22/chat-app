package com.example.chat_app.ui

import android.text.method.HideReturnsTransformationMethod
import android.widget.EditText
import android.widget.ImageView
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.TextInputLayout

@BindingAdapter("error")
fun showErrorOnText(textInputLayout: TextInputLayout, error: String?) {
    textInputLayout.error = error
}

@BindingAdapter("showPassword")
fun showPass(imageView: ImageView, editText: EditText): Boolean {
    imageView.setOnClickListener {
        editText.transformationMethod = HideReturnsTransformationMethod.getInstance()
        imageView.isVisible = false
    }
    return true


}
