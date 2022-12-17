package com.phyxel.bagein.aktivitas

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.auth.FirebaseAuth
import com.phyxel.bagein.R
import com.phyxel.bagein.databinding.FragmentAktivitasBinding

class AktivitasFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val bind = FragmentAktivitasBinding.inflate(layoutInflater)

        bind.btnMisi.setOnClickListener {
            val intent = Intent (this@AktivitasFragment.requireContext(), AktivitasMisiActivity::class.java)
                startActivity(intent)
        }
        return bind.root
    }
}