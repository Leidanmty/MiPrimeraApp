package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapp.ImcCalculator.ImcCalculatorActivity
import com.example.myapp.firstapp.FirstAppActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnAppSaludar = findViewById<Button>(R.id.btnAppSaludar)
        val btnIMCapp = findViewById<Button>(R.id.btnIMCapp)
        btnAppSaludar.setOnClickListener { navigateToSaludar() }
        btnIMCapp.setOnClickListener { navigateToImcApp() }
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludar() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}