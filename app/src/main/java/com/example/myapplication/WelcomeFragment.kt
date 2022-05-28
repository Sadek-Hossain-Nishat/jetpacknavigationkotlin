package com.example.myapplication


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class WelcomeFragment:Fragment(R.layout.fragment_welcome) {
    lateinit var userTextView:TextView
    lateinit var passwordTextView:TextView
    lateinit var button_ok: Button

    private val args:WelcomeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        userTextView=view.findViewById(R.id.id_text_view_username)
        passwordTextView=view.findViewById(R.id.id_text_view_password)
        button_ok=view.findViewById(R.id.id_button_ok)

        userTextView.text=args.username
        passwordTextView.text=args.password

        button_ok.setOnClickListener {
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment()
            findNavController().navigate(action)
        }

    }






}







