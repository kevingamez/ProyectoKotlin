package com.example.proyectokotlin

class Agua(val waterCost: Double, val consumido: Double) {
    var pagar = 0.0
    fun costo(){
        pagar=consumido * waterCost
    }
}