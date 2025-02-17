package mx.unam.aragon
import java.lang.Exception

fun main(args : Array<String>) {
    /*var dato : String? = null
    var longitud = dato?.length?:throw Exception("El valor de dato no puede ser null")
    println(longitud)*/

    var dato : String?=null
    var longitud = dato?.length?:throw verExepcion()
    println(longitud)
}

class verExepcion():
        Exception("El valor de dato no puede ser null")


