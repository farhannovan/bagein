package com.phyxel.bagein.aktivitas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.phyxel.bagein.MainActivity
import com.phyxel.bagein.R
import com.phyxel.bagein.databinding.ActivityAktivitasMisiBinding

class AktivitasMisiActivity : AppCompatActivity() {

    lateinit var binding: ActivityAktivitasMisiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAktivitasMisiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnMisiDonasi = findViewById<Button>(R.id.btnMisiDonasi)

        btnMisiDonasi.setOnClickListener {
            val i = Intent(this@AktivitasMisiActivity, MainActivity::class.java)
            startActivity(i)
        }
    }
}