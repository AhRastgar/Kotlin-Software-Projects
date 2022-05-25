package com.example.pi

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
        val bt = findViewById<Button>(R.id.bt)

        bt.setOnClickListener()
        {
            var x = tn.text.toString().toInt()
            var p = 3.14
            var stash = x * p * 2
            var pi = stash / x

            Toast.makeText(this, "pi: $pi", Toast.LENGTH_LONG).show()
        }
    }
}