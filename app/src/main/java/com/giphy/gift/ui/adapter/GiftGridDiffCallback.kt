package com.giphy.gift.ui.adapter

import androidx.recyclerview.widget.DiffUtil
import com.giphy.gift.domain.api.models.Data

class GiftGridDiffCallback : DiffUtil.ItemCallback<Data>() {
    override fun areItemsTheSame(oldItem: Data, newItem: Data) =
        oldItem.images.downsizedLarge.url == newItem.images.downsizedLarge.url

    override fun areContentsTheSame(oldItem: Data, newItem: Data) = oldItem == newItem
}