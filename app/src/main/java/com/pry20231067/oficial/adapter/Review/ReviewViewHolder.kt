package com.pry20231067.oficial.adapter.Review

import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.pry20231067.oficial.R
import com.pry20231067.oficial.data.Place.Place
import com.pry20231067.oficial.data.Review.Review

class ReviewViewHolder(view: View): ViewHolder(view) {

    val nameUser = view.findViewById<TextView>(R.id.tv_name_user_review)
    val content = view.findViewById<TextView>(R.id.tv_content_review)
//    val rating = view.findViewById<RatingBar>(R.id.rating_review)

    fun render(reviewModel: Review){
        nameUser.text = reviewModel.nameUser
        content.text = reviewModel.content
//        rating.rating = reviewModel.rating

        itemView.setOnClickListener{
            print("Click item")
//            Navigation.findNavController(itemView).navigate(HomeFragmentDirections.actionHomeFragmentToPlaceItemFragment())
            Toast.makeText(content.context, "Hola", Toast.LENGTH_SHORT).show()
        }
    }
}