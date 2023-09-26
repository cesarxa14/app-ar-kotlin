package com.pry20231067.oficial.adapter.Review

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pry20231067.oficial.R
import com.pry20231067.oficial.data.Place.Place
import com.pry20231067.oficial.data.Review.Review


class ReviewAdapter(private val reviewList: List<Review>): RecyclerView.Adapter<ReviewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ReviewViewHolder(layoutInflater.inflate(R.layout.item_review, parent, false))
    }

    override fun getItemCount(): Int {
        return reviewList.size
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        val item = reviewList[position]
        holder.render(item)
    }

}