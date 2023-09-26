package com.pry20231067.oficial.adapter.News

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.pry20231067.oficial.R
import com.pry20231067.oficial.data.News.New
import com.pry20231067.oficial.data.Place.Place

class NewsViewHolder(view: View): ViewHolder(view) {

    val titularItem = view.findViewById<TextView>(R.id.tv_titular_news)
    val contentItem = view.findViewById<TextView>(R.id.tv_content_news)
    val imageItem = view.findViewById<ImageView>(R.id.imgview_news)

    fun render(newModel: New){
        titularItem.text = newModel.content
        contentItem.text = newModel.content
        Glide.with(imageItem.context).load(newModel.image).into(imageItem)

        itemView.setOnClickListener{
            print("Click item")
//            Navigation.findNavController(itemView).navigate(HomeFragmentDirections.actionHomeFragmentToPlaceItemFragment())
            Toast.makeText(imageItem.context, newModel.content, Toast.LENGTH_SHORT).show()
        }
    }
}