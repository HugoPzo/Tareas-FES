package mx.unam.aragon

fun main(args: Array<String>){
    // 2. - ESTUDIARLA **
    val salida = {entradaUno:String, entradaDos:Int ->
        val mundo = (1..20).shuffled().last()
        "Hola $entradaUno tu numero de vidas son $entradaDos para el mundo $mundo"
    }

    val especial = {valorUno:String, valorDos:Int ->
        val incrementro = (1..40).shuffled().last() + valorDos
        "Hola $valorUno se incrementa la siguiente puntuacion $incrementro"
    }

    simulacion("Jugador 1", salida)
    simulacion("Master", especial)

}

// 2
fun simulacion(jugador:String, bienvenida:(String,Int) -> String){
    val sorteo = (1..5).shuffled().last()
    println(bienvenida(jugador, sorteo))
}