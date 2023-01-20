package com.phyxel.bagein.donasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.phyxel.bagein.MainActivity
import com.phyxel.bagein.R
import com.phyxel.bagein.aktivitas.AktivitasMisiActivity
import com.phyxel.bagein.databinding.ActivityDonasiPembayaranSuksesBinding

class DonasiPembayaranSuksesActivity : AppCompatActivity() {

    lateinit var binding: ActivityDonasiPembayaranSuksesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDonasiPembayaranSuksesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnLanjut = findViewById<Button>(R.id.btnLanjut)
        val btnDonasiLagi = findViewById<Button>(R.id.btnDonasiLagi)


        btnLanjut.setOnClickListener {
            val i = Intent(this@DonasiPembayaranSuksesActivity, AktivitasMisiActivity::class.java)
            startActivity(i)
        }

        btnDonasiLagi.setOnClickListener {
            val i = Intent(this@DonasiPembayaranSuksesActivity, MainActivity::class.java)
            startActivity(i)
        }
    }
}