package com.example.proyectokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton = findViewById(R.id.calcular) as Button
        boton.setOnClickListener{
            view -> calcularCostos()
        }
    }
    fun calcularCostos(){
        val costos = arrayListOf<Agua>()
        //101
        val cot =  findViewById(R.id.costo) as EditText
        var cos = findViewById(R.id.consumo101) as EditText
        var cotAgua = cot.text.toString().toDouble()
        var agua = Agua(cotAgua,cos.text.toString().toDouble())
        costos.add(agua)

        //102
        cos = findViewById(R.id.consumo102) as EditText
        agua = Agua(cotAgua,cos.text.toString().toDouble())
        costos.add(agua)

        //201
        cos = findViewById(R.id.consumo201) as EditText
        agua = Agua(cotAgua,cos.text.toString().toDouble())
        costos.add(agua)

        //202
        cos = findViewById(R.id.consumo202) as EditText
        agua = Agua(cotAgua,cos.text.toString().toDouble())
        costos.add(agua)

        //301
        cos = findViewById(R.id.consumo301) as EditText
        agua = Agua(cotAgua,cos.text.toString().toDouble())
        costos.add(agua)

        //302
        cos = findViewById(R.id.consumo302) as EditText
        agua = Agua(cotAgua,cos.text.toString().toDouble())
        costos.add(agua)

        //401
        cos = findViewById(R.id.consumo401) as EditText
        agua = Agua(cotAgua,cos.text.toString().toDouble())
        costos.add(agua)

        //402
        cos = findViewById(R.id.consumo401) as EditText
        agua = Agua(cotAgua,cos.text.toString().toDouble())
        costos.add(agua)


        var text = arrayOf(findViewById(R.id.costo1) as TextView,findViewById(R.id.costo2) as TextView,findViewById(R.id.costo3) as TextView,findViewById(R.id.costo4) as TextView,findViewById(R.id.costo5) as TextView,findViewById(R.id.costo6) as TextView,findViewById(R.id.costo7) as TextView,findViewById(R.id.costo8) as TextView)
        for(indice in costos.indices){
            costos.get(indice).costo()
            var te = text.get(indice)
            te.text = costos.get(indice).pagar.toString()
        }
    }
}