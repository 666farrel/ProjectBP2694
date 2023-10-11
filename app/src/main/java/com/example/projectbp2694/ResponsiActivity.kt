package com.example.projectbp2694

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ResponsiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_responsi)

        //instance
    val call:ImageView = findViewById(R.id.imageView4)
        // dial number
    call.setOnClickListener {
        val callIntent : Intent = Uri.parse("tel:(0274) 884201").let {
            number-> Intent(Intent.ACTION_DIAL,number)
        }
        startActivity(callIntent)
    }
    }
}

