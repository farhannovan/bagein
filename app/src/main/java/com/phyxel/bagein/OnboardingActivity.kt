package com.phyxel.bagein

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

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