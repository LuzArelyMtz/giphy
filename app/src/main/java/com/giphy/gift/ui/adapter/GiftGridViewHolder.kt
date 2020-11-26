package com.giphy.gift.ui.adapter

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.giphy.gift.R
import com.giphy.gift.domain.api.models.Data
import com.giphy.gift.domain.api.models.DownsizedLarge

class GiftGridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    private val imageView = itemView.findViewById<ImageView>(R.id.imgGift)

    fun bindView(gift: Data) {
       gift.images.downsizedLarge.url
        Glide.with(itemView.context).load(gift.images.downsizedLarge.url).into(imageView)

    }
}