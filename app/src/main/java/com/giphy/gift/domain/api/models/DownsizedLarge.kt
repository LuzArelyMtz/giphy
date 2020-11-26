package com.giphy.gift.domain.api.models

import com.google.gson.annotations.SerializedName

data class DownsizedLarge (
    @SerializedName("height")
    private var  height:String,

    @SerializedName("width")
    private var width:String,


    @SerializedName("url")
    private var url:String
)