package com.example.areas
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RomboActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rombo)

        val editTextDiagonalMayor = findViewById<EditText>(R.id.editTextDiagonalMayor)
        val editTextDiagonalMenor = findViewById<EditText>(R.id.editTextDiagonalMenor)
        val textViewResultado = findViewById<TextView>(R.id.textViewResultadoRombo)
        val btnCalcular = findViewById<Button>(R.id.btnCalcularAreaRombo)

        btnCalcular.setOnClickListener {
            val diagonalMayorString = editTextDiagonalMayor.text.toString()
            val diagonalMenorString = editTextDiagonalMenor.text.toString()
            if (diagonalMayorString.isNotEmpty() && diagonalMenorString.isNotEmpty()) {
                val diagonalMayor = diagonalMayorString.toDouble()
                val diagonalMenor = diagonalMenorString.toDouble()
                val area = (diagonalMayor * diagonalMenor) / 2
                textViewResultado.text = "Área: $area"
            } else {
                textViewResultado.text = "Por favor, introduce las diagonales."
            }
        }
    }
}
