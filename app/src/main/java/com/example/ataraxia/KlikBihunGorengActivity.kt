package com.example.ataraxia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class KlikBihunGorengActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_klikbihungoreng)

        val btnBack = findViewById<ImageView>(R.id.imageView48)
        val btnTambah = findViewById<Button>(R.id.button5)

        btnBack.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
            finish()
        }

        btnTambah.setOnClickListener {
            startActivity(Intent(this, PesananActivity::class.java))
            finish()
        }
    }
}
