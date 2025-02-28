package mx.unam.aragon

class Persona6(var nombre : String, var edad : Int) {

    lateinit var despues : String
    init {
        this.nombre = nombre.uppercase()
        this.edad = this.edad*2
        despues = "Inicio despues"
    }

    constructor(nombre:String):this(nombre.replaceAfter('e', "*"), 12)
    {
        ocuparDespues()
    }


    private fun ocuparDespues(){
        if(::despues.isInitialized){
            println("Se inicio despues ($despues")
        }
    }

    override fun toString(): String {
        return "Hola $nombre ya tienes $edad años"
    }

}

fun main(args: Array<String>){
    val lateInit = Persona6("Hugo", 20)
    println(lateInit)
}