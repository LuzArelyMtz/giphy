package com.giphy.gift.domain.api.models

import com.google.gson.annotations.SerializedName

data class Data (
    @SerializedName("rating")
    var  rating:String,

    @SerializedName("images")
    var  images:Images,

    @SerializedName("user")
    var  user:User
)