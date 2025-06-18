package com.example.myapplication.Network

import com.example.myapplication.models.LatestProduct
import retrofit2.http.GET

interface ApiService {
    @GET("latest_products.json")
    suspend fun getLatestProducts(): List<LatestProduct>
}
//This is my API service interface using Retrofit.
//It connects the app to a remote JSON file that holds the latest product data.