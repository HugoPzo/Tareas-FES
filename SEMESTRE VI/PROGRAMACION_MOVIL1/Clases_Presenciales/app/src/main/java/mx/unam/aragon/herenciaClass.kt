package mx.unam.aragon

import java.io.File

open class herenciaClass(var nombre: String = "Pedro", var edad: Int = 20) {
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

    private fun obtenerDescripcion() = File("descripcion.txt")
        .readText()
        .split("\n")
        .shuffled()
        .first()
    override fun toString(): String {
        return "Hola $nombre ya tienes $edad años"
    }
}


data class Alumno(var matricula:String = "00"):herenciaClass(){
    override fun toString(): String {
        return "Alumno(matricula='$matricula' " + super.toString()
    }
}

fun main(args: Array<String>){
    val alumno = Alumno()
    println(alumno)
    alumno.matricula = "A1"
    alumno.nombre = "Pedro"
    alumno.edad = 19
    println(alumno)
}