package com.giphy.gift.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.giphy.gift.domain.api.models.Data
import kotlinx.android.synthetic.main.gift_grid_item.view.*

class GiftGridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindView(listener: OnItemClickListener, gif: Data) {
        Glide.with(itemView.context).load(gif.images.previewGif.url).into(itemView.imgGift)
        itemView.setOnClickListener({
            listener.onClick(itemView, gif)
        })
    }
}