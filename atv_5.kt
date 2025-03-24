//Faça um programa que leia 3 valores informados pelo usuário
// (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

  fun main() {
    println("Digite 6 números:")
    val numeros = List(6) {
      print("Número ${it + 1}: ")
      //it é de 0 a 5, por isso o "+1" pra ficar de 0 a 6
      readLine()?.toDoubleOrNull() ?: return println("Entrada inválida. Tente novamente.")
    }
    println("Números informados: $numeros")
    println("Média aritmética: ${numeros.average()}")
  }

