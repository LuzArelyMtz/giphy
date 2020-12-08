package com.giphy.gift.ui.adapter

import android.view.View
import com.giphy.gift.domain.api.models.Data

interface OnItemClickListener  {
    fun onClick(v: View?,data: Data) {
    }
}