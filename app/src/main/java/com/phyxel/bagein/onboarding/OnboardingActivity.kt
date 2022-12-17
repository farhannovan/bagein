package com.phyxel.bagein.onboarding

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import com.phyxel.bagein.R
import com.phyxel.bagein.databinding.ActivityOnboardingBinding
import com.phyxel.bagein.sign.signin.SignInActivity
import com.phyxel.bagein.sign.signup.SignUpActivity

//class OnboardingActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_onboarding)
//    }
//}

class OnboardingActivity : AppCompatActivity()
{
    private lateinit var binding : ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        this.window.apply {
            clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or  View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            }
            statusBarColor = Color.TRANSPARENT
        }

        val btnRegis = findViewById<Button>(R.id.btnRegis)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnRegis.setOnClickListener {
            val i = Intent(this@OnboardingActivity, SignUpActivity::class.java)
            startActivity(i)
        }
        btnLogin.setOnClickListener {
            val i = Intent(this@OnboardingActivity, SignInActivity::class.java)
            startActivity(i)
        }
    }
}