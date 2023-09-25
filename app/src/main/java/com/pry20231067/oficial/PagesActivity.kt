package com.pry20231067.oficial


import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pry20231067.oficial.adapter.PlaceAdapter
import com.pry20231067.oficial.data.PlaceProvider
import com.pry20231067.oficial.databinding.ActivityPagesBinding


class PagesActivity : FragmentActivity() {
    private lateinit var binding: ActivityPagesBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPagesBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        initRecyclerView()
    }


//    fun initRecyclerView(){
//        val recyclerView =findViewById<RecyclerView>(R.id.recycler_view)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = PlaceAdapter(PlaceProvider.listPlace, na)
//    }


}