package org.insbaixcamp.excusasparaelgym

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnCambiar: Button = findViewById(R.id.btnGenerateExcuse)
        val vwtTipoPereza: TextView = findViewById(R.id.tvTipoPereza)
        val vwtTextoExcusas: TextView = findViewById(R.id.tvExcuseText)
        val vwtNumeroExcusas: TextView = findViewById(R.id.tvExcuseNumber)

        btnCambiar.setOnClickListener {
            val listaExcusas = ExcusasRepository.listaExcusas
            if (listaExcusas.isNotEmpty()) {
                val excusaRandom: Excusa = listaExcusas.random()

                vwtTipoPereza.text = excusaRandom.tipoPereza.titulo
                vwtTipoPereza.setTextColor(
                    ContextCompat.getColor(this, excusaRandom.tipoPereza.colorResId)
                )

                vwtTextoExcusas.text = excusaRandom.texto
                vwtNumeroExcusas.text = "Excusa # ${excusaRandom.id}"
            }

        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }


}

