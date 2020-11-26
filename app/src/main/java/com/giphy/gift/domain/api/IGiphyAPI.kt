package com.giphy.gift.domain.api

import com.giphy.gift.domain.api.models.ResponseGiphy
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface IGiphyAPI {
    @GET("trending")
    fun getResponse(@Query("api_key") term: String="dc6zaTOxFJmzC"): Call<ResponseGiphy>
}