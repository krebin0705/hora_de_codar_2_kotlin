//Faça um programa que leia 6 números que o usuário vai informar.
// Todos os números lidos com valor inferior a 72 devem ser somados.
// Escreva o valor final da soma efetuada e também todos valores que o usuário informou.

fun main(){

    val numeros = mutableListOf<Int>()
    var soma = 0

    for (i in 1..6) {
        println("Digite o ${i}º número: ")
        val numero = readLine()?.toIntOrNull()
        if (numero != null) {
            numeros.add(numero)
            if( numero < 72) {
                soma =+ numero
            }
        } else {
            println("Entrada inválida. Tente novamente.")
            return
        }
    }
println("números informados: $numeros")
println("soma dos números inferiores a 72 : $soma")


}
