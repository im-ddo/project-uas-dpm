package com.example.ataraxia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val imgNasiGoreng = findViewById<ImageView>(R.id.imageView41)
        val imgMieGoreng = findViewById<ImageView>(R.id.imageView40)
        val imgBihunGoreng = findViewById<ImageView>(R.id.imageView39)
        val imgKwetiauGoreng = findViewById<ImageView>(R.id.imageView42)

        val navDashboard = findViewById<ImageView>(R.id.imageView18)
        val navPesanan = findViewById<ImageView>(R.id.imageView19)
        val navPromo = findViewById<ImageView>(R.id.imageView22)
        val navProfile = findViewById<ImageView>(R.id.imageView21)

        imgNasiGoreng.setOnClickListener {
            startActivity(Intent(this, KlikNasiGorengActivity::class.java))
            finish()
        }

        imgMieGoreng.setOnClickListener {
            startActivity(Intent(this, KlikMieGorengActivity::class.java))
            finish()
        }

        imgBihunGoreng.setOnClickListener {
            startActivity(Intent(this, KlikBihunGorengActivity::class.java))
            finish()
        }

        imgKwetiauGoreng.setOnClickListener {
            startActivity(Intent(this, KlikKwetiauGorengActivity::class.java))
            finish()
        }

        navPesanan.setOnClickListener {
            startActivity(Intent(this, PesananActivity::class.java))
            finish()
        }

        navPromo.setOnClickListener {
            startActivity(Intent(this, PromoActivity::class.java))
            finish()
        }

        navProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }
    }
}
