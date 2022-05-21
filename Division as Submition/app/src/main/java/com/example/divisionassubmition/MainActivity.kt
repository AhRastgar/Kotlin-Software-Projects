package com.example.divisionassubmition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tn1 = findViewById<TextView>(R.id.tn1)
        val tn2 = findViewById<TextView>(R.id.tn2)
        val bt = findViewById<Button>(R.id.bt)

        bt.setOnClickListener()
        {
            var a = tn1.text.toString().toInt()
            var b = tn2.text.toString().toInt()
            var mod = a
            var div = 0
            var loop = 0

            while (loop < a) {
                if (mod >= b)
                {
                    div++
                    mod -= b
                }
                else
                {
                    break
                }
                loop++
            }
        }
    }
}