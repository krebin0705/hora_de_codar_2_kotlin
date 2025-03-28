fun main() {
    println("Digite o seu ano de nascimento:")
    
    try {
        val anoNascimento = readLine()?.toInt() ?: throw NumberFormatException()
        val anoAtual = java.time.Year.now().value
        val idade = anoAtual - anoNascimento
        
        if (idade >= 16) {
            println("Você pode votar este ano!")
        } else {
            println("Você não pode votar este ano.")
        }
    } catch (e: NumberFormatException) {
        println("Entrada inválida! Por favor, digite um ano válido.")
    }
}
