package com.giphy.gift.domain.api.models

import com.google.gson.annotations.SerializedName

class PreviewGif (
    @SerializedName("height")
    var  height:String,

    @SerializedName("width")
    var width:String,

    @SerializedName("url")
    var url:String
)