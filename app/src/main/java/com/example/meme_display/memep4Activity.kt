package com.example.meme_display

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class memep4Activity : AppCompatActivity() {
    lateinit var id_previous4:TextView
    lateinit var id_next4:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memep4)
        id_previous4=findViewById(R.id.id_previous4)
        id_next4=findViewById(R.id.id_next4)
        id_previous4.setOnClickListener {
            val intent=Intent(this,Memep3Activity::class.java)
            startActivity(intent)
        }
        id_next4.setOnClickListener {
            val intent=Intent(this,meme5Activity::class.java)
            startActivity(intent)
        }
    }

}