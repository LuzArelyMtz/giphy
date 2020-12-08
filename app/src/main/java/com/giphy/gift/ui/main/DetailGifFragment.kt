package com.giphy.gift.ui.main

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.giphy.gift.R
import com.giphy.gift.domain.api.models.Data
import com.giphy.gift.ui.adapter.GiftGridAdapter
import kotlinx.android.synthetic.main.datailsgif_fragment.*
import kotlinx.android.synthetic.main.gift_grid_item.view.*

class DetailGifFragment : Fragment() {

    companion object {
        @JvmStatic
        fun newInstance(data: Data) = DetailGifFragment().apply {
            arguments = Bundle().apply {
                putParcelable("data", data)
            }
        }

        lateinit var data: Data
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.datailsgif_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        Glide.with(requireActivity()).load(data.images.downsizedLarge.url).into(imgGifLarge)
        tvDisplayName.setText(data.user?.displayName)
        tvRating.setText(data?.rating)
        tvImGSource.setText(data.images?.downsizedLarge?.url)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        arguments?.getParcelable<Data>("data")?.let {
            data = it
        }
    }

}