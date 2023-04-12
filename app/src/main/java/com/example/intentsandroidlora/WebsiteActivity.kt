package com.example.intentsandroidlora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebsiteActivity : AppCompatActivity() {
    private lateinit var myWeb :WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)
        myWeb = findViewById(R.id.myweb)
        val websettings = myWeb.settings
        websettings.javaScriptEnabled = true
        myWeb.loadUrl("https://new.mukmik.co.ke" )
    }
}