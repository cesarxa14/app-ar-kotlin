package com.pry20231067.oficial.adapter.Place

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.pry20231067.oficial.R
import com.pry20231067.oficial.data.Place.Place

class PlaceViewHolder(view: View): ViewHolder(view) {

    val placeName = view.findViewById<TextView>(R.id.tv_name)
    val placeDescription = view.findViewById<TextView>(R.id.tv_description)
    val photo = view.findViewById<ImageView>(R.id.imgview_place)

    fun render(placeModel: Place){
        placeName.text = placeModel.name
        placeDescription.text = placeModel.description
        Glide.with(photo.context).load(placeModel.photo).into(photo)

        itemView.setOnClickListener{
            print("Click item")
//            Navigation.findNavController(itemView).navigate(HomeFragmentDirections.actionHomeFragmentToPlaceItemFragment())
            Toast.makeText(photo.context, placeModel.name, Toast.LENGTH_SHORT).show()
        }
    }
}