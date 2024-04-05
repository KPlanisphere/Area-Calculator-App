package com.example.areas
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TrianguloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangulo)

        val editTextBase = findViewById<EditText>(R.id.editTextBase)
        val editTextAltura = findViewById<EditText>(R.id.editTextAltura)
        val textViewResultado = findViewById<TextView>(R.id.textViewResultadoTriangulo)
        val btnCalcular = findViewById<Button>(R.id.btnCalcularAreaTriangulo)

        btnCalcular.setOnClickListener {
            val baseString = editTextBase.text.toString()
            val alturaString = editTextAltura.text.toString()
            if (baseString.isNotEmpty() && alturaString.isNotEmpty()) {
                val base = baseString.toDouble()
                val altura = alturaString.toDouble()
                val area = (base * altura) / 2
                textViewResultado.text = "Área: $area"
            } else {
                textViewResultado.text = "Por favor, introduce la base y la altura."
            }
        }
    }
}
