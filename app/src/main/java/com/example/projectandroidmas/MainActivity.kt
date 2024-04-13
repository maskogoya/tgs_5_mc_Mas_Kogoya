package com.example.projectandroidmas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectandroidmas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    private lateinit var dataRecyclerView: RecyclerView
    private lateinit var namaJudul: Array<String>
    private lateinit var gambarKlub: Array<Int>
    private lateinit var deskripsi: Array<String>
    private lateinit var listKlub: ArrayList<DataClub>


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        gambarKlub = arrayOf(
            R.drawable.madrid,
            R.drawable.muncen,
            R.drawable.totham,
            R.drawable.city,
            R.drawable.atletico,
            R.drawable.dortmun,
            R.drawable.barca,
            R.drawable.psg,
            R.drawable.inter,
            R.drawable.napoli,
            R.drawable.juven,
            R.drawable.sevila
        )

        namaJudul = arrayOf(
            "Real Madrid",
            "Bayern Muncen",
            "Tothenham Spurs",
            "Manchester City",
            "Atletico Bilbao",
            "Borussia Dortmund",
            "Barcelona",
            "Parist Saint German",
            "Inter Milan",
            "Napolli",
            "Juventus",
            "Sevila",
        )

        deskripsi = arrayOf(
            getString(R.string.madrid),
            getString(R.string.muncen),
            getString(R.string.totham),
            getString(R.string.totham),
            getString(R.string.city),
            getString(R.string.atletico),
            getString(R.string.dortmung),
            getString(R.string.barca),
            getString(R.string.psg),
            getString(R.string.milan),
            getString(R.string.napoli),
            getString(R.string.juventus),
            getString(R.string.sevila)
        )

        dataRecyclerView = findViewById(R.id.listData)
        dataRecyclerView.layoutManager = LinearLayoutManager(this)

        listKlub = arrayListOf<DataClub>()
        getDataKlub()

    }

    private fun getDataKlub() {
        for (i in gambarKlub.indices) {
            val dataKlub = DataClub(gambarKlub[i], namaJudul[i])
            listKlub.add(dataKlub)
        }

        var adapter = KlubAdapter(listKlub)
        dataRecyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : KlubAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@MainActivity, DeskripsiKlub::class.java)
                intent.putExtra("img", listKlub[position].img)
                intent.putExtra("nm", listKlub[position].namaKlub)
                intent.putExtra("dsk", deskripsi[position])
                startActivity(intent)
            }

        })


    }
}