package mx.unam.aragon

interface Interfaz {
    var propiedad:Int

    fun metodoUno()
    fun metodoDos()

    fun metodoTres(){
        var dato:Int = 3
        propiedad = 2*dato
        println("Salida $propiedad")
    }
}


class ImplementaIntf(override var propiedad : Int) : Interfaz {
    override fun metodoUno() {
        println("Implemento el metodoUno")
    }

    override fun metodoDos() {
        println("Implemento el metodoDos")
    }

}


fun main(args : Array<String>) {
    val impl = ImplementaIntf(45)
    impl.metodoUno()
    impl.metodoDos()
    impl.metodoTres()

}