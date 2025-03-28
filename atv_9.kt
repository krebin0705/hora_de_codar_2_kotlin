fun main() {
  //Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano 
    //(não é necessário considerar o mês em que ela nasceu).
    
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
