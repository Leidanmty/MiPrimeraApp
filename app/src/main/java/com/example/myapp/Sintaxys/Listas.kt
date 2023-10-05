package com.example.myapp.Sintaxys

fun main(){
    mutableList()
}

fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays.add(0, "dannyDay")
    println(weekDays)

    if(weekDays.isEmpty()){
        //no hay nada que imprimir
    }else{
        weekDays.forEach{ println(it) }
    }

    //o tambien puede ser de la siguiente manera:

    if(weekDays.isNotEmpty()){
        weekDays.forEach{ println(it) }
    }

    weekDays.last()//da el ultimo valor de la lista

    /*for(item in weekDays){

    }*/
}

fun inMutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    //println(readOnly.size)
    //println(readOnly)
    //println(readOnly[0])

    val example = readOnly.filter { it.contains("a") }
    //println(example)

    readOnly.forEach { weekDay -> println(weekDay) }
}