package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var firstNum:TextInputEditText = findViewById(R.id.editFisrtNum)
        var secondNum:TextInputEditText = findViewById(R.id.editSecondNum)
        var btnCalc:Button = findViewById(R.id.btnSom)
        var txtResult: TextView = findViewById(R.id.txtResult)

        btnCalc.setOnClickListener {
            var resultado = firstNum.text.toString().toDouble() + secondNum.text.toString().toDouble()
            txtResult.setText("Resultado do cálculo: ${resultado}")
        }
    }
}