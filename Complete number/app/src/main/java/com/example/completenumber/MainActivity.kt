package com.example.completenumber

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
            var num = x
            var sum = 0
            var i = 1
            
            while (i <= x)
            {
                if (x % i == 0)
                {
                    sum += i
                }
                i++
            }
            
            if (sum == num)
            {
                Toast.makeText(this, "This number is complete.", Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this, "This number is not compete.", Toast.LENGTH_LONG).show()
            }
        }
    }
}