package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class LoginFragment:Fragment(R.layout.fragment_login) {

    lateinit var button_confirm:Button
    lateinit var edittext_username:EditText
    lateinit var editTEXT_password:EditText
    private val args:LoginFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_confirm=view.findViewById(R.id.id_button_confirm)
        edittext_username=view.findViewById(R.id.id_edit_text_username)
        editTEXT_password=view.findViewById(R.id.id_edit_text_password)
        val usernameDeeplink = args.username
        edittext_username.setText(usernameDeeplink)


        button_confirm.setOnClickListener {
            val username=edittext_username.text.toString()
            val password= editTEXT_password.text.toString()


            val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(
                username, password
            )
            findNavController().navigate(action)
        }







    }







}