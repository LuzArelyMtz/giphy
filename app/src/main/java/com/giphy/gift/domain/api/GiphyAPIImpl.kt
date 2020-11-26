package com.giphy.gift.domain.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GiphyAPIImpl {
    val URLBASE:String="https://api.giphy.com/v1/gifs/"



    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(URLBASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun provideUserService():IGiphyAPI{
        return provideRetrofit().create(IGiphyAPI::class.java)
    }
}