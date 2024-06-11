package com.example.aplicacionevaluacion

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Ejercicio2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)

        val nota1EditText = findViewById<EditText>(R.id.nota1_edit_text)
        val nota2EditText = findViewById<EditText>(R.id.nota2_edit_text)
        val nota3EditText = findViewById<EditText>(R.id.nota3_edit_text)
        val nota4EditText = findViewById<EditText>(R.id.nota4_edit_text)
        val calcularButton = findViewById<Button>(R.id.calcular_button)
        val resultadoTextView = findViewById<TextView>(R.id.resultado_text_view)

        calcularButton.setOnClickListener {

            val nota1 = nota1EditText.text.toString().toDouble()
            val nota2 = nota2EditText.text.toString().toDouble()
            val nota3 = nota3EditText.text.toString().toDouble()
            val nota4 = nota4EditText.text.toString().toDouble()

            val (promedio, notaEliminada) = calcularPromedioYNotaEliminada(nota1, nota2, nota3, nota4)

            resultadoTextView.text = getString(R.string.resultado_format, promedio, notaEliminada)
        }
    }

    private fun calcularPromedioYNotaEliminada(nota1: Double, nota2: Double, nota3: Double, nota4: Double): Pair<Double, Double> {
        val notas = listOf(nota1, nota2, nota3, nota4)
        val notaEliminada = notas.minOrNull() ?: 0.0
        val sumaNotas = notas.sum() - notaEliminada
        val promedio = sumaNotas / 3
        return Pair(promedio, notaEliminada)
    }
}
