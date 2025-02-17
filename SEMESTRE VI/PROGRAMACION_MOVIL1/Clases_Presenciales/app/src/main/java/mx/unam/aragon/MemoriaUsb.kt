package mx.unam.aragon

class MemoriaUsb {

    var marca : String = ""

        get(){
            return field.uppercase()
        }

        private set (value){
            field = value.replaceAfter(' ', "")
        }

    constructor(dato:String){
        marca = dato
        println("Entrada 1")
    }

    init {
        println("Entrada 2")
        println(marca)
        marca = "Kingston"
    }

}


fun main(args: Array<String>) {
    var memoria = MemoriaUsb("Entrada")
    println(memoria.marca)
}