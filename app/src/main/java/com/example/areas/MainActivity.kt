package com.example.areas
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // figuras geométricas disponibles
        val figuras = arrayOf("Círculo", "Rectángulo", "Cuadrado", "Triángulo", "Rombo", "Trapecio")
        val spinnerFiguras = findViewById<Spinner>(R.id.spinnerFiguras)

        // mostrar las opciones en un Spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, figuras)
        spinnerFiguras.adapter = adapter

        findViewById<Button>(R.id.btnSeleccionar).setOnClickListener {
            val seleccion = spinnerFiguras.selectedItem.toString()
            // Dependiendo de la selección, iniciamos la actividad correspondiente
            when (seleccion) {
                "Círculo" -> startActivity(Intent(this, CirculoActivity::class.java))
                "Rectángulo" -> startActivity(Intent(this, RectanguloActivity::class.java))
                "Cuadrado" -> startActivity(Intent(this, CuadradoActivity::class.java))
                "Triángulo" -> startActivity(Intent(this, TrianguloActivity::class.java))
                "Rombo" -> startActivity(Intent(this, RomboActivity::class.java))
                "Trapecio" -> startActivity(Intent(this, TrapecioActivity::class.java))
            }
        }
    }
}
