//Faça um programa que leia 6 valores informados pelo usuário, 
//calcule, exiba os números informados e escreva a média aritmética desses valores lidos.

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

