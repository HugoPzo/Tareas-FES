package mx.unam.aragon

class Persona9(){
    var nombre : String = ""
        get() = field.uppercase()
        set(value){
            field = value.replaceAfter(' ', "")
        }
    
    var edad : Int = 0
        get() = 30
        set(value) {
            field = value * 20
        }


    override fun toString(): String {
        return "Hola $nombre ya tienes $edad años"
    }
}


fun main(args: Array<String>) {
    val persona = Persona9()
    persona.nombre = "Pedro Angel"
    persona.edad = 20

    println(persona.nombre)
    println(persona.edad)

    println(persona)
}