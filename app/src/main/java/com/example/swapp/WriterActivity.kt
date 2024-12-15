package com.example.swapp

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class WriterActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_writer)

        val backButton: ImageButton = findViewById(R.id.button_back)
        backButton.setOnClickListener {
            finish()
        }
    }
}