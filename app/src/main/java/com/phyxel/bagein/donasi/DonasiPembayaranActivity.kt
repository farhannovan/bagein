package com.phyxel.bagein.donasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.phyxel.bagein.R
import android.content.Intent
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import com.phyxel.bagein.databinding.ActivityDonasiPembayaranBinding
import java.lang.NumberFormatException


class DonasiPembayaranActivity : AppCompatActivity() {

    private var status10K : Boolean = false
    lateinit var binding: ActivityDonasiPembayaranBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDonasiPembayaranBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        initListener()

    }

    private fun initListener() {
        binding.btnDonasiBayar.setOnClickListener {
            startActivity(Intent(this, DonasiPembayaranSuksesActivity::class.java))
        }

        binding.tv10k.setOnClickListener {
            if (status10K) {
                deselectMoney(binding.tv10k)
            } else {
                selectMoney(binding.tv10k)
            }
        }

        binding.etAmount.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(
                s: CharSequence,
                start: Int,
                before: Int,
                count: Int
            ) { }

            override fun beforeTextChanged(
                s: CharSequence,
                start: Int,
                count: Int,
                after: Int
            ) {  }

            override fun afterTextChanged(s: Editable) {
                try {
                    if (s.toString().toInt() >= 10000) {
                        binding.btnDonasiBayar.visibility = View.VISIBLE
                    } else {
                        binding.tv10k.setTextColor(resources.getColor(R.color.neutral_900))
                        binding.tv10k.setBackgroundResource(R.drawable.shape_line_neutral)
                        status10K = false
                        binding.btnDonasiBayar.visibility = View.INVISIBLE
                    }
                } catch (e : NumberFormatException) {
                    binding.tv10k.setTextColor(resources.getColor(R.color.neutral_900))
                    binding.tv10k.setBackgroundResource(R.drawable.shape_line_neutral)
                    status10K = false
                    binding.btnDonasiBayar.visibility = View.INVISIBLE
                }
            }
        })
    }

    private fun selectMoney(textView:TextView){
        textView.setTextColor(resources.getColor(R.color.primary_500))
        textView.setBackgroundResource(R.drawable.shape_line_primary)
        status10K = true

        binding.btnDonasiBayar.visibility = View.VISIBLE
        binding.etAmount.setText("10000")
    }

    private fun deselectMoney(textView:TextView){
        textView.setTextColor(resources.getColor(R.color.neutral_900))
        textView.setBackgroundResource(R.drawable.shape_line_neutral)
        status10K = false

        binding.btnDonasiBayar.visibility = View.INVISIBLE
        binding.etAmount.setText("")
    }

}
