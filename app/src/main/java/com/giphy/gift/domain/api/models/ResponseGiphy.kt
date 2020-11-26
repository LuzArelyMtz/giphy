package com.giphy.gift.domain.api.models

import com.google.gson.annotations.SerializedName

data class ResponseGiphy(
    @SerializedName("data")
    var giftList: List<Data>
)
