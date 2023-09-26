package com.pry20231067.oficial.Model

import com.google.gson.annotations.SerializedName


 data class UserResponse (
     @SerializedName("message")
     var message: String,

     @SerializedName("data")
     var data: List<User>
)
