package com.giphy.gift.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.giphy.gift.domain.api.models.Data
import kotlinx.android.synthetic.main.gift_grid_item.view.*

class GiftGridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


    fun bindView(gift: Data) {
       gift.images.downsizedLarge.url
        Glide.with(itemView.context).load(gift.images.downsizedLarge.url).into(itemView.imgGift)

    }
}