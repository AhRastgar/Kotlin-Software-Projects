package com.example.primenumber

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
            val x = tn.text.toString().toInt()
            var i = 0
            var test = 0

            while (i < x)
            {
                if (x % i == 0)
                {
                    test = 1
                    break
                }
                i++
            }

            if (test == 0)
            {
                Toast.makeText(this, "This is prime number", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "That is not prime number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}