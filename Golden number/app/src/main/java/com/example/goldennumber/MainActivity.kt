package com.example.goldennumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt = findViewById<Button>(R.id.bt)
        val tn1 = findViewById<TextView>(R.id.tn1)

        bt.setOnClickListener()
        {
            var a = tn1.text.toString().toInt()
            var b = a * 1.618
            var c = a / 1.618

            Toast.makeText(this, "if length: $c\nif width: $b", Toast.LENGTH_LONG).show()
        }
    }
}