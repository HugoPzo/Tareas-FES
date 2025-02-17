package mx.unam.aragon

fun main(args: Array<String>){

    // 1.
    val salida = {entradaUno:String, entradaDos: Int ->
    val incremento = 20*entradaDos
            "Operacion final $entradaUno $incremento"
    }

    println(salida("Incremento 20 = ", 10))

}




