package com.pry20231067.oficial.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pry20231067.oficial.R
import com.pry20231067.oficial.adapter.News.NewsAdapter
import com.pry20231067.oficial.data.News.NewProvider
import com.pry20231067.oficial.databinding.FragmentFavoriteNewsBinding
import com.pry20231067.oficial.databinding.FragmentHomeBinding

class FavoriteNewsFragment : Fragment() {

    private var _binding: FragmentFavoriteNewsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFavoriteNewsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView(view)
    }

    fun initRecyclerView(view: View){
        val recyclerView =view.findViewById<RecyclerView>(R.id.recycler_view_news_favorites)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = NewsAdapter(NewProvider.listNews)
    }
}