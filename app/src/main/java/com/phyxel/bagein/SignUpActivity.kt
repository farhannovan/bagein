package com.phyxel.bagein

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//class SignUpActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_sign_up)
//    }
//}

class SignUpActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnRegis = findViewById<Button>(R.id.btnRegis)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnRegis.setOnClickListener {
            val i = Intent(this@SignUpActivity, SignInActivity::class.java)
            startActivity(i)
        }
        btnLogin.setOnClickListener {
            val i = Intent(this@SignUpActivity, SignInActivity::class.java)
            startActivity(i)
        }
    }
}