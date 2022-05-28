package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment:Fragment(R.layout.fragment_home) {

    lateinit var button_login:Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_login=view.findViewById(R.id.id_button_login)

        button_login.setOnClickListener {

            val action=HomeFragmentDirections.actionHomeFragmentToLoginFragment()
            findNavController().navigate(action)

        }




    }







}