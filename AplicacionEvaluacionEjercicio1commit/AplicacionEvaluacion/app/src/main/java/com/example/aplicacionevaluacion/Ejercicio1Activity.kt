package com.example.aplicacionevaluacion

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Ejercicio1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)

        val horasTrabajadasEditText = findViewById<EditText>(R.id.horas_trabajadas_edit_text)
        val calcularButton = findViewById<Button>(R.id.calcular_button)
        val salarioTextView = findViewById<TextView>(R.id.salario_text_view)

        calcularButton.setOnClickListener {
            val horasTrabajadas = horasTrabajadasEditText.text.toString().toInt()
            val salarioSemanal = calcularSalarioSemanal(horasTrabajadas)
            salarioTextView.text = getString(R.string.label_salario, salarioSemanal)
        }
    }
    private fun calcularSalarioSemanal(horasTrabajadas: Int): Int {
        val salarioBasePorHora = 16
        val salarioExtraPorHora = 20
        val horasBase = 40

        return if (horasTrabajadas <= horasBase) {
            horasTrabajadas * salarioBasePorHora
        } else {
            val horasExtras = horasTrabajadas - horasBase
            horasBase * salarioBasePorHora + horasExtras * salarioExtraPorHora
        }
    }
}

