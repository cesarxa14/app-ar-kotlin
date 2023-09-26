package com.pry20231067.oficial.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pry20231067.oficial.Api.ApiService
import com.pry20231067.oficial.R
import com.pry20231067.oficial.adapter.Place.PlaceAdapter
import com.pry20231067.oficial.data.Place.Place
import com.pry20231067.oficial.databinding.FragmentHomeBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    val url: String = "https://api-ar-app.onrender.com/places"
    private val placeList = mutableListOf<Place>()
    private lateinit var adapter: PlaceAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        buttonsNavigation()
        getPlaces()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView(view)
    }

    fun buttonsNavigation(){
        val btnToProfile = binding.btnToProfile
        btnToProfile.setOnClickListener{
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToProfileFragment())
        }

        val item = view?.findViewById<CardView>(R.id.card_view_item_place)
        item?.setOnClickListener{
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToPlaceItemFragment())
        }

        val toPlaceItem = binding.btnToPlaceItem
        toPlaceItem?.setOnClickListener{
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToPlaceItemFragment())
        }

        val btnToNews = binding.btnToNews
        btnToNews.setOnClickListener{
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToNewsFragment())
        }
    }

    fun initRecyclerView(view: View){
        val recyclerView =view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = PlaceAdapter(placeList)
        recyclerView.adapter = adapter

    }

    private fun getRetrofit():Retrofit{
        return Retrofit.Builder().baseUrl("https://api-ar-app.onrender.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun getPlaces(){
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(ApiService::class.java).getPlaces("$url")
            val places = call.body()
            activity?.runOnUiThread{
                if(call.isSuccessful){
                    val placeData = places?.data ?: emptyList()
                    placeList.clear()
                    placeList.addAll(placeData)
                    adapter.notifyDataSetChanged()
                }
            }
        }
    }



}