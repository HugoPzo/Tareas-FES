package mx.unam.aragon

class Persona5 {

    var nombre: String = ""

        get() = field.uppercase()

        set(value) {
            field = value.replaceAfter(' ', "")
        }

    var edad : Int = 0

    override fun toString(): String {
        return "Hola $nombre ya tienes $edad anios"
    }


}


fun main(ars: Array<String>){
    
    val persona = Persona5()
    persona.nombre = "Pedro Angel"
    persona.edad = 20
    println(persona)

}