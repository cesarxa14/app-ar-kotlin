package com.pry20231067.oficial.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pry20231067.oficial.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLoginBinding.inflate(layoutInflater, container, false)

        val btnRegister = binding.buttonRegister
        btnRegister.setOnClickListener{
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToRegisterFragment())
        }

        val btnLogin = binding.buttonLogin
        btnLogin.setOnClickListener{
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToNavGraph2())
        }
        return binding.root
//        return binding.root
    }


}