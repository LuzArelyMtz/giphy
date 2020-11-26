package com.giphy.gift.domain.api.models

import com.google.gson.annotations.SerializedName

data class Data (
    @SerializedName("rating")
    private var  rating:String,

    @SerializedName("images")
    private var  images:Images,

    @SerializedName("user")
    private var  user:User
)