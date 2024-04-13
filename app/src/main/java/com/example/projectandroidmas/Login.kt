package com.example.projectandroidmas

import android.content.Intent
import android.net.wifi.hotspot2.pps.HomeSp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectandroidmas.databinding.ActivityLoginBinding
import com.example.projectandroidmas.databinding.ActivityRegisterBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Link ke Register
        binding.tvLinkToRegister.setOnClickListener{
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

        // Link ke lupa password
        binding.linkLupaPassword.setOnClickListener{
            val intent = Intent(this, LupaPassword::class.java)
            startActivity(intent)
        }

        // Tombol ke MainActivity / Home
        binding.loginBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}