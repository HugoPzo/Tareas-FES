package mx.unam.aragon

/*
class Persona(){
    var nombre : String=""
    var edad : Int = 0

    override fun toString(): String{
        return "Hola $nombre ya tiene $edad anios"
    }
}*/


// ESTRUCTURA CLASE

data class Persona(val nombre : String, val edad : Int){
    override fun toString() : String{
        return "Hola $nombre ya tienes $edad anios"
    }
}