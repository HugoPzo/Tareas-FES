package mx.unam.aragon

// 4.

fun main(array: Array<String>){
    simulacion()
}

fun simulacion(){
    val llamada = configuracion()
    println(llamada("Enviando de datos"))
}

fun configuracion():(String) -> String{
    val escuela = "FES ARAGON"
    var incremento = 10
    return {nombre:String ->
        val codigoPostal = "34234"
        incremento += 2
        println("Se realizo configuracion")
        "La cadena que sale es: CP = $codigoPostal, incremento = $incremento, dato que se manda " +
                "'$nombre' variable de acceso: $escuela"
    }
}