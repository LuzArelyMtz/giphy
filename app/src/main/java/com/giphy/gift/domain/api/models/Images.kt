package com.giphy.gift.domain.api.models

import com.google.gson.annotations.SerializedName

data class Images(
    @SerializedName("downsized_large")
    private var downsizedLarge:DownsizedLarge,

    @SerializedName("preview_gif")
    private var previewGif:PreviewGif
)