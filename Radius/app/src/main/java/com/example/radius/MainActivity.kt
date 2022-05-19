package com.example.radius

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()
{
  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val bt = findViewById<Button>(R.id.bt)
    val ptxt1 = findViewById<TextView>(R.id.pNum1)

    bt.setOnClickListener()
    {
      var x = ptxt1.text.toString().toInt()
      var a = x * 2
      var b = 2 * 3.14 * x
      var c = 3.14 * x * x

      Toast.makeText(this, "Diameter: $a Environment: $b\nArea: $c", Toast.LENGTH_LONG).show()
    }
  }
}
