package com.phyxel.bagein.donasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.phyxel.bagein.MainActivity
import com.phyxel.bagein.databinding.ActivityDonasiPembayaranGagalBinding

class DonasiPembayaranGagalActivity : AppCompatActivity() {

    lateinit var binding: ActivityDonasiPembayaranGagalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDonasiPembayaranGagalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListener()

    }

    private fun initListener() {
        binding.btnDonasiLagi.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}