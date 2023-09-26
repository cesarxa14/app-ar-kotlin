package com.pry20231067.oficial.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.pry20231067.oficial.R
import com.pry20231067.oficial.databinding.FragmentHomeBinding
import com.pry20231067.oficial.databinding.FragmentPlaceItemBinding

class PlaceItemFragment : Fragment() {

    private var _binding: FragmentPlaceItemBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPlaceItemBinding.inflate(layoutInflater, container, false)

        val btn_ver_reseñas = binding.btnResenas
        btn_ver_reseñas.setOnClickListener{
            findNavController().navigate(PlaceItemFragmentDirections.actionPlaceItemFragmentToReviewFragment())
        }

        return binding.root
    }

}