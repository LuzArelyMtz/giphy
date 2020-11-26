package com.giphy.gift.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.giphy.gift.R
import com.giphy.gift.domain.api.models.Data
import com.giphy.gift.domain.api.models.DownsizedLarge

class GiftGridAdapter(private var giftList:List<Data>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return GiftGridViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.gift_grid_item, parent, false))
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {

        val viewHolder = viewHolder as GiftGridViewHolder
        viewHolder.bindView(giftList.get(position))

    }

    override fun getItemCount(): Int =giftList.size
}