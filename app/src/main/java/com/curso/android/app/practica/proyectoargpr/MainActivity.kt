package com.curso.android.app.practica.proyectoargpr

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var textView: TextView
    private lateinit var button1: Button
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editTextText)
        editText2 = findViewById(R.id.editTextText2)
        textView = findViewById(R.id.textView)
        button1 = findViewById(R.id.button1)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java);


    }

    fun onButtonClick(view: View)
    {
        mainViewModel.setTexto1(editText1.text.toString())
        mainViewModel.setTexto2(editText2.text.toString())
        val result = mainViewModel.comparar()
        textView.text = result.toString()
    }
}




