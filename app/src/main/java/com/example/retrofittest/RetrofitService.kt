package com.example.retrofittest

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {

    @GET("SandartLanguages.json")
    fun getJsonData(@Query("Contry") Contry: String): Call<RetrofitResponse>

}