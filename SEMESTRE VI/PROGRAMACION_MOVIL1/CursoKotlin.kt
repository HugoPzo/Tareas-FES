class CursoKotlin {
    fun main(){

        // PRINT
        println("HELLO WORLD")

        // VARIABLES
        val entero : Int = 42
        /*val entero : Int*/
        val flotante : Float = 54.5f
        val isBool : Boolean = true
        val ch : Char = 'a'
        val oneMessage : String = "Hello World"
        val message : String = if (isBool) "YES" else "NO"

        // COLLECTIONS

        // Lista
        val listaNombre = listOf("Hugo", "Taboada", "Pedro")
        val setNombre = setOf("Hugo", "Taboada", "Pedro")
        val mapNombre = mapOf("Hugo" to 1, "Taboada" to 2, "Pedro" to 3)
        // Mutable list with explicit type declaration
        val listaStringNombre : MutableList<String> = mutableListOf("Hugo", "Taboada", "Pedro")
        val setStringNombre : MutableSet<String> = mutableSetOf("Hugo", "Taboada", "Pedro")
        val mapStringNombre : MutableMap<Int, String> = mutableMapOf(1 to "Hugo", 2 to "Taboada", 3 to "Pedro")

        // To prevent unwanted modifications, you can create a
        // read-only view of a mutable list by assigning it to a List:
        val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
        val shapesLocked: List<String> = shapes

        println("El primer nombre de la ${listaNombre[0]}")
        println("El primer nombre de la ${listaNombre.first()}")
        println("El ultimo nombre de la ${listaNombre.last()}")
        println("La lista tiene ${listaNombre.count()} elementos")
        println("Hugo" in listaNombre) // true

        // Añadir
        listaStringNombre.add("Luis")
        setStringNombre.add("Luis")
        mapStringNombre[4] = "pedro"

        // Eliminar
        listaStringNombre.remove("Luis")
        setStringNombre.remove("Luis")
        mapStringNombre.remove(4)


        // FLOW (if - when - while - for)

        // If
        val d: Int
        val check = true

        if (check) {
            d = 1
        } else {
            d = 2
        }

        println(d)
        // 1

        val a = 1
        val b = 2

        println(if (a > b) a else b) // Returns a value: 2

        // When - (Switch)

        // when statement
        val obj = "Hello"

        when (obj) {
            // Checks whether obj equals to "1"
            "1" -> println("One")
            // Checks whether obj equals to "Hello"
            "Hello" -> println("Greeting")
            // Default statement
            else -> println("Unknown")
        }
        // Greeting


        // when expression
        val obj2 = "Hello"

        val result = when (obj2) {
            // If obj equals "1", sets result to "one"
            "1" -> "One"
            // If obj equals "Hello", sets result to "Greeting"
            "Hello" -> "Greeting"
            // Sets result to "Unknown" if no previous condition is satisfied
            else -> "Unknown"
        }
        println(result)
        // Greeting


        // when without subject
       /* fun main() {
            val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

            val trafficAction = when {
                trafficLightState == "Green" -> "Go"
                trafficLightState == "Yellow" -> "Slow down"
                trafficLightState == "Red" -> "Stop"
                else -> "Malfunction"
            }

            println(trafficAction)
            // Stop
        }

        fun main() {
            val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

            val trafficAction = when (trafficLightState) {
                "Green" -> "Go"
                "Yellow" -> "Slow down"
                "Red" -> "Stop"
                else -> "Malfunction"
            }

            println(trafficAction)
            // Stop
        }*/

    }

    // RANDOM

    /*import kotlin.random.Random*/

    fun rand() {
        val firstResult = Random.nextInt(6)
        val secondResult = Random.nextInt(6)
        if (firstResult == secondResult)
            println("You win :)")
        else
            println("You lose :(")
    }


    fun when_ex() {
        val button = "A"

        println(
            when (button) {
                "A" -> "Yes"
                "B" -> "No"
                "X" -> "Menu"
                "Y" -> "Nothing"
                else -> "There is no such button"
            }
        )
    }


    // RANGES

    /*

        The most common way to create a range in Kotlin is to use the .. operator.
        For example, 1..4 is equivalent to 1, 2, 3, 4.

        To declare a range that doesn't include the end value,
        use the ..< operator. For example, 1..<4 is equivalent to 1, 2, 3.

        To declare a range in reverse order, use downTo.
        For example, 4 downTo 1 is equivalent to 4, 3, 2, 1.

        To declare a range that increments in a step that
        isn't 1, use step and your desired increment value.
        For example, 1..5 step 2 is equivalent to 1, 3, 5.

        You can also do the same with Char ranges:

        'a'..'d' is equivalent to 'a', 'b', 'c', 'd'

        'z' downTo 's' step 2 is equivalent to 'z', 'x', 'v', 't'

     */


    // LOOPS

    // For
    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        print(number)
    }
    // 12345

    // For - iterables
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
    // Yummy, it's a carrot cake!
    // Yummy, it's a cheese cake!
    // Yummy, it's a chocolate cake!

    // -----------------------------------

    // WHILE

    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    // Eat a cake
    // Eat a cake
    // Eat a cake

    // DO-WHILE

    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
    // Eat a cake
    // Eat a cake
    // Eat a cake

    // Bake a cake
    // Bake a cake
    // Bake a cake


    // FUNCTIONS

    fun hello() {
        return println("Hello, world!")
    }

    fun main() {
        hello()
        // Hello, world!
    }

    // Arguments

    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun main() {
        println(sum(1, 2))
        // 3
    }


    // Named arguments

    fun printMessageWithPrefix(message: String, prefix: String) {
        println("[$prefix] $message")
    }

    fun main() {
        // Uses named arguments with swapped parameter order
        printMessageWithPrefix(prefix = "Log", message = "Hello")
        // [Log] Hello
    }

    // Default parameter values


    fun printMessageWithPrefix(message: String, prefix: String = "Info") {
        println("[$prefix] $message")
    }

    fun main() {
        // Function called with both parameters
        printMessageWithPrefix("Hello", "Log")
        // [Log] Hello

        // Function called only with message parameter
        printMessageWithPrefix("Hello")
        // [Info] Hello

        printMessageWithPrefix(prefix = "Log", message = "Hello")
        // [Log] Hello
    }


    // Functions without return

    fun printMessage(message: String) {
        println(message)
        // `return Unit` or `return` is optional
    }

    fun main() {
        printMessage("Hello")
        // Hello
    }

    // Single-expression functions

    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun main() {
        println(sum(1, 2))
        // 3
    }

    // without braces

    fun sum(x: Int, y: Int) = x + y

    fun main() {
        println(sum(1, 2))
        // 3
    }




}