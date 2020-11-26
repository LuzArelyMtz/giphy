package com.giphy.gift

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.giphy.gift.ui.main.GiftGridViewFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, GiftGridViewFragment.newInstance())
                    .commitNow()
        }
    }
}