package com.pry20231067.oficial.fragments

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.pry20231067.oficial.Api.ApiService
import com.pry20231067.oficial.Model.LoginRequest
import com.pry20231067.oficial.Model.LoginResponse
import com.pry20231067.oficial.PagesActivity
import com.pry20231067.oficial.databinding.FragmentLoginBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    val url: String = "https://api-ar-app.onrender.com/auth/sign-in"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        buttonsNavigation()

        return binding.root
//        return binding.root
    }

    fun buttonsNavigation(){
        val btnRegister = binding.buttonRegister
        btnRegister.setOnClickListener{
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToRegisterFragment())
        }

        val btnLogin = binding.buttonLogin
        btnLogin.setOnClickListener{
            login()
        }
    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("https://api-ar-app.onrender.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun login(){
        CoroutineScope(Dispatchers.IO).launch {
            val usernameValue = binding.editTextUsername.text.toString().trim()
            val passwordValue = binding.editTextPassword.text.toString().trim()
            val userLogin = LoginRequest(usernameValue, passwordValue)
            val call = getRetrofit().create(ApiService::class.java).login(url, userLogin)
            val responseLogin = call.body()
            activity?.runOnUiThread{
                if(call.isSuccessful){
//                    val userInfo = responseLogin?.data
                    val intent = Intent(activity, PagesActivity()::class.java)
                    intent.putExtra("userID", responseLogin?.data?._id)
                    findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToNavGraph2())
                }else{
                    Toast.makeText(context, "Invalid Login", Toast.LENGTH_SHORT)
                }
            }
        }
    }




}