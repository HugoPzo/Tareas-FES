package mx.unam.aragon

fun main(args: Array<String>){
    println("Dame un valor: ")
    var dato = readln()!!.uppercase()
    println(dato)

    println("Dame un valor: ")
    var dato1 = readln()?.uppercase()
    println(dato)

    println("Dame un valor: ")
    var dato2 = readln().uppercase()
    println(dato)
}