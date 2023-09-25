package com.pry20231067.oficial.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pry20231067.oficial.R
import com.pry20231067.oficial.adapter.PlaceAdapter
import com.pry20231067.oficial.adapter.SouvenirAdapter
import com.pry20231067.oficial.data.PlaceProvider
import com.pry20231067.oficial.data.SouvenirProvider
import com.pry20231067.oficial.databinding.FragmentHomeBinding
import com.pry20231067.oficial.databinding.FragmentSouvenirsBinding

class SouvenirsFragment : Fragment() {

    private var _binding: FragmentSouvenirsBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSouvenirsBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView(view)
    }

    fun initRecyclerView(view: View){
        val recyclerView =view.findViewById<RecyclerView>(R.id.recycler_view_souvenir)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = SouvenirAdapter(SouvenirProvider.listSouvenir)
    }

}