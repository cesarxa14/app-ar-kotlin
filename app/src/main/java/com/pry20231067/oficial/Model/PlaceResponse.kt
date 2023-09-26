package com.pry20231067.oficial.Model

import com.google.gson.annotations.SerializedName
import com.pry20231067.oficial.data.Place.Place

data class PlaceResponse (
    @SerializedName("message")
    var message: String,

    @SerializedName("data")
    var data: List<Place>
)