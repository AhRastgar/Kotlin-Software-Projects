package com.example.checktriangle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bt = findViewById<Button>(R.id.bt)
        var tn1 = findViewById<TextView>(R.id.tn1)
        var tn2 = findViewById<TextView>(R.id.tn2)
        var tn3 = findViewById<TextView>(R.id.tn3)

        bt.setOnClickListener()
        {
            var a = tn1.text.toString().toInt()
            var b = tn2.text.toString().toInt()
            var c = tn3.text.toString().toInt()

            if (a <= b + c)
            {
                Toast.makeText(this, "This is a triangle!!", Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this, "This is not a triangle :(", Toast.LENGTH_LONG).show()
            }
        }
    }
}