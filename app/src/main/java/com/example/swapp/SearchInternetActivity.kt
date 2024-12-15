package com.example.swapp

import android.os.Bundle
import android.os.PersistableBundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class SearchInternetActivity : ComponentActivity() {

    private lateinit var webView: WebView
    private lateinit var urlEditText: EditText
    private lateinit var goButton: Button
    private lateinit var backButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_search_internet)

        webView = findViewById(R.id.webview)
        urlEditText = findViewById(R.id.edit_url)
        goButton = findViewById(R.id.button_go)
        backButton = findViewById(R.id.button_back)

        // WebView 설정
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true

        // 이동 버튼 클릭 이벤트
        goButton.setOnClickListener {
            val url = urlEditText.text.toString()
            if (url.isNotEmpty()) {
                val formattedUrl = if (url.startsWith("http://") || url.startsWith("https://")) {
                    url
                } else {
                    "http://$url"
                }
                webView.loadUrl(formattedUrl)
            }
        }

        // 뒤로 가기 버튼 클릭 이벤트
        backButton.setOnClickListener {
            finish()
        }
    }
}