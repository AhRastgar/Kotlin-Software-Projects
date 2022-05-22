package com.example.average

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tn1 = findViewById<TextView>(R.id.tn1)
        val tn2 = findViewById<TextView>(R.id.tn2)
        val tn3 = findViewById<TextView>(R.id.tn3)
        val tn4 = findViewById<TextView>(R.id.tn4)
        val tn5 = findViewById<TextView>(R.id.tn5)
        val bt1 = findViewById<Button>(R.id.bt1)

        bt1.setOnClickListener()
        {
            var a = tn1.text.toString().toInt()
            var b = tn2.text.toString().toInt()
            var c = tn3.text.toString().toInt()
            var d = tn4.text.toString().toInt()
            var e = tn5.text.toString().toInt()

            var sum = a + b + c + d + e
            var avg = sum / 5

            Toast.makeText(this, "average: $avg", Toast.LENGTH_LONG).show()
        }
    }
}