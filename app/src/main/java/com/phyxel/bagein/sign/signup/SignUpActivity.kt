package com.phyxel.bagein.sign.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.phyxel.bagein.R
import com.phyxel.bagein.sign.signin.SignInActivity

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
            val i = Intent(this@SignUpActivity, SignUpActivity::class.java)
            startActivity(i)
        }
        btnLogin.setOnClickListener {
            val i = Intent(this@SignUpActivity, SignInActivity::class.java)
            startActivity(i)
        }
    }
}