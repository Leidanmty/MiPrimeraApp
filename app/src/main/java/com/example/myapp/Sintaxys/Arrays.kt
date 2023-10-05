package com.example.myapp.Sintaxys

fun main(){
    arrayUno()
}

fun arrayUno(){
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(weekDays.size)

    //bucles
    for(position in weekDays.indices){
        println(weekDays[position])
    }


}