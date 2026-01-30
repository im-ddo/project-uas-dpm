package com.example.ataraxia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PesananActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pesanan)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonPesan = findViewById<Button>(R.id.button)

        val imageView29 = findViewById<ImageView>(R.id.imageView29)

        val imageView31 = findViewById<ImageView>(R.id.imageView31)
        val imageView37 = findViewById<ImageView>(R.id.imageView37)
        val imageView32 = findViewById<ImageView>(R.id.imageView32)
        val imageView33 = findViewById<ImageView>(R.id.imageView33)

        buttonPesan.setOnClickListener {
            startActivity(Intent(this, PembayaranSuksesActivity::class.java))
            finish()
        }

        imageView29.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
            finish()
        }

        imageView31.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
            finish()
        }

        imageView37.setOnClickListener {
            Toast.makeText(this, "Kamu sudah di Pesanan", Toast.LENGTH_SHORT).show()
        }

        imageView32.setOnClickListener {
            startActivity(Intent(this, PromoActivity::class.java))
            finish()
        }

        imageView33.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }
    }
}
