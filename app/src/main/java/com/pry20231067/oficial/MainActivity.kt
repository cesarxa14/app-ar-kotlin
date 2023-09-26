package com.pry20231067.oficial

import android.os.Bundle
import androidx.fragment.app.FragmentActivity

import com.pry20231067.oficial.databinding.ActivityMainBinding


class MainActivity : FragmentActivity() {

    private lateinit var binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

//    fun initRecyclerView(){
//        val recyclerView =findViewById<RecyclerView>(R.id.recycler_view)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = PlaceAdapter(PlaceProvider.listPlace)
//    }


}
