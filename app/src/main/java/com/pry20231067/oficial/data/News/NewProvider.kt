package com.pry20231067.oficial.data.News

import com.pry20231067.oficial.data.Place.Place

class NewProvider {
    companion object{
        val listNews = listOf<New>(
            New(titular = "Se vienen la elecciones",
                content = "Noticia sobre politica",
                image = "https://cloudfront-us-east-1.images.arcpublishing.com/infobae/P7CVFTZVOBBPZAWY4PTXUFDEAU.png"),
            New(titular = "Comienza el mundial",
                content = "Noticia sobre futbol",
                image = "https://elcomercio.pe/resizer/cH-pxbQCpYhwdXDQMfKVHr3z6MI=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/PT4OTATBYNCGPNSV3KJ3JZSZ6U.jpg"),

        )
    }

}