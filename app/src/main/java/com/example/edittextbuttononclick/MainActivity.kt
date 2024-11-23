package com.example.edittextbuttononclick

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var inputEditText: EditText
    private lateinit var convertButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var charCountTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputEditText = findViewById(R.id.inputEditText)
        convertButton = findViewById(R.id.convertButton)
        resultTextView = findViewById(R.id.resultTextView)
        charCountTextView = findViewById(R.id.charCountTextView)
        onButtonClock(convertButton)
    }

    fun onButtonClock(view: View) {
        val inputText = inputEditText.text.toString()
        val reversedText = inputText.reversed()
        val characterCount = inputText.replace(" ", "").length
        resultTextView.text = reversedText
        charCountTextView.text = "Количество символов: $characterCount"
    }
}