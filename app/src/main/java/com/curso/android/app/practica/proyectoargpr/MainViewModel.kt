package com.curso.android.app.practica.proyectoargpr

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var texto1: String = ""
    private var texto2: String = ""
    private var resultado: String = ""

    fun setTexto1(text: String)
    {
        this.texto1 = text
    }

    fun setTexto2(text: String)
    {
        this.texto2 = text
    }

    fun getResultado() = resultado

    fun comparar(): String {
        if (texto1 == texto2) {
            return "Iguales"
        } else {
            return "Diferentes"
        }
    }
}