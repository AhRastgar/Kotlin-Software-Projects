package com.example.pow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bt1 = findViewById<Button>(R.id.bt1)
        var tn1 = findViewById<TextView>(R.id.tn1)

        bt1.setOnClickListener()
        {
            var a = tn1.text.toString().toInt()
            var b = a * a
            var c = a * a * a

            Toast.makeText(this, "pow1: $a, pow2: $b, pow3: $c", Toast.LENGTH_SHORT).show()
        }
    }
}