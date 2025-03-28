fun main() {
    val numeros = mutableListOf<Double>()
    var contador = 1

    println("Digite quatro números entre 0 e 10:")

    while (numeros.size < 4) {
        print("Número $contador: ")
        val input = readLine()

        try {
            val numero = input?.toDouble() ?: throw NumberFormatException()

            if (numero > 0 || numero < 10) {
                numeros.add(numero)
                contador++
            } else {
                println("Número inválido! Digite um valor entre 0 e 10.")
            }
        } catch (e: NumberFormatException) {
            println("Entrada inválida! Digite um número válido.")
        }
    }

    val media = numeros.average()
    println("\nMédia calculada: $media")

    if (media > 5) {
        println("Você passou no teste!")
    } else {
        println("Tente novamente")
    }
}
