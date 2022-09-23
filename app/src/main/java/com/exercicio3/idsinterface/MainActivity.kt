package com.exercicio3.idsinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val buttonD5 = findViewById<Button>(R.id.buttonD5)
        val buttonD7 = findViewById<Button>(R.id.buttonD7)

        buttonD6.setOnClickListener {
            // Toast.makeText(this, "Botão Clicado", Toast.LENGTH_LONG).show()//

            rolarDados(7)

            buttonD5.setOnClickListener {
                rolarDados(10)

                buttonD6.setOnClickListener {
                    rolarDados(15)
                }


            }
        }

    }
      private fun rolarDados(lados: Int) {
        val rolagem = (1..lados).random()

        val textDado = findViewById<TextView>(R.id.textDado)

        textDado.text = rolagem.toString()
    }







 }




