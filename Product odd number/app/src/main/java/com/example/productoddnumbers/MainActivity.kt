package com.example.productoddnumbers

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
        val tn2 = findViewById<TextView>(R.id.tn2)

        bt.setOnClickListener()
        {
            val a = tn1.text.toString().toInt()
            val b = tn2.text.toString().toInt()
            var i = 0
            var sum = 1

            while (i < b)
            {
                if (i % 2 == 1)
                {
                    sum *= i
                }
            }

            Toast.makeText(this, "Product: $sum", Toast.LENGTH_LONG).show()
        }
    }
}