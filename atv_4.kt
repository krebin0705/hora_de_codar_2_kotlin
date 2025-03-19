fun main() {
//Faça um programa que leia 3 valores informados pelo usuário
// (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.


  print("Digite o primeiro número: ")
  var a = readLine()!!.toInt()

  print("Digite o segundo número: ")
  var b = readLine()!!.toInt()

  print("Digite o terceiro número: ")
  var c = readLine()!!.toInt()

  // Criar uma lista com os números e ordenar em ordem decrescente
  var numeros = listOf(a, b, c).sortedDescending()

  // Soma dos dois maiores números
  var somaDosMaiores = numeros[0] + numeros[1]

  println("A soma dos dois maiores números é: $somaDosMaiores")
 }



