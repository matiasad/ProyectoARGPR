package com.curso.android.app.practica.proyectoargpr

import android.widget.EditText
import android.widget.TextView
import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Before




class testunitario {

    private lateinit var mainViewModel: MainViewModel

    @Before
    fun setup()
    {
        mainViewModel = MainViewModel()
    }

    @Test
    fun testcomparacioncadenaIguales()
    {
        mainViewModel.setTexto1("hola")
        mainViewModel.setTexto2("hola")

        val result = mainViewModel.comparar()
        assert(result== "Iguales")
    }

    @Test
    fun testcomparacioncadenaDiferentes()
    {
        mainViewModel.setTexto1("hola")
        mainViewModel.setTexto2("adios")

        val result = mainViewModel.comparar()
        assert(result== "Diferentes")
    }


}