package com.phyxel.bagein.donasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.phyxel.bagein.MainActivity
import com.phyxel.bagein.databinding.ActivityDonasiPembayaranSuksesBinding

class DonasiPembayaranSuksesActivity : AppCompatActivity() {

    lateinit var binding: ActivityDonasiPembayaranSuksesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDonasiPembayaranSuksesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListener()

    }

    private fun initListener() {
        binding.btnDonasiLagi.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}