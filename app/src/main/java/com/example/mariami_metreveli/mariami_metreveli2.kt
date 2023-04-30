package com.example.mariami_metreveli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class mariami_metreveli2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mariami_metreveli2)



        var click = findViewById<TextView>(R.id.click)
        var myNumber = findViewById<TextView>(R.id.myNumber)

        click.setOnClickListener{
            var axaliRicxvi= myNumber.text.toString().toInt()
            axaliRicxvi++
            myNumber.text = axaliRicxvi.toString()
        }
    }
}