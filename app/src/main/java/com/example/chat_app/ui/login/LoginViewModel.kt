package com.example.chat_app.ui.login


import android.content.Intent
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.example.chat_app.ui.register.RegisterActivity

class LoginViewModel : ViewModel() {
   
    var email = ObservableField<String>()
    var errorEmail = ObservableField<String?>()
    var password = ObservableField<String>()
    var errorPassword = ObservableField<String?>()

    fun register() {
        if (!validateForm())
            return;


    }

    fun validateForm(): Boolean {
        var isValid = true

        if (email.get().isNullOrBlank()) {
            isValid = false
            //show error
            errorEmail.set("please enter your Email")
        } else {
            isValid = true
            errorEmail.set(null)
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


        return isValid
    }

    fun openRegister(view: View)
    {
        var intent=Intent(view.context,RegisterActivity::class.java)
        view.context.startActivity(intent)


    }


}