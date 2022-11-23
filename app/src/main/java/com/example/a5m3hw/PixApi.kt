package com.example.a5m3hw


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixApi {

    @GET("api/")
    fun getImages(
        @Query("key") key: String = "31297794-5eb2e18268c65f7d79d31c22c",
        @Query("q") q : String,
        @Query("page") page: Int = 1,
        @Query("per_page") per_page: Int = 20
    ): Call<PixModel>
}