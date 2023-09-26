package com.pry20231067.oficial.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pry20231067.oficial.R
import com.pry20231067.oficial.adapter.Foro.ForoAdapter
import com.pry20231067.oficial.adapter.News.NewsAdapter
import com.pry20231067.oficial.adapter.Place.PlaceAdapter
import com.pry20231067.oficial.data.Foro.PostsForoProvider
import com.pry20231067.oficial.data.News.NewProvider
import com.pry20231067.oficial.databinding.FragmentForoBinding
import com.pry20231067.oficial.databinding.FragmentNewsBinding

class ForoFragment : Fragment() {

    private var _binding: FragmentForoBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentForoBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView(view)

    }

    fun initRecyclerView(view: View){
        val recyclerView =view.findViewById<RecyclerView>(R.id.recycler_view_foro)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = ForoAdapter(PostsForoProvider.listPostsForo)
    }

}