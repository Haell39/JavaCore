package Kotlin

fun main() {
    println("Digite um número inteiro não negativo:")
    val input = readLine()

    // Verifica se a entrada é válida
    val number = input?.toIntOrNull()
    if (number == null || number < 0) {
        println("Por favor, digite um número inteiro não negativo.")
    } else {
        val result = factorial(number)
        println("O fatorial de $number é $result.")
    }
}

// Função para calcular o fatorial
fun factorial(n: Int): Long {
    return if (n == 0) 1 else n * factorial(n - 1)
}