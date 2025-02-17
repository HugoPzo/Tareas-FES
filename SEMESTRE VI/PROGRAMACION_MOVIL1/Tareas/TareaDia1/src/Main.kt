/*Crear una funcion que calcule la desviacion estandar
de 10 valores*/
/*Tarea: Usuario ingrese 5 valores y saque la desviacion estandar*/

import kotlin.math.pow
import kotlin.math.round
import kotlin.math.sqrt


fun desv_estandar(lista_valores : List<Int>) : Double{

    var suma: Double = 0.0;
    var promedio : Double;
    var largo_lista : Int = lista_valores.size
    var resultado: Double = 0.0;
    var varianza: Double;
    var desviacion_estandar : Double;


    for (i in lista_valores){
        suma += i
    }

    promedio = suma / largo_lista // 4.7

    for (i in lista_valores){
        resultado += (i -promedio).pow(2)
    }

    varianza = resultado / largo_lista

    desviacion_estandar = sqrt(varianza)

    return desviacion_estandar

}

fun pedirDatos(): MutableList<Int>{

    var valor : Int;
    var lista_valores : MutableList<Int> = mutableListOf<Int>()

    println("Ingresa 5 datos enteros.")
    for(i in 1..5){
        valor = readLine()!!.toInt();
        lista_valores.add(valor)
    }

    return lista_valores
}

fun main() {

    // Valores Fijos
    val listaValores = listOf(5, 3, 2, 15, 7, 9, 33, 4, 9, 4)
    var valoresFijosDesv : Double;
    valoresFijosDesv = desv_estandar(listaValores)
    println("-- DESVIACION ESTANDAR CON NUMEROS FIJOS --")
    println("La desviacion estandar de los numeros fijos es: " +
            "${String.format("%.2f", valoresFijosDesv)} \n")


    // Vañpres Variables
    var valoresUsuarDesv : Double;
    var listaNumUsuario = pedirDatos()
    valoresUsuarDesv = desv_estandar(listaNumUsuario)
    println("-- DESVIACION ESTANDAR CON NUMEROS INGRESADOS --")
    println("La desviacion estandar de los numeros del usuario es: " +
            "${String.format("%.2f", valoresUsuarDesv)}")

}

