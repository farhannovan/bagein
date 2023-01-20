package com.phyxel.bagein.sign.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.google.firebase.auth.FirebaseAuth
import com.phyxel.bagein.MainActivity
import com.phyxel.bagein.databinding.ActivitySignInBinding
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

    lateinit var binding : ActivitySignInBinding
    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignInBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        auth = FirebaseAuth.getInstance()

//        binding.forgotPassword.setOnClickListener {
//            val intent = Intent(this, ResetPasswordActivity::class.java)
//            startActivity(intent)
//        }

        binding.btnRegis.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        binding.btnLogin.setOnClickListener {
            val email = binding.etEmailLogin.text.toString()
            val password = binding.etPasswordLogin.text.toString()

            //Validasi email
            if (email.isEmpty()){
                binding.etEmailLogin.error = "Email Harus Diisi"
                binding.etEmailLogin.requestFocus()
                return@setOnClickListener
            }

            //Validasi email tidak sesuai
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.etPasswordLogin.error = "Email Tidak Valid"
                binding.etPasswordLogin.requestFocus()
                return@setOnClickListener
            }

            //Validasi password
            if (password.isEmpty()){
                binding.etPasswordLogin.error = "Password Harus Diisi"
                binding.etPasswordLogin.requestFocus()
                return@setOnClickListener
            }

            LoginFirebase(email,password)
        }
    }

    private fun LoginFirebase(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Toast.makeText(this, "Selamat datang $email", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }
}
//    lateinit var binding : ActivitySignInBinding
//    lateinit var auth : FirebaseAuth
//
//    override fun onCreate(savedInstanceState: Bundle?)
//    {
//        binding = ActivitySignInBinding.inflate(layoutInflater)
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_sign_in)
//
//        binding
//
//        val etEmail = findViewById<EditText>(R.id.SignUpActivity)
//        val etPassword = findViewById<EditText>(R.id.etPasswordLogin)
//
//        val btnRegis = findViewById<Button>(R.id.btnRegis)
//        val btnLogin = findViewById<Button>(R.id.btnLogin)
//
//        btnRegis.setOnClickListener {
//            val i = Intent(this@SignInActivity, SignUpActivity::class.java)
//            startActivity(i)
//        }
//        btnLogin.setOnClickListener {
//            val i = Intent(this@SignInActivity, MainActivity::class.java)
//            startActivity(i)
//        }
//        
//    }
//}