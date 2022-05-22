package com.example.showstars

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
            var i = 1

            while (i <= a)
            {
                Toast.makeText(this, "*", Toast.LENGTH_SHORT).show()
            }
        }
    }
}