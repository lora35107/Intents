package com.example.intentsandroidlora

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
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

        btnEmail.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO,Uri.fromParts("mail to","serenawakesho@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "JOB APPLICATION")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear madam .......")
            startActivity(Intent.createChooser(emailIntent, "Send email"))
        }

        btnCamera.setOnClickListener { val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(takePictureIntent, 1)
        }

        btnMpesa.setOnClickListener {
            val simToolkitIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolkitIntent?.let { startActivity(it) }

        }

        btnSite.setOnClickListener {
            // code to navigate from one activity to another
            val gotoanotheractivity =Intent(this, WebsiteActivity::class.java)
            startActivity( gotoanotheractivity)
        }

















    }
}