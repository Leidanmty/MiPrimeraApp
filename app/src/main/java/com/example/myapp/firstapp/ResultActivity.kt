package com.example.myapp.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapp.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvResult = findViewById<TextView>(R.id.textViewResult)
        val name: String = intent.extras?.getString("Extra_Name").orEmpty()
        tvResult.text = "Hola $name, bienvenido a tu primera app en android!"
    }
}