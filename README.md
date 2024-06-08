# Area Calculator App

An Android application designed to calculate the area of various geometric shapes. This project leverages modern Android development practices, written in Kotlin, and aims to provide a robust and user-friendly experience.

## Features

### Area Calculation

-   **Circle**: Calculate the area of a circle given the radius.
-   **Square**: Calculate the area of a square given the side length.
-   **Rectangle**: Calculate the area of a rectangle given the width and height.
-   **Triangle**: Calculate the area of a triangle given the base and height.
-   **Rhombus**: Calculate the area of a rhombus given the lengths of its diagonals.
-   **Trapezoid**: Calculate the area of a trapezoid given the lengths of its bases and its height.

### UI/UX Design

-   **User-Friendly Interface**: Intuitive input fields and clear results display.
-   **Kotlin**: Written in Kotlin, ensuring a smooth and efficient user experience.
-   **Dynamic Layout**: Interface components change dynamically based on the selected shape.

<p align= "center">
    <img src="https://github.com/KPlanisphere/Area-Calculator-App/assets/60454942/420e0920-467b-494a-8fe3-c9622683721b" style="width: 30%; height: auto;">
</p>

## Project Structure

The project follows the standard Android project structure, including:

-   **app**: Contains the main source code for the application, including activities, fragments, and other components.
-   **gradle**: Gradle configuration files for managing project dependencies and build processes.
-   **.gradle**: Gradle's system files.
-   **.idea**: IntelliJ IDEA settings and configurations.
-   **build.gradle.kts**: Kotlin script for configuring the build process.
-   **settings.gradle.kts**: Kotlin script for setting up the project's modules.

## Detailed Descriptions

### Main Activity

The MainActivity of the application is the launch screen that greets users with an intuitive interface allowing the selection of different geometric shapes to calculate their areas. This screen is the user's first interaction with the application.

#### Shape Selection

The Spinner component allows users to select from a variety of geometric shapes. This is achieved through an ArrayAdapter that populates the Spinner with the available shapes.

```kotlin
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
```

### Circle Activity

The CircleActivity is dedicated to calculating the area of a circle. The user provides the radius, and the app computes the area using the formula A=πr2A = \pi r^2A=πr2.

#### Kotlin Code

```kotlin
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
```

### Square Activity

The SquareActivity allows users to calculate the area of a square by inputting the length of one of its sides.

#### Kotlin Code

```kotlin
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
```

### Rectangle Activity

The RectangleActivity enables users to calculate the area of a rectangle by providing its width and height.

#### Kotlin Code

```kotlin
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
```

### Rhombus Activity

The RhombusActivity allows users to calculate the area of a rhombus by inputting the lengths of its diagonals.

#### Kotlin Code

```kotlin
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
```
### Trapezoid Activity

The TrapezoidActivity calculates the area of a trapezoid using the lengths of its bases and its height.

#### Kotlin Code

```kotlin
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
```

### Triangle Activity

The TriangleActivity calculates the area of a triangle using its base and height.

#### Kotlin Code

```kotlin
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
```

## Getting Started

To get a local copy up and running follow these simple steps.

### Prerequisites

-   Android Studio
-   Gradle

### Installation

1.  Clone the repo
    
    ```sh
    git clone https://github.com/KPlanisphere/area-calculator.git
    ```
    
2.  Open the project in Android Studio.
3.  Sync the Gradle files and build the project.
4.  Run the app on an emulator or a physical device.
