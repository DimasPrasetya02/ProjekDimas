package com.jayakarta.projekdimas.Network.Movies

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
object MoviesNetwork {
    val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("http://192.168.83.133:5000")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MoviesAPI::class.java)
    }
}

