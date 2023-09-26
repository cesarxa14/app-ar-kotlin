package com.pry20231067.oficial.data.Review

import com.pry20231067.oficial.data.Place.Place

class ReviewProvider {
    companion object{
        val listReview = listOf<Review>(
            Review(nameUser = "Cesar Torres", content = "Un lugar muy lindo", rating = 3f),
            Review(nameUser = "Jorge Chavez", content = "Me encanto", rating = 5f),
            Review(nameUser = "Luis Paredes", content = "No me gusto mucho", rating = 1f),
            Review(nameUser = "Camila Rodriguez", content = "Muy bonito", rating = 2f),
            Review(nameUser = "Juan Malpartida", content = "Hermoso el paisaje", rating = 5f),
            Review(nameUser = "Angie Ascarruz", content = "Quiero regresar", rating = 4f),

        )
    }

}