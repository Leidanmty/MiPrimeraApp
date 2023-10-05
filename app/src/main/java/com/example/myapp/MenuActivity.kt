package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapp.firstapp.FirstAppActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnAppSaludar = findViewById<Button>(R.id.btnAppSaludar)
        btnAppSaludar.setOnClickListener {
            navigateToSaludar()
        }
    }

    fun navigateToSaludar() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}