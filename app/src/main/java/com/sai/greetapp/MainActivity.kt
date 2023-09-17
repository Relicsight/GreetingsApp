package com.sai.greetapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*  Textview    */
        val txt:TextView = findViewById(R.id.textview1)
        txt.text = "Greetings"

        /* EditText */
        val ed:EditText = findViewById(R.id.editText1)

        /* Button */
        val b1 = findViewById<Button>(R.id.button)
        b1.text = "Greet"
        b1.setOnClickListener{
            val dest = ed.editableText
            Toast.makeText(this@MainActivity,"Hello $dest",Toast.LENGTH_LONG).show()
        }
    }
}