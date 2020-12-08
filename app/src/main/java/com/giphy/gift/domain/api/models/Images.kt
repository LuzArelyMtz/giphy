package com.giphy.gift.domain.api.models

import com.google.gson.annotations.SerializedName

data class Images(
    @SerializedName("downsized_large")
    var downsizedLarge: DownsizedLarge,

    @SerializedName("preview_gif")
    var previewGif: PreviewGif
)