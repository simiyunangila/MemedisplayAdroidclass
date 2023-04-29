package com.example.meme_display

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Memep3Activity : AppCompatActivity() {
    lateinit var tv_previousp3:TextView
    lateinit var tv_next3 :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memep3)
        tv_previousp3 = findViewById(R.id.tv_previousp3)
        tv_next3=findViewById (R.id.tv_next3)
        tv_previousp3.setOnClickListener {
            val intent = Intent(this,memep2::class.java)
            startActivity(intent)
        }
        tv_next3.setOnClickListener {
            val intent = Intent(this,memep4Activity::class.java)
            startActivity(intent)
        }
    }
}