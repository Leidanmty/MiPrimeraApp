package com.example.myapp.Sintaxys

fun main(){
    getTrimestre(6)
}

//when cuando el valor es cualquier valor
fun result(value:Any){
    when(value){
        is Int -> value + value
        is String -> print(value)
        is Boolean -> if(value) print("Hola perro")
    }
}

//when donde simplificas un rango de numeros
/*fun getSemestre(month: Int):String{
    val result = when(month){
        in 1..6 -> return "Primer semestre"
        in 7..12 -> return "Segundo semestre"
        !in 1..12 -> return "Semestre no valido"
    }

    return result

    // o tambien
    /*return when(month){
        in 1..6 -> return "Primer semestre"
        in 7..12 -> return "Segundo semestre"
        !in 1..12 -> return "Semestre no valido"
    }*/
}*/

//when similar a un switch
fun getMonth(month:Int){
    when(month){
        1 -> print("Enero")
        2 -> print("Febrero")
        3 -> print("Marzo")
        4 -> print("Abril")
        5 -> print("Mayo")
        6 -> print("Junio")
        7 -> print("Julio")
        8 -> print("Agosto")
        9 -> print("Septiembre")
        10 -> print("Octubre")
        11 -> {
            print("Noviembre")
            print("Noviembre")
        }
        12 -> print("Diciembre")
        else -> println("No es un mes válido")
    }
}

fun getTrimestre(month: Int){
    when(month){
        1, 2, 3 -> print("Primer trimestre")
        4, 5, 6 -> print("Segundo trimestre")
        7, 8, 9 -> print("Tercer trimestre")
        10, 11, 12 -> print("Cuarto trimestre")
        else -> println("No es un numero valido para el trimestre")
    }
}