package com.example.firstapp

open class Iniciar {
    fun iniciar(){
        println("Iniciar aplicación")
        var miObjeto:Person = Person()
        miObjeto.nombre = "Dago"
        miObjeto.document = "123123"
        miObjeto.edad = 27
        miObjeto.sexo = 'm'
    }
}