package com.pry20231067.oficial.adapter.Souvenir

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.pry20231067.oficial.R
import com.pry20231067.oficial.data.Souvenir.Souvenir

class SouvenirViewHolder(view: View): ViewHolder(view) {

    val placeName = view.findViewById<TextView>(R.id.tv_name)
    val placeDescription = view.findViewById<TextView>(R.id.tv_description)
    val photo = view.findViewById<ImageView>(R.id.imgview_place)

    fun render(placeModel: Souvenir){
        placeName.text = placeModel.name
        placeDescription.text = placeModel.description
        Glide.with(photo.context).load(placeModel.photo).into(photo)

        itemView.setOnClickListener{
            print("Click item")
            Toast.makeText(photo.context, placeModel.name, Toast.LENGTH_SHORT).show()
        }
    }
}