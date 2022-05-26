package com.example.operations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.Math.pow
import java.lang.Math.sqrt
import kotlin.math.pow


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt1 = findViewById<Button>(R.id.bt)
        val bt2 = findViewById<Button>(R.id.bt2)
        val bt3 = findViewById<Button>(R.id.bt3)
        val bt4 = findViewById<Button>(R.id.bt4)
        val bt5 = findViewById<Button>(R.id.bt5)
        val tn1 = findViewById<TextView>(R.id.tn1)
        val tn2 = findViewById<TextView>(R.id.tn2)
        val tn3 = findViewById<TextView>(R.id.tn3)
        val tn4 = findViewById<TextView>(R.id.tn4)
        val tn5 = findViewById<TextView>(R.id.tn5)

        bt1.setOnClickListener()
        {
            val a = tn1.text.toString().toInt()
            val b = tn2.text.toString().toInt()
            val c = tn3.text.toString().toInt()
            val d = tn4.text.toString().toInt()
            val e = tn5.text.toString().toInt()
            val sum = a + b + c + d + e

            Toast.makeText(this, "sum: $sum", Toast.LENGTH_SHORT).show()
        }

        bt2.setOnClickListener()
        {
            val a = tn1.text.toString().toInt()
            val b = tn2.text.toString().toInt()
            val c = tn3.text.toString().toInt()
            val d = tn4.text.toString().toInt()
            val e = tn5.text.toString().toInt()
            val avg = (a + b + c + d + e) / 5

            Toast.makeText(this, "Average: $avg", Toast.LENGTH_SHORT).show()
        }

        bt3.setOnClickListener()
        {
            val a = tn1.text.toString().toInt()
            val b = tn2.text.toString().toInt()
            val c = tn3.text.toString().toInt()
            val d = tn4.text.toString().toInt()
            val e = tn5.text.toString().toInt()
            var min = a

            if (min > b)
            {
                min = b
            }
            if (min > c)
            {
                min = c
            }
            if (min > d)
            {
                min = d
            }
            if (min > e)
            {
                min = e
            }

            Toast.makeText(this, "Minimum: $min", Toast.LENGTH_SHORT).show()
        }

        bt4.setOnClickListener()
        {
            val a = tn1.text.toString().toInt()
            val b = tn2.text.toString().toInt()
            val c = tn3.text.toString().toInt()
            val d = tn4.text.toString().toInt()
            val e = tn5.text.toString().toInt()

            var max = e

            if (max < d)
            {
                max = d
            }
            if (max < c)
            {
                max = c
            }
            if (max < b)
            {
                max = b
            }
            if (max < a)
            {
                max = a
            }

            Toast.makeText(this, "Maximum: $max", Toast.LENGTH_SHORT).show()
        }

        bt5.setOnClickListener()
        {
            val a = tn1.text.toString().toInt()
            val b = tn2.text.toString().toInt()
            val c = tn3.text.toString().toInt()
            val d = tn4.text.toString().toInt()
            val e = tn5.text.toString().toInt()
            val avg = (a + b + c + d + e) / 5
            var i = 1
            val nums = arrayOf(a, b, c, d, e)
            var stash: Int
            var sum = 0
            var variance = 0
            var s = 0
            
            while (i <= 5)
            {
                stash = nums[i] - avg
                sum += stash.toDouble().pow(2).toInt()
                s = sum / 5
                variance = kotlin.math.sqrt(s.toDouble()).toInt()
            }

            Toast.makeText(this, "Variance: $variance", Toast.LENGTH_SHORT).show()
        }
    }
}