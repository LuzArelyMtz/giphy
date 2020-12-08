package com.giphy.gift.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.giphy.gift.R
import com.giphy.gift.domain.api.models.Data

class GiftGridAdapter(private val onItemClickListener: OnItemClickListener) :
    ListAdapter<Data, RecyclerView.ViewHolder>(GiftGridDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return GiftGridViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.gift_grid_item, parent, false)
        )
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {

        (viewHolder as GiftGridViewHolder).bindView(onItemClickListener, getItem(position))

    }

}