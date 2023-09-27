package com.example.projectbp2694

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // instance

        val btnLogin:Button = findViewById(R.id.buttonLogin) // event btn login di klik
        val txtUsername : EditText = findViewById(R.id.editTextUsername)
        val txtPassword : EditText = findViewById(R.id.editTextPassword)
        val logModel = LoginModel()

        btnLogin.setOnClickListener {
            //input
            logModel.username = txtUsername.text.toString()
            logModel.password = txtPassword.text.toString()
            // validasi
            if(txtUsername.text.toString().equals("FARREL") &&
                    txtPassword.text.toString().equals("7777")) {}

            // call home activity
            val intentHome = Intent(this, HomeActivity::class.java)
            startActivity(intentHome)

            } else
                Toast.makeText(this, "Username/Password Salah", Toast.LENGTH_SHORT).show()
        }
    }
