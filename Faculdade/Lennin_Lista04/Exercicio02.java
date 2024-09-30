package Faculdade.Lennin_Lista04;
import java.util.Scanner;


public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira um número
        System.out.print("Entre o número: ");
        int numero = scanner.nextInt();
        
        // Converte o número para string para facilitar a iteração
        String numeroStr = String.valueOf(numero);
        
        // Array que contém os números por extenso
        String[] numerosPorExtenso = {
            "zero", "um", "dois", "três", "quatro", 
            "cinco", "seis", "sete", "oito", "nove"
        };
        
        // StringBuilder para armazenar o resultado
        StringBuilder resultado = new StringBuilder();
        
        // Itera sobre cada caractere do número
        for (char digito : numeroStr.toCharArray()) {
            int indice = Character.getNumericValue(digito);
            resultado.append(numerosPorExtenso[indice]).append(", ");
        }
        
        // Remove a última vírgula e espaço
        if (resultado.length() > 0) {
            resultado.setLength(resultado.length() - 2);
        }
        
        // Imprime o resultado
        System.out.println("Resultado: " + resultado.toString());
        
        scanner.close();
    }
}
