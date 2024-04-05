package com.example.areas
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TrapecioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trapecio)

        val editTextBaseMayor = findViewById<EditText>(R.id.editTextBaseMayor)
        val editTextBaseMenor = findViewById<EditText>(R.id.editTextBaseMenor)
        val editTextAlturaTrapecio = findViewById<EditText>(R.id.editTextAlturaTrapecio)
        val textViewResultado = findViewById<TextView>(R.id.textViewResultadoTrapecio)
        val btnCalcular = findViewById<Button>(R.id.btnCalcularAreaTrapecio)

        btnCalcular.setOnClickListener {
            val baseMayorString = editTextBaseMayor.text.toString()
            val baseMenorString = editTextBaseMenor.text.toString()
            val alturaString = editTextAlturaTrapecio.text.toString()
            if (baseMayorString.isNotEmpty() && baseMenorString.isNotEmpty() && alturaString.isNotEmpty()) {
                val baseMayor = baseMayorString.toDouble()
                val baseMenor = baseMenorString.toDouble()
                val altura = alturaString.toDouble()
                val area = ((baseMayor + baseMenor) * altura) / 2
                textViewResultado.text = "Área: $area"
            } else {
                textViewResultado.text = "Por favor, introduce las bases y la altura."
            }
        }
    }
}
