package com.pry20231067.oficial.Api

import android.service.autofill.UserData
import com.pry20231067.oficial.Model.LoginRequest
import com.pry20231067.oficial.Model.LoginResponse
import com.pry20231067.oficial.Model.PlaceResponse
import com.pry20231067.oficial.Model.RegisterRequest
import com.pry20231067.oficial.Model.RegisterResponse
import com.pry20231067.oficial.Model.UserResponse
import com.pry20231067.oficial.Model.UserResponseUnique

import retrofit2.Response
import retrofit2.http.Body

import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Url

interface ApiService {

    @GET
    suspend fun getUser(@Url url: String): Response<UserResponse>

    @GET
    suspend fun getPlaces(@Url url: String): Response<PlaceResponse>

    @GET
    suspend fun getUserByID(@Url url: String): Response<UserResponseUnique>

    @POST
    suspend fun login(@Url url: String,@Body request: LoginRequest): Response<LoginResponse>

    @POST
    suspend fun register(@Url url: String,@Body request: RegisterRequest): Response<RegisterResponse>
}