package mx.unam.aragon

import java.io.File

class lazyClass(var nombre: String, var edad: Int) {
    lateinit var despues: String
    val descripcion by lazy {
        obtenerDescripcion()
    }

    init {
        this.nombre = nombre.uppercase()
        this.edad = this.edad * 2
        despues = "Inicio despues"
    }

    constructor(nombre: String) : this(nombre.replaceAfter('e', "*"), 12) {
        ocuparDespues()
    }


    private fun ocuparDespues() {
        if (::despues.isInitialized) {
            println("Se inicio despues ($despues)")
        }
    }

    private fun obtenerDescripcion() = File("/home/hugo/Documentos/ESCUELA/SEMESTRE VI" +
            "/PROGRAMACION_MOVIL1/Clases_Presenciales/app/src/test/java/mx/unam" +
            "/aragon/descripcion.txt")
        .readText()
        .split("\n")
        .shuffled()
        .first()


    override fun toString(): String {
        return "Hola $nombre ya tienes $edad años"
    }
}


fun main(args: Array<String>){
    val persona = lazyClass("Hugo")
    println(persona)
    println(persona.despues)
    println(persona.descripcion)
}