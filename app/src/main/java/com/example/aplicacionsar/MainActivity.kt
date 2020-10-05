package com.example.aplicacionsar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val Tag = "com.estudio.aplicacion sar.MainActivity.PAGINA"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btninscripcion = findViewById<Button>(R.id.btninscripcion)
        val btnactualizacion = findViewById<Button>(R.id.btnactualizacion)
        val btnaceptacion = findViewById<Button>(R.id.btnaceptacion)
        val btndeclaracion = findViewById<Button>(R.id.btndeclaracion)

        btninscripcion.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"Inscripcion RTN", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivityTexto::class.java)
            intent.putExtra(Tag, "Inscripcion RTN")
            startActivity(intent)
        })
        btnactualizacion.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"Actualizacion RTN", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivityTexto::class.java)
            intent.putExtra(Tag, "Actualizacion RTN")
            startActivity(intent)
        })
        btnaceptacion.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"Aceptacion", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivityTexto::class.java)
            intent.putExtra(Tag, "Aceptacion")
            startActivity(intent)
        })
        btndeclaracion.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"Declaracion de inicio de operaciones", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivityTexto::class.java)
            intent.putExtra(Tag, "Declaracion de inicio de operaciones")
            startActivity(intent)
        })
    }
}