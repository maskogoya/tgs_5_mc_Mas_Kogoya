package com.example.projectandroidmas

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DeskripsiKlub : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_deskripsi_klub)


        val gambar : ImageView = findViewById(R.id.imgKlub)
        val nmKlub : TextView = findViewById(R.id.nmKlub)
        val deskripsi : TextView = findViewById(R.id.desk)


        val bundle: Bundle?= intent.extras
        val bnama = bundle!!.getString("nm")
        val bgambar = bundle.getInt("img")
        val bDeskripsi = bundle.getString("dsk")

        gambar.setImageResource(bgambar)
        nmKlub.text = bnama
        deskripsi.text = bDeskripsi
    }
}