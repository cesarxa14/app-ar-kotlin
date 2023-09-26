package com.pry20231067.oficial.adapter.Place

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pry20231067.oficial.R
import com.pry20231067.oficial.data.Place.Place


class PlaceAdapter(private val placeList: List<Place>): RecyclerView.Adapter<PlaceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PlaceViewHolder(layoutInflater.inflate(R.layout.item_place, parent, false))
    }

    override fun getItemCount(): Int {
        return placeList.size
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        val item = placeList[position]
        holder.render(item)
    }

}