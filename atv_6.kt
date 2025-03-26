fun main(){
//Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro,
// o último e o maior de todos eles (considere que todos os números informados serão diferentes)
    val numeros = mutableListOf<Int>()

    for (i in 1..4) {
        print("Digite o ${i}º número: ")
        val numero = readLine()?.toIntOrNull()
        if (numero != null) {
            numeros.add(numero)
        } else {
            println("Entrada inválida. Tente novamente.")
            return
        }
    }

    val primeiro = numeros.first()
    val ultimo = numeros.last()
    val maior = numeros.maxOrNull()

    println("Primeiro número: $primeiro")
    println("Último número: $ultimo")
    println("Maior número: $maior")

}
