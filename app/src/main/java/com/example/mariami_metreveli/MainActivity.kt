package com.example.mariami_metreveli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var textView = findViewById<TextView>(R.id.textView)
        var editText = findViewById<EditText>(R.id.editText)
        var okay = findViewById<TextView>(R.id.okay)
        var next = findViewById<TextView>(R.id.next)


        okay.setOnClickListener{
            var saxeli = editText.text.toString()
            textView.text = saxeli.toString()
        }


        next.setOnClickListener{
            var intent = Intent(this, mariami_metreveli2::class.java )
            startActivity(intent)

        }
    }
}