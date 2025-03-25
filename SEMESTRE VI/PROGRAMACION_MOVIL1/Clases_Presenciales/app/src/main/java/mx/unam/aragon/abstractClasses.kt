package mx.unam.aragon

abstract class Figura{
    private var resultado:Int=0
    abstract fun centro(x:Int=0, y:Int=0)
    abstract fun movimiento(x:Int=0, y:Int=0)

    fun calculos(){
        resultado ++
        println("Realiza operaciones de incremento $resultado")
    }

}

class Rectangulo:Figura(){
    override fun centro(x:Int, y:Int){
        println("Funcion que contiene el centro ($x, $y) ")
    }
    override fun movimiento(x: Int, y: Int){
        println("Funcion que hace el movimiento en el punto ($x, $y)")
    }
}


fun main(args: Array<String>) {
    var rectangulo = Rectangulo()
    rectangulo.centro(10, 23)
    rectangulo.movimiento(40, 23)
    rectangulo.calculos()
    rectangulo.calculos()
    rectangulo.calculos()
}