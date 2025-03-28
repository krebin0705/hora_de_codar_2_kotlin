fun main() {
   //Uma micro calculadora
//Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a serem executadas
//(codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
//O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos. 

Observação: Considere que só serão lidos os valores 1, 2, 3 ou 4 para as operações
    
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
