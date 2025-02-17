package mx.unam.aragon


data class Persona3(var nombre:String, var edad:Int) {
    init{
        this.nombre = nombre.uppercase()
        this.edad = this.edad * 2
    }

    override fun toString(): String {
        return "Hola $nombre ya tienes $edad anios"
    }
}
