package com.example.aplicacionevaluacion

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Ejercicio3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)

        val segundosEditText = findViewById<EditText>(R.id.segundos_edit_text)
        val calcularButton = findViewById<Button>(R.id.calcular_button)
        val minutosTextView = findViewById<TextView>(R.id.minutos_text_view)

        calcularButton.setOnClickListener {
            // Obtener los segundos ingresados por el usuario
            val segundos = segundosEditText.text.toString().toDouble()

            // Calcular los minutos
            val minutos = calcularMinutos(segundos)

            // Mostrar el resultado en el TextView
            minutosTextView.text = getString(R.string.resultado_minutos, minutos)
        }
    }

    private fun calcularMinutos(segundos: Double): Double {
        return segundos / 60
    }
}
