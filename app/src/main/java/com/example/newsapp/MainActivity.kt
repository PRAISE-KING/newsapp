package com.example.newsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sportbtn = findViewById<Button>(R.id.sports)
        sportbtn.setOnClickListener{
            var intent = Intent(applicationContext, SportActivity::class.java)
            startActivity(intent)
        }

        var bbcnews = findViewById<Button>(R.id.BBC)
        bbcnews.setOnClickListener{
            var bbcIntent = Intent (Intent.ACTION_VIEW, Uri.parse("https://www.bbc.com"))
            startActivity(bbcIntent)
        }

        var dialer = findViewById<Button>(R.id.Dial)
        dialer.setOnClickListener {
            var dialIntent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:0793008586"))
            startActivity(dialIntent)
        }

        var cameraCapture = findViewById<Button>(R.id.Camera)
        cameraCapture.setOnClickListener{
            var camIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(camIntent)
        }
    } //end onCreate
}