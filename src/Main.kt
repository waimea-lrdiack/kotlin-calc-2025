fun main() {
    println()
    println("CALCULATOR")
    println()
    println("=========================================================================================================")
    println()

    var number1 = getFloat("Enter a number: ")
    var number2 = getFloat("Enter a 2nd number: ")

    while (true) {
        var operation = getString("Enter an operation (+, -, *, /): ")
        if (operation == "+") {
            println(number1 + number2)
            break
        }
        if (operation == "-") {
            println(number1 - number2)
            break
        }
        if (operation == "*") {
            println(number1 * number2)
            break
        }
        if (operation == "/") {
            println(number1 / number2)
            break
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