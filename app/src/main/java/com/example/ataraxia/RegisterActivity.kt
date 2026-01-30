package com.example.ataraxia

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnBack = findViewById<ImageView>(R.id.imageView2)
        val etUsername = findViewById<EditText>(R.id.editTextText)
        val etEmail = findViewById<EditText>(R.id.editTextText2)
        val etPassword = findViewById<EditText>(R.id.editTextText3)
        val etConfirm = findViewById<EditText>(R.id.editTextText4)
        val btnRegister = findViewById<Button>(R.id.button3)

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        etPassword.inputType =
            InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
        etConfirm.inputType =
            InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD

        btnRegister.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()
            val confirm = etConfirm.text.toString().trim()

            if (username.isEmpty()) {
                etUsername.error = "Username wajib diisi"
                etUsername.requestFocus()
                return@setOnClickListener
            }

            if (email.isEmpty()) {
                etEmail.error = "Email wajib diisi"
                etEmail.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                etPassword.error = "Password wajib diisi"
                etPassword.requestFocus()
                return@setOnClickListener
            }

            if (confirm.isEmpty()) {
                etConfirm.error = "Confirm password wajib diisi"
                etConfirm.requestFocus()
                return@setOnClickListener
            }

            if (password != confirm) {
                etConfirm.error = "Password tidak sama"
                etConfirm.requestFocus()
                return@setOnClickListener
            }

            Toast.makeText(this, "Register berhasil", Toast.LENGTH_SHORT).show()

            // pindah ke Dashboard
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
