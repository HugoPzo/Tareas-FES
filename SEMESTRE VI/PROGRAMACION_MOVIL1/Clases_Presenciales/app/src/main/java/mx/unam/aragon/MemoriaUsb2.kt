package mx.unam.aragon

class MemoriaUsb2(val datoDos:String="") {

    var marca:String=""
        get(){
            return field.uppercase()
        }
        private set(value){
            field = value.replaceAfter(' ', "*")
        }


    init {
        println("Entrada 1")
        println(marca)
        marca = "Kingston"
    }

}


fun main(args: Array<String>) {
    var memoria = MemoriaUsb2()
    println("${memoria.marca} ${memoria.datoDos}")
    println("**********************")


    var memoriaDos = MemoriaUsb("RGB")
    println("${memoriaDos.marca} ${memoria.datoDos}")
}