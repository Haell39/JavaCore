package Kotlin

// Main.kt
fun main() {
    println("Digite um número inteiro não negativo:")
    val entrada = readLine()

    val numero = entrada?.toIntOrNull()
    if (numero == null || numero < 0) {
        println("Por favor, digite um número inteiro não negativo.")
    } else {
        // Cria uma instância da classe Java
        val fatorialCalculator = FatorialCalculator()
        val resultado = fatorialCalculator.calcularFatorial(numero)
        println("O fatorial de $numero é $resultado.")
    }
}
