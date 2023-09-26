package com.pry20231067.oficial.data.Foro

import com.pry20231067.oficial.data.Place.Place

class PostsForoProvider {
    companion object{
        val listPostsForo = listOf<PostForo>(
            PostForo(title = "Pregunta del Foro 1",
                content = "Aqui va cualquier description relaciona al post 1"),
            PostForo(title = "Pregunta del Foro 2",
                content = "Aqui va cualquier description relaciona al post 2")
        )
    }

}