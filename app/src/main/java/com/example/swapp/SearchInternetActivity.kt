package com.example.swapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity

class SearchInternetActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_search_internet)
    }
}