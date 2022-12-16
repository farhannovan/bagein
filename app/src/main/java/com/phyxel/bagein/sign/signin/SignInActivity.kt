package com.phyxel.bagein.sign.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.phyxel.bagein.MainActivity
import com.phyxel.bagein.R
import com.phyxel.bagein.sign.signup.SignUpActivity

//class SignInActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_sign_in)
//
//    }
//}

class SignInActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)

        val btnRegis = findViewById<Button>(R.id.btnRegis)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnRegis.setOnClickListener {
            val i = Intent(this@SignInActivity, SignUpActivity::class.java)
            startActivity(i)
        }
        btnLogin.setOnClickListener {
            val i = Intent(this@SignInActivity, MainActivity::class.java)
            startActivity(i)
        }
        
    }
}