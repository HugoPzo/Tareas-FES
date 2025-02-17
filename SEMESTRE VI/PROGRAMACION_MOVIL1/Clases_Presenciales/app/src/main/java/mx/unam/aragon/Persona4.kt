package mx.unam.aragon


data class Persona4(var nombre:String, var edad:Int) {
    init{
        this.nombre = nombre.uppercase()
        this.edad = this.edad * 2
    }

    constructor(nombre:String):this(nombre.replaceAfter("e", "*"), 12)

    override fun toString(): String {
        return "Hola $nombre ya tienes $edad anios"
    }
}
