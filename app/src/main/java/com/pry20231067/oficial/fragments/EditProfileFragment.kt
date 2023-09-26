package com.pry20231067.oficial.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pry20231067.oficial.R
import com.pry20231067.oficial.databinding.FragmentEditProfileBinding
import com.pry20231067.oficial.databinding.FragmentHomeBinding

class EditProfileFragment : Fragment() {

    private var _binding: FragmentEditProfileBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEditProfileBinding.inflate(layoutInflater, container, false)

        val btnSubmit = binding.editProfileSubmit
        btnSubmit.setOnClickListener{
            findNavController().navigate(EditProfileFragmentDirections.actionEditProfileFragmentToProfileFragment())
        }
        // Inflate the layout for this fragment
        return binding.root
    }


}