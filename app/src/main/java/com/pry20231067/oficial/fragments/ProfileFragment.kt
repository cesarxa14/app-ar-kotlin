package com.pry20231067.oficial.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pry20231067.oficial.R
import com.pry20231067.oficial.databinding.FragmentHomeBinding
import com.pry20231067.oficial.databinding.FragmentProfileBinding
import com.pry20231067.oficial.databinding.FragmentSouvenirsBinding


class ProfileFragment : Fragment() {

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
        // Inflate the layout for this fragment
        return binding.root
    }

}