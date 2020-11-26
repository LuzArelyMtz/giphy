package com.giphy.gift.domain.api.models

import com.google.gson.annotations.SerializedName

data class User (
    @SerializedName("display_name")
    var displayName:String
)
