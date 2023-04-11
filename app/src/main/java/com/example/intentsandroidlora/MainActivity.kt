package com.example.intentsandroidlora

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.net.URI

class MainActivity : AppCompatActivity() {
    lateinit var btnSms : Button
    lateinit var btnEmail : Button
    lateinit var btnShare : Button
    lateinit var btnMap : Button
    lateinit var btnSite : Button
    lateinit var btnMpesa : Button
    lateinit var btnCamera : Button
    lateinit var btnCall : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCall = findViewById(R.id.btn_call)
        btnSms = findViewById(R.id.btn_sms)
        btnMap = findViewById(R.id.btn_map)
        btnEmail = findViewById(R.id.btn_email)
        btnCamera =  findViewById(R.id.btn_camera)
        btnShare = findViewById(R.id.btn_share)
        btnSite = findViewById(R.id.btn_site)
        btnMpesa = findViewById(R.id.btn_mpesa)

        btnSms.setOnClickListener {
            val uri: Uri = Uri.parse( "smsto: 0757931165")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "Bananas are rich in Potassium")
            startActivity(intent)
        }







    }
}