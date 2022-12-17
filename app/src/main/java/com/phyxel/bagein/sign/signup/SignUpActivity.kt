package com.phyxel.bagein.sign.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.google.firebase.auth.FirebaseAuth
import com.phyxel.bagein.R
import com.phyxel.bagein.databinding.ActivitySignUpBinding
import com.phyxel.bagein.sign.signin.SignInActivity

//class SignUpActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_sign_up)
//    }
//}

class SignUpActivity : AppCompatActivity()
{

    lateinit var binding: ActivitySignUpBinding
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        auth = FirebaseAuth.getInstance()

        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }

        binding.btnRegis.setOnClickListener {
            val email = binding.etEmailRegis.text.toString()
            val password = binding.etPasswordRegis.text.toString()

            //Validasi email
            if (email.isEmpty()) {
                binding.etEmailRegis.error = "Email Harus Diisi"
                binding.etEmailRegis.requestFocus()
                return@setOnClickListener
            }

            //Validasi email tidak sesuai
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.etEmailRegis.error = "Email Tidak Valid"
                binding.etEmailRegis.requestFocus()
                return@setOnClickListener
            }

            //Validasi password
            if (password.isEmpty()) {
                binding.etPasswordRegis.error = "Password Harus Diisi"
                binding.etPasswordRegis.requestFocus()
                return@setOnClickListener
            }

            //Validasi panjang password
            if (password.length < 6) {
                binding.etPasswordRegis.error = "Password Minimal 6 Karakter"
                binding.etPasswordRegis.requestFocus()
                return@setOnClickListener
            }

            RegisterFirebase(email, password)
        }
    }

    private fun RegisterFirebase(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Toast.makeText(this, "Register Berhasil", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, SignInActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }
}
//    lateinit var binding : ActivitySignUpBinding
//    lateinit var auth : FirebaseAuth
//
//    override fun onCreate(savedInstanceState: Bundle?)
//    {
//        binding = ActivitySignUpBinding.inflate(layoutInflater)
//        super.onCreate(savedInstanceState)
//        setContentView(binding.root)
//
//        auth = FirebaseAuth.getInstance()
//
//        binding.btnRegis.setOnClickListener{
//            val email : binding.etEmailRegis.text.toString()
//            val password :
//        }
//
//        val btnRegis = findViewById<Button>(R.id.btnRegis)
//        val btnLogin = findViewById<Button>(R.id.btnLogin)
//
//        btnRegis.setOnClickListener {
//            val i = Intent(this@SignUpActivity, SignInActivity::class.java)
//            startActivity(i)
//        }
//        btnLogin.setOnClickListener {
//            val i = Intent(this@SignUpActivity, SignInActivity::class.java)
//            startActivity(i)
//        }
//    }
//}