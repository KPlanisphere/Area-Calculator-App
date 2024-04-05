package com.example.areas
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.PI

class CirculoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circulo)

        val btnCalcular = findViewById<Button>(R.id.btnCalcularArea)
        val editTextRadio = findViewById<EditText>(R.id.editTextRadio)
        val textViewResultado = findViewById<TextView>(R.id.textViewResultado)

        btnCalcular.setOnClickListener {
            val radioString = editTextRadio.text.toString()
            if (radioString.isNotEmpty()) {
                val radio = radioString.toDouble()
                val area = PI * radio * radio
                textViewResultado.text = "Área: $area"
            } else {
                textViewResultado.text = "Por favor, introduce el radio."
            }
        }
    }
}
