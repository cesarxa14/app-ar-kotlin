package com.pry20231067.oficial.Model

import com.google.gson.annotations.SerializedName

 class User (

    @SerializedName("_id")
    private val _id: String,

    @SerializedName("firstname")
    private val firstname: String,

    @SerializedName("lastname")
    private val lastname: String,

    @SerializedName("username")
    private val username: String,

    @SerializedName("urlImageProfile")
    private val urlImageProfile: String,

    @SerializedName("email")
    private val email: String,

    @SerializedName("createdAt")
    private val createdAt: String,

    @SerializedName("updatedAt")
    private val updatedAt: String

)
