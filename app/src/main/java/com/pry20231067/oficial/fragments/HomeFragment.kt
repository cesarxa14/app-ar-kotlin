package com.pry20231067.oficial.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pry20231067.oficial.R
import com.pry20231067.oficial.adapter.PlaceAdapter
import com.pry20231067.oficial.data.PlaceProvider
import com.pry20231067.oficial.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        val btnToProfile = binding.btnToProfile
        btnToProfile.setOnClickListener{
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToProfileFragment())
        }

        val item = view?.findViewById<CardView>(R.id.card_view_item_place)
        item?.setOnClickListener{
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToPlaceItemFragment())
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView(view)
    }

    fun initRecyclerView(view: View){
        val recyclerView =view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = PlaceAdapter(PlaceProvider.listPlace)
    }

}