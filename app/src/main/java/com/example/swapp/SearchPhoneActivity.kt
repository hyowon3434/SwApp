package com.example.swapp

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class SearchPhoneActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_search_phone)

        // 뒤로 가기 버튼 설정
        val backButton: ImageButton = findViewById(R.id.button_back)
        backButton.setOnClickListener {
            finish()
        }
    }
}