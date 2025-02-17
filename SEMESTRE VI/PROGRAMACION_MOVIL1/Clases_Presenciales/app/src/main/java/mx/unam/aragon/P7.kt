package mx.unam.aragon

fun main(args: Array<String>) {

    // Esta incorrecto
   /* var dato : String? = null
    var longitud : Int = dato.length
    println(longitud)*/


    // OPCION MAS LARGA
    /*var dato : String? = null
    var longitud = dato.let{
        if (it!=null){
            it.length
        }else{
            println("Entra")
        }

    }
    println(longitud)*/


    // MEJOR OPCION
    var dato : String? = null
    var longitud = dato?.length?:0
    println(longitud)

}