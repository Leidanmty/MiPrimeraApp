package com.example.myapp.Sintaxys

//variables
//print("Hola mundo")
//Int
val age:Int = 26

//Long - almacena numeros mas grandes que int, de preferencia hay que optimizar para estos casos
val nNumberLong:Long = 5865442135468

//Float
val nNumeroConDecimal:Float = 5.866f

//Double
val numeroDouble:Double = 26.854577845

fun main(){
    showMyName()
    showMyAge(26)
    sumaNumeros(15, 25)
}

//Esta es una funcion basica:
fun showMyName(){
    val name = "Daniel"
    val lastName = "Andrade"
    println("Hola mi nombre es $name y me apellido $lastName" )
}

//funcion con parametros de entrada
fun showMyAge(currentAge:Int){
    println("Tengo $currentAge años")
}

//funcion con parametros de salida: este devuelve solo un valor que indiques despues de los parentesis
fun sumaNumeros(firsNumber:Int, secondNumber:Int):Int{
    return  firsNumber + secondNumber
}

//Esta funcion se recomienda solo cuando 1 funcion es simple como la siguiente:
fun sumaNumerosCool(firsNumber:Int, secondNumber:Int) = firsNumber + secondNumber
