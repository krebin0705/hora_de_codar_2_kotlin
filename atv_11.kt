fun main() {
    println("Calculadora Simples")
    
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()
    
    print("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()
    
    println("\nEscolha a operação:")
    println("1 - Soma")
    println("2 - Subtração")
    println("3 - Divisão")
    println("4 - Multiplicação")
    print("Opção: ")
    val op = readLine()!!.toInt()

    when (op) {
        1 -> println("Resultado: ${num1 + num2}")
        2 -> println("Resultado: ${num1 - num2}")
        3 -> println("Resultado: ${num1.toDouble() / num2}")
        4 -> println("Resultado: ${num1 * num2}")
        else -> println("Opção inválida!")
    }
}
