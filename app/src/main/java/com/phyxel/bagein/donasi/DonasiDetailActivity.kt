package com.phyxel.bagein.donasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.phyxel.bagein.databinding.ActivityDonasiDetailBinding

class DonasiDetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityDonasiDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDonasiDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListener()

    }

    private fun initListener() {
        binding.btnDonasiSekarang.setOnClickListener {
            startActivity(Intent(this, DonasiPembayaranActivity::class.java))
        }
    }

}