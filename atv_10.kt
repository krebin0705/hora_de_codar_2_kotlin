fun main() {
   // Tendo como entrada a altura e o gênero designado ao nascer (codificado da seguinte forma: 1: feminino - 2: masculino - ) de uma pessoa,
    //construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas.
    
    println("Calculadora de Peso Ideal")
    println("--------------------------")

    try {
        // Solicita a altura (em metros)
        print("Digite sua altura (em metros, ex: 1.75): ")
        val altura = readLine()?.toDouble() ?: throw NumberFormatException()

        // Ver se a altura é válida
        if (altura <= 0) {
            println("Erro: Altura deve ser maior que zero.")
            return
        }

        // Solicita o gênero (1: feminino, 2: masculino)
        print("Digite o gênero (1: Feminino | 2: Masculino): ")
        val genero = readLine()?.toInt() ?: throw NumberFormatException()

        // Calcula o peso ideal com base no gênero
        val pesoIdeal = when (genero) {
            1 -> (62.1 * altura) - 44.7  // Fórmula para mulheres
            2 -> (72.7 * altura) - 58    // Fórmula para homens
            else -> {
                println("Erro: Código de gênero inválido. Use 1 (Feminino) ou 2 (Masculino).")
                return
            }
        }

        // Formata o resultado para 2 casas decimais
        val pesoFormatado = "%.2f".format(pesoIdeal)

        // Exibe o resultado
        println("\nSeu peso ideal é: $pesoFormatado kg")
    } catch (e: NumberFormatException) {
        println("Erro: Entrada inválida. Certifique-se de digitar números corretamente.")
    }
}
