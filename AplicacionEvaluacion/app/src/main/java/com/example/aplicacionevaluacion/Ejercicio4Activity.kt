package com.example.aplicacionevaluacion

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Ejercicio4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio4)

        val limiteEditText = findViewById<EditText>(R.id.limite_edit_text)
        val calcularButton = findViewById<Button>(R.id.calcular_button)
        val resultadoTextView = findViewById<TextView>(R.id.resultado_text_view)

        calcularButton.setOnClickListener {
            // Obtener el límite ingresado por el usuario
            val limite = limiteEditText.text.toString().toInt()

            // Calcular la suma de la serie hasta el límite
            val suma = calcularSumaSerie(limite)

            // Mostrar el resultado en el TextView
            resultadoTextView.text = getString(R.string.resultado_suma, suma)
        }
    }

    private fun calcularSumaSerie(limite: Int): Int {
        var suma = 0
        for (i in 1..limite) {
            suma += i
        }
        return suma
    }
}
