package com.example.myapp.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.myapp.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        //Este metodo se ejecuta al arrancar la pantalla
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)


        btnStart.setOnClickListener {
            val texto = etName.text.toString()
            if (texto.isNotEmpty()) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("Extra_Name", texto)
                startActivity(intent)
            }

        }
    }
}