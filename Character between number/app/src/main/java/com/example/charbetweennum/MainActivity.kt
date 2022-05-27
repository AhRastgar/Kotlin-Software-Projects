package com.example.charbetweennum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tn = findViewById<TextView>(R.id.tn)
        val tc = findViewById<TextView>(R.id.tc)
        val bt = findViewById<Button>(R.id.bt)

        bt.setOnClickListener()
        {
            val a = tn.text.toString().toInt()
            val b = tc.text.toString()
            var sum = 0
            var mod = 0
            var rev = 0
            var i = 0
            var num = a
            var j = 0

            while (i < a)
            {
                mod = num % 10
                rev = (rev * 10) + mod
                num /= 10
            }

            while (j < a)
            {
                mod = rev % 10
                rev = (rev * 10) + mod

                Toast.makeText(this, "$rev", Toast.LENGTH_SHORT).show()
            }
        }
    }
}