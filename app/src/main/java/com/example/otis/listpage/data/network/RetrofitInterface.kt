package com.example.otis.listpage.data.network

import com.example.otis.listpage.data.dto.Response
import retrofit2.http.GET

interface RetrofitInterface {

    @GET("v3/qs/66584a5be41b4d34e4fbd002")
    suspend fun getDetails(): Response

    //https://api.jsonbin.io/v3/qs/66584a5be41b4d34e4fbd002
}