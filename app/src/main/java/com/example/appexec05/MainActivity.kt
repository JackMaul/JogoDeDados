package com.example.appexec05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var resultadoDado: ImageView
    private lateinit var jogar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.jogar)
        btn.setOnClickListener {
            RodarDado()
        }
        resultadoDado = findViewById(R.id.iv_resultadoDado)
    }

    private fun RodarDado() {
        val randomInt = Random.nextInt(1,7)
        var imagem: Int = R.drawable.dice_6;
        if (randomInt == 1) {
            imagem = R.drawable.dice_1
        }
        if (randomInt == 2) {
            imagem = R.drawable.dice_2
        }
        if (randomInt == 3) {
            imagem = R.drawable.dice_3
        }
        if (randomInt == 4) {
            imagem = R.drawable.dice_4
        }
        if (randomInt == 5) {
            imagem = R.drawable.dice_5
        }
        Toast.makeText(
            this,"Número sorteado: ${randomInt} ", Toast.LENGTH_SHORT).show()
        resultadoDado.setImageResource(imagem)
    }


}
