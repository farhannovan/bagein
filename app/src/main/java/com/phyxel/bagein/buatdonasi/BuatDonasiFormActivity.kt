package com.phyxel.bagein.buatdonasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.phyxel.bagein.R

class BuatDonasiFormActivity : AppCompatActivity() {
    lateinit var spKategori : Spinner
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buat_donasi_form)

        spKategori = findViewById(R.id.spKategori)

        ArrayAdapter.createFromResource(
            this,
            R.array.kategoriDonasi,
            android.R.layout.simple_spinner_item
        ).also { listKategori ->
            listKategori.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spKategori.adapter = listKategori
        }
    }
}