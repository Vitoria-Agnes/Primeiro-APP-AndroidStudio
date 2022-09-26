package com.exercicio4.activitieseintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Segundactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segundactivity)

        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        buttonVoltar.setOnClickListener{
            finish()
        }
    }
}