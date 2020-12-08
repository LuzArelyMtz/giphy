package com.giphy.gift.domain.api.models

import com.google.gson.annotations.SerializedName

data class DownsizedLarge(
    @SerializedName("height")
    var height: String,

    @SerializedName("width")
    var width: String,


    @SerializedName("url")
    var url: String
)