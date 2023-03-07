package com.example.chat_app.ui.register

import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.databinding.Observable
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class RegisterViewModel : ViewModel() {
    var userName = ObservableField<String>()
    var errorUserName = ObservableField<String?>()
    var email = ObservableField<String>()
    var errorEmail = ObservableField<String?>()
    var phone = ObservableField<String>()
    var errorPhone = ObservableField<String?>()
    var password = ObservableField<String>()
    var errorPassword = ObservableField<String?>()
    var confirmPassword = ObservableField<String>()
    var errorConfirmPassword = ObservableField<String?>()

    fun register() {
        if (!validateForm())
            return;


    }

    fun validateForm(): Boolean {
        var isValid = true
        if (userName.get().isNullOrBlank()) {
            //show error
            errorUserName.set("please enter your name")
            isValid = false
        } else {
            isValid = false
            //hide error
            errorUserName.set(null)
        }
        if (email.get().isNullOrBlank()) {
            isValid = false
            //show error
            errorEmail.set("please enter your Email")
        } else {
            isValid = true
            errorEmail.set(null)
        }
        if (phone.get().isNullOrBlank()) {
            isValid = false
            errorPhone.set("please enter your phone number")
            //show error
        } else {
            //hide error
            errorPhone.set(null)
            isValid = true
        }
        if (password.get().isNullOrBlank()) {
            isValid = false
            //show error
            errorPassword.set("please enter your password")
        } else {
            isValid = true
            //hide error
            errorPassword.set(null)
        }
        if (confirmPassword.get().isNullOrBlank()) {
            isValid = false
            //show error
            errorConfirmPassword.set("Please re-enter password")
        } else if (password.get()?.equals(confirmPassword.get()) == false) {
            errorConfirmPassword.set("doesn't match")
        } else {
            isValid = true
            //hide error
            errorConfirmPassword.set(null)
        }

        return isValid
    }



}