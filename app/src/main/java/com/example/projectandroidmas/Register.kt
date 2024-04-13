package com.example.projectandroidmas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectandroidmas.databinding.ActivityLoginBinding
import com.example.projectandroidmas.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Tombol ke lupa Login
        binding.btnRegister.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity (intent)
        }

        // Link ke lupa Login
        binding.tvKeLogin.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity (intent)
        }
    }
}