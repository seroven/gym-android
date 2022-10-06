package com.tecfit.gym_android.retrofit

import com.tecfit.gym_android.models.Product
import com.tecfit.gym_android.models.Trainer
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiService  {

    @GET("product/all")
    fun getProducts():Call<List<Product>>

    @GET("trainer/all")
    fun getTrainers():Call<List<Trainer>>
}