package com.example.divisor

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
        val tn = findViewById<TextView>(R.id.tn)

        bt.setOnClickListener()
        {
            var x = tn.text.toString().toInt()
            var sum = 0
            var i = 1

            while (i <= x)
            {
                if (x % i == 0)
                {
                    Toast.makeText(this, "Divide by your number is: $i", Toast.LENGTH_SHORT).show()
                }
                i++
            }
        }
    }
}