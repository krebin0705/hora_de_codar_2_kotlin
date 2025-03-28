fun main() {
    println("Calculadora de Peso Ideal")
    println("--------------------------")

    try {
        // Entrada da altura em metros
        print("Digite sua altura (em metros, ex: 1.75): ")
        val altura = readLine()?.toDouble() ?: throw NumberFormatException()

        // Ver se a altura é válida
        if (altura <= 0) {
            println("Altura inválida! Deve ser maior que zero.")
            return
        }

        // Entrada do gênero (1: feminino, 2: masculino)
        print("Digite o gênero (1: Feminino | 2: Masculino): ")
        val genero = readLine()?.toInt() ?: throw NumberFormatException()

        // Calculo do peso ideal
        val pesoIdeal = when (genero) {
            1 -> (62.1 * altura) - 44.7  // Fórmula para mulheres
            2 -> (72.7 * altura) - 58   // Fórmula para homens
            else -> {
                println("Código de gênero inválido! Use 1 (Feminino) ou 2 (Masculino).")
                return
            }
        }

        // Formata o peso para 2 casas decimais
        val pesoFormatado = "%.2f".format(pesoIdeal)

        // Exibe o resultado
        println("\nSeu peso ideal é aproximadamente: $pesoFormatado kg")
    } catch (e: NumberFormatException) {
        println("Erro: Entrada inválida! Certifique-se de digitar números corretamente.")
    }
}
