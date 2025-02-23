import kotlin.math.pow


fun main() {
    println()
    println("CALCULATOR")
    println()
    println("=========================================================================================================")
    println()

    val number1 = getFloat("Enter a number: ")
    val number2 = getFloat("Enter a 2nd number: ")

    while (true) {
        val operation = getString("Enter an operation (+, -, *, /, ^, !): ")
        val result: Float

        if (operation == "+") {
            val result = println(number1 + number2)
            break
        }

        if (operation == "-") {
            val result = println(number1 - number2)
            break
        }

        if (operation == "*") {
            val result = println(number1 * number2)
            break
        }

        if (operation == "/") {
            val result = println(number1 / number2)
            break
        }

        if (operation == "^") {
            val result = println(number1.pow(number2).toDouble())
        }


        else {
            println("Enter a valid operation")
            continue
        }
    }

}



fun getString(prompt: String): String {
    var userInput: String

    while(true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank()) break
    }

    return userInput
}


fun getFloat(prompt: String): Float {
    var floatValue: Float?

    while(true) {
        val userInput = getString(prompt)
        floatValue = userInput.toFloatOrNull()
        if (floatValue != null) break
    }

    return floatValue!!
}


