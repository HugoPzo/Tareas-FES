package mx.unam.aragon

private fun tipo(any: Any): String{
    var tipoClase = when(any){
        is Alumno -> "Es de tipo Alumno el objeto"
        is Persona -> "Es de tipo Persona el objeto"
        else -> "Objeto desconocido"
    }
    return tipoClase
}




fun main(args: Array<String>) {
    var alumno = Persona("Hugo", 10)
    var tipoClase = tipo(alumno)
    println(tipoClase)
}

