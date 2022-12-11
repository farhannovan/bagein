package com.phyxel.bagein

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.phyxel.bagein.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(DonasiFragment())

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        binding.bottomNavbar.setOnItemSelectedListener {

            when(it.itemId){

                R.id.nav_donasi -> replaceFragment(DonasiFragment())
                R.id.nav_buatdonasi -> replaceFragment(DonasiDetailFragment())
                R.id.nav_aktivitas -> replaceFragment(AktivitasFragment())
                R.id.nav_akun -> replaceFragment(OnboardingFragment())

                else ->{

                }

            }

            true

        }

    }

    private fun replaceFragment(fragment : Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }
}