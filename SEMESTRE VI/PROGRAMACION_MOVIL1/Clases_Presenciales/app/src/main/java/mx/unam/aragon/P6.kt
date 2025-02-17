package mx.unam.aragon

fun main(args: Array<String>){
   /* var dato: String? = null
    var longitud : Int = dato.length // Error
    println(longitud)*/

    var dato_: String? = null
    var longitud_ : Int? = dato_?.length
    println(longitud_)

    var dato__: String? = null
    var longitud__ : Int = dato__!!.length
    println(longitud__)

    // LEER EL LIBRO DE KOTLIN - CAP(2,3,4,5,6)
    // DESCARGAR 2 API'S - ANDROID (8 & 8.1.1)
}