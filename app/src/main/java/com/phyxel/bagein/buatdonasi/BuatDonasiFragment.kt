package com.phyxel.bagein.buatdonasi

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.phyxel.bagein.R
import com.phyxel.bagein.databinding.FragmentBuatDonasiBinding

class BuatDonasiFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val bind = FragmentBuatDonasiBinding.inflate(layoutInflater)

        bind.ibTambah.setOnClickListener {
            val intent = Intent (this@BuatDonasiFragment.requireContext(), BuatDonasiFormActivity::class.java)
            startActivity(intent)
        }
        return bind.root
    }
}