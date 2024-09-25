import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Chama o método soma com os valores 5 e 3
        int resultado = soma(5, 3);
        System.out.println("Resultado: " + resultado);
    }

    // Método que retorna a soma de dois números inteiros
    public static int soma(int a, int b) {
        return a + b;  // Retorna a soma de a e b
    }
}