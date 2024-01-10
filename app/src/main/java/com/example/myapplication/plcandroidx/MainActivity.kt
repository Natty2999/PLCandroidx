package com.example.myapplication.plcandroidx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var textInputIpAdd: TextInputEditText // Declare at the class level
    private lateinit var textInputDBOffset: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonConnect: Button = findViewById(R.id.buttonConnect)
            textInputIpAdd = findViewById(R.id.TextInputIpAddress)
            textInputDBOffset = findViewById(R.id.TextInputDBOffset)
        //text of textinputdboffset


        // Set up click listener for the button
        buttonConnect.setOnClickListener {
            val textDBOffset = textInputDBOffset.text.toString()
            // Your code to be executed when the button is clicked
            updateTextInputValue(textDBOffset)
        }

    }
    // Function to update the value of TextInputEditText
    private fun updateTextInputValue(newValue: String) {
        textInputIpAdd.setText(newValue)
        showToast("Text updated to: $newValue")
    }
    // Function to show a Toast message
    private fun showToast(message: String) {

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}