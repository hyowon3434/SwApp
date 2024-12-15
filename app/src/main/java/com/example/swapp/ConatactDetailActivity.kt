package com.example.swapp

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class ConatactDetailActivity : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.contact_detail_activity)

        val backButton: ImageButton = findViewById(R.id.button_back)
        backButton.setOnClickListener {
            finish()
        }

        // 저장 버튼 클릭 이벤트
        val saveButton: Button = findViewById(R.id.button_save)
        saveButton.setOnClickListener {
            // 저장 로직
        }

        // 공유 버튼 클릭 이벤트
        val shareButton: Button = findViewById(R.id.button_share)
        shareButton.setOnClickListener {
            // 공유 로직
        }

        // 삭제 버튼 클릭 이벤트
        val deleteButton: Button = findViewById(R.id.button_delete)
        deleteButton.setOnClickListener {
            // 삭제 로직
        }

    }

}