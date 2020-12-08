package com.giphy.gift


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.giphy.gift.ui.main.DetailGifFragment
import com.giphy.gift.ui.main.GiftGridViewFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, GiftGridViewFragment.newInstance())
                .commitNow()
        }
    }
}