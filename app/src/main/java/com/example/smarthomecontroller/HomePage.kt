package com.example.smarthomecontroller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePage : AppCompatActivity() {
    private lateinit var loginButton1: Button
    private lateinit var loginButton2: Button
    private lateinit var loginButton3: Button
    private lateinit var loginButton4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)
        loginButton1 = findViewById(R.id.button1)
        loginButton2= findViewById(R.id.button2)
        loginButton3 = findViewById(R.id.button3)
        loginButton4 = findViewById(R.id.button4)
        loginButton1.setOnClickListener {
            val intent = Intent(this, Room1::class.java)
            startActivity(intent)
        }
        loginButton2.setOnClickListener {
            val intent = Intent(this, Room2::class.java)
            startActivity(intent)
        }
        loginButton3.setOnClickListener {
            val intent = Intent(this, Room3::class.java)
            startActivity(intent)
        }
        loginButton4.setOnClickListener {
            val intent = Intent(this, Room4::class.java)
            startActivity(intent)
        }
        }
}
