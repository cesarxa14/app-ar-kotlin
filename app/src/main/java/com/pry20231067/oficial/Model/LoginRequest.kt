package com.pry20231067.oficial.Model

import com.google.gson.annotations.SerializedName
import com.pry20231067.oficial.data.Place.Place

data class LoginRequest(
    @SerializedName("username")
    var username: String,

    @SerializedName("password")
    var password: String
)
