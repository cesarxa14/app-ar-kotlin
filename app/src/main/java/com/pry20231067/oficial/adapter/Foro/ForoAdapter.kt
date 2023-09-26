package com.pry20231067.oficial.adapter.Foro

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pry20231067.oficial.R
import com.pry20231067.oficial.data.Foro.PostForo
import com.pry20231067.oficial.data.News.New
import com.pry20231067.oficial.data.Place.Place


class ForoAdapter(private val postForoList: List<PostForo>): RecyclerView.Adapter<ForoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ForoViewHolder(layoutInflater.inflate(R.layout.item_post_foro, parent, false))
    }

    override fun getItemCount(): Int {
        return postForoList.size
    }

    override fun onBindViewHolder(holder: ForoViewHolder, position: Int) {
        val item = postForoList[position]
        holder.render(item)
    }

}