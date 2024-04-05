package com.example.areas
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CuadradoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuadrado)

        val editTextLado = findViewById<EditText>(R.id.editTextLado)
        val textViewResultado = findViewById<TextView>(R.id.textViewResultadoCuadrado)
        val btnCalcular = findViewById<Button>(R.id.btnCalcularAreaCuadrado)

        btnCalcular.setOnClickListener {
            val ladoString = editTextLado.text.toString()
            if (ladoString.isNotEmpty()) {
                val lado = ladoString.toDouble()
                val area = lado * lado
                textViewResultado.text = "Área: $area"
            } else {
                textViewResultado.text = "Por favor, introduce el lado del cuadrado."
            }
        }
    }
}
