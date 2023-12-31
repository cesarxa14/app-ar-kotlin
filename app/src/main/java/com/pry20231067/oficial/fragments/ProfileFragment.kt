package com.pry20231067.oficial.fragments

import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.pry20231067.oficial.Api.ApiService
import com.pry20231067.oficial.Model.User
import com.pry20231067.oficial.databinding.FragmentProfileBinding

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class ProfileFragment : Fragment() {

    val url: String = "https://api-ar-app.onrender.com/users/650cc8e1d3db917908067296"
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileBinding.inflate(layoutInflater, container, false)

        val cardSouvenir = binding.cardSouvenirs
        cardSouvenir.setOnClickListener{
            findNavController().navigate(ProfileFragmentDirections.actionProfileFragmentToSouvenirsFragment())
        }

        val btnEdit = binding.btnEditProfile
        btnEdit.setOnClickListener {
            findNavController().navigate(ProfileFragmentDirections.actionProfileFragmentToEditProfileFragment())
        }

        val btnDelete = binding.btnDeleteAccount
        btnDelete.setOnClickListener {
//            showDialog()
        }
//        getUserInfo()
        // Inflate the layout for this fragment

        return binding.root
    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("https://api-ar-app.onrender.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

//
//    fun showDialog(){
//        val alertDialogBuilder = AlertDialog.Builder(requireActivity())
//        alertDialogBuilder.setTitle("Delete")
//        alertDialogBuilder.setMessage("Are you sure?")
//        alertDialogBuilder.setPositiveButton("Confirmar"){_, _ -> {
//            requireActivity().finish()
//        }}
//        alertDialogBuilder.setNegativeButton("Cancel"){_, _ -> {
//            Toast.makeText(context, "Cancel", Toast.LENGTH_SHORT).show()
//        }}
//
//        val alertDialogBox = alertDialogBuilder.create()
//        alertDialogBox.show()
//    }

    private fun getUserInfo(){
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(ApiService::class.java).getUserByID(url)
            val response = call.body()
            activity?.runOnUiThread{
                if(call.isSuccessful){
                    val user = response?.data
                    binding.tvName.text = user.toString()
                }
            }
        }
    }








}