package com.example.areas
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RectanguloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangulo)

        val editTextLargo = findViewById<EditText>(R.id.editTextLargo)
        val editTextAncho = findViewById<EditText>(R.id.editTextAncho)
        val textViewResultado = findViewById<TextView>(R.id.textViewResultadoRectangulo)
        val btnCalcular = findViewById<Button>(R.id.btnCalcularAreaRectangulo)

        btnCalcular.setOnClickListener {
            val largoString = editTextLargo.text.toString()
            val anchoString = editTextAncho.text.toString()
            if (largoString.isNotEmpty() && anchoString.isNotEmpty()) {
                val largo = largoString.toDouble()
                val ancho = anchoString.toDouble()
                val area = largo * ancho
                textViewResultado.text = "Área: $area"
            } else {
                textViewResultado.text = "Por favor, introduce el largo y el ancho."
            }
        }
    }
}
