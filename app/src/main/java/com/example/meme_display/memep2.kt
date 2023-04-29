package com.example.meme_display

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class memep2 : AppCompatActivity() {
    lateinit var tv_previous: TextView
    lateinit var tv_nextp1 : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memep2)
        tv_previous = findViewById(R.id.tv_previous)
        tv_nextp1 = findViewById(R.id.tv_nextp1)
        tv_previous.setOnClickListener {
            val intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
        }
        tv_nextp1.setOnClickListener {
            val intent = Intent (this,Memep3Activity::class.java)
            startActivity(intent)
        }
    }
}