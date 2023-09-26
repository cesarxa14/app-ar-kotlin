package com.pry20231067.oficial.adapter.Foro

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.pry20231067.oficial.R
import com.pry20231067.oficial.data.Foro.PostForo
import com.pry20231067.oficial.data.News.New
import com.pry20231067.oficial.data.Place.Place

class ForoViewHolder(view: View): ViewHolder(view) {

    val titleItem = view.findViewById<TextView>(R.id.tv_title_item_post_foro)
    val contentItem = view.findViewById<TextView>(R.id.tv_content_item_post_foro)

    fun render(newModel: PostForo){
        titleItem.text = newModel.content
        contentItem.text = newModel.content

        itemView.setOnClickListener{
            print("Click item")
//            Navigation.findNavController(itemView).navigate(HomeFragmentDirections.actionHomeFragmentToPlaceItemFragment())
            Toast.makeText(titleItem.context, newModel.title, Toast.LENGTH_SHORT).show()
        }
    }
}