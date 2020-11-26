package com.giphy.gift.domain.api.models

import com.google.gson.annotations.SerializedName

class PreviewGif (
    @SerializedName("height")
    private var  height:String,

    @SerializedName("width")
    private var width:String,

    @SerializedName("url")
    private var url:String
)