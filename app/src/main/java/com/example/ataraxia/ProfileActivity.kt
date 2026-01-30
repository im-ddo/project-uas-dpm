package com.example.ataraxia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imageView18 = findViewById<ImageView>(R.id.imageView18)
        val imageView19 = findViewById<ImageView>(R.id.imageView19)
        val imageView22 = findViewById<ImageView>(R.id.imageView22)
        val imageView21 = findViewById<ImageView>(R.id.imageView21)

        imageView18.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
            finish()
        }

        imageView19.setOnClickListener {
            startActivity(Intent(this, PesananActivity::class.java))
            finish()
        }

        imageView22.setOnClickListener {
            startActivity(Intent(this, PromoActivity::class.java))
            finish()
        }

        imageView21.setOnClickListener {
            Toast.makeText(this, "Kamu sudah di Profile", Toast.LENGTH_SHORT).show()
        }
    }
}
