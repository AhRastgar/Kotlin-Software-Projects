package com.example.palindrome

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
            var pal = 0
            var mod: Int
            var num = x
            var i = 0

            while (i < x)
            {
                mod = x % 10
                pal = (pal * 10) + mod
                x /= 10

                if (x < 10)
                {
                    pal = (pal * 10) + x
                    break
                }

                i++
            }
            if (pal == num)
            {
                Toast.makeText(this, "This is a palindrome", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "This is not palindrome", Toast.LENGTH_SHORT).show()
            }
        }
    }
}