package com.example.ataraxia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PromoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promo)

        val navDashboard = findViewById<ImageView>(R.id.imageView18)
        val navPesanan = findViewById<ImageView>(R.id.imageView19)
        val navPromo = findViewById<ImageView>(R.id.imageView22)
        val navProfile = findViewById<ImageView>(R.id.imageView21)

        navDashboard.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
            finish()
        }

        navPesanan.setOnClickListener {
            startActivity(Intent(this, PesananActivity::class.java))
            finish()
        }

        navPromo.setOnClickListener {
        }

        navProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }
    }
}
