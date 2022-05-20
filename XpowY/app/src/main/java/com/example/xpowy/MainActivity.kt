package com.example.xpowy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.Math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bt = findViewById<Button>(R.id.bt)
        var tn1 = findViewById<TextView>(R.id.tn1)
        var tn2 = findViewById<TextView>(R.id.tn2)

        bt.setOnClickListener()
        {
            var a = tn1.text.toString().toInt()
            var b = tn2.text.toString().toInt()
            var c = pow(a.toDouble(), b.toDouble())

            Toast.makeText(this, "x pow y: $c", Toast.LENGTH_SHORT).show()
        }
    }
}