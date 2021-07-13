package com.calculadora.calculadoradenota

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btcalcular = calcular
        val resultado = resultado

        btcalcular.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2) /2
            val faltas = Integer.parseInt(faltas.text.toString())

            if (media >=6 && faltas <=10){
                resultado.text = "Aluno Aprovado!" + "\n" + "Nota Final: " + media + "\n" + "Números de Faltas: " + faltas
                resultado.setTextColor(Color.GREEN)
            }

            else{
                resultado.text = "Aluno Reprovado!" + "\n" + "Nota Final: " + media + "\n" + "Números de Faltas: " + faltas
                resultado.setTextColor(Color.RED)
            }
        }
    }
}