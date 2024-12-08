package com.example.swapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.swapp.ui.theme.SwAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactLayout = findViewById<LinearLayout>(R.id.contact_layout)
        val searchInternetLayout = findViewById<LinearLayout>(R.id.search_internet_layout)
        val searchPhoneLayout = findViewById<LinearLayout>(R.id.search_phone_layout)
        val writerLayout = findViewById<LinearLayout>(R.id.writer_layout)

        contactLayout.setOnClickListener{
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }

        searchInternetLayout.setOnClickListener{
            val intent = Intent(this, SearchInternetActivity::class.java)
            startActivity(intent)
        }

        searchPhoneLayout.setOnClickListener{
            val intent = Intent(this, SearchPhoneActivity::class.java)
            startActivity(intent)
        }

        writerLayout.setOnClickListener{
            val intent = Intent(this, WriterActivity::class.java)
            startActivity(intent)
        }

    }
}