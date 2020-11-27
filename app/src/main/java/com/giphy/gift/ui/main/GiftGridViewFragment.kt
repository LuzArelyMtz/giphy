package com.giphy.gift.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.giphy.gift.R
import com.giphy.gift.domain.api.GiphyAPIImpl
import com.giphy.gift.domain.api.IGiphyAPI
import com.giphy.gift.domain.api.models.Data
import com.giphy.gift.domain.api.models.ResponseGiphy
import com.giphy.gift.ui.adapter.GiftGridAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GiftGridViewFragment : Fragment() {

    companion object {
        fun newInstance() = GiftGridViewFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.giftgridview_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val gridGifts: RecyclerView = requireActivity().findViewById(R.id.gridGifts)
        gridGifts?.layoutManager = GridLayoutManager(requireActivity(),2)




        val giphyService:IGiphyAPI=GiphyAPIImpl().provideRetrofit().create(IGiphyAPI::class.java)
        val call: Call<com.giphy.gift.domain.api.models.ResponseGiphy> = giphyService.getResponse()
        call.enqueue(object : Callback<com.giphy.gift.domain.api.models.ResponseGiphy> {
            override fun onFailure(call: Call<ResponseGiphy>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call<ResponseGiphy>, response: Response<ResponseGiphy>) {
                Log.d("Giphy",response.body().toString())

                var responseBody=response.body().toString()
                var giftDataList=response.body()?.giftList?: ArrayList()

                val gridAdapter = GiftGridAdapter(giftDataList)
                gridGifts.adapter = gridAdapter


            }

        })





        // TODO: Use the ViewModel
    }

}