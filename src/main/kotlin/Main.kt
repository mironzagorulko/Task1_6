fun main() {
    println("Введите первую цифру (0-9):")
    val firstDigit = readLine()?.trim()


    println("Введите вторую цифру (0-9):")
    val secondDigit = readLine()?.trim()


    if (firstDigit != null && secondDigit != null && firstDigit.length == 1 && secondDigit.length == 1) {
        val digit1 = firstDigit[0]
        val digit2 = secondDigit[0]


        if (digit1 != digit2) {

            val oddNumbers = mutableListOf<String>()


            oddNumbers.add("$digit1$digit2")
            oddNumbers.add("$digit2$digit1")


            val result = oddNumbers.filter { it.last().toString().toInt() % 2 != 0 }


            if (result.isNotEmpty()) {
                println("Созданное нечетное число: ${result.joinToString(", ")}")
            } else {
                println("Создать нечетное число невозможно")
            }
        } else {
            println("Цифры должны быть различными.")
        }
    } else {
        println("Некорректный ввод. Пожалуйста, вводите только одну цифру.")
    }
}

