package com.pry20231067.oficial.Model

import com.google.gson.annotations.SerializedName
import com.pry20231067.oficial.data.Place.Place

data class RegisterRequest(
    @SerializedName("firstname")
    var firstname: String,
    @SerializedName("lastname")
    var lastname: String,
    @SerializedName("username")
    var username: String,
    @SerializedName("email")
    var email: String,
    @SerializedName("password")
    var password: String,
)
