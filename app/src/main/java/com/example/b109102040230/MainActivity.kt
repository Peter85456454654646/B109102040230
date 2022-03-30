package com.example.b109102040230

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myt1:TextView = findViewById<TextView>(R.id.t1)
        myt1.text="11111"
        var myb1:Button = findViewById<Button>(R.id.button)
    }
}