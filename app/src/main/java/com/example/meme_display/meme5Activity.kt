package com.example.meme_display

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme5Activity : AppCompatActivity() {
    lateinit var id_previous5:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        id_previous5=findViewById(R.id.id_previous5)
        id_previous5.setOnClickListener {
            val intent=Intent(this,memep4Activity::class.java)
            startActivity(intent)
        }
    }
}