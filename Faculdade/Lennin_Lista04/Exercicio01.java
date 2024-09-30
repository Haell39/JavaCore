package Faculdade.Lennin_Lista04;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        
        // caracteres da string
        int numeroCaracteres = input.length();
        System.out.println("a) Número de caracteres: " + numeroCaracteres);
        
        // maiúsculo
        String upperCaseString = input.toUpperCase();
        System.out.println("b) String em maiúsculo: " + upperCaseString);
        
        // vogais na string
        int numeroVogais = contarVogais(input);
        System.out.println("c) Número de vogais: " + numeroVogais);
        
        // "UNI"
        boolean comecaComUNI = input.toUpperCase().startsWith("UNI");
        System.out.println("d) Começa com 'UNI': " + comecaComUNI);
        
        // "RIO"
        boolean terminaComRIO = input.toUpperCase().endsWith("RIO");
        System.out.println("e) Termina com 'RIO': " + terminaComRIO);
        
        // (0 a 9) na string
        int numeroDigitos = contarDigitos(input);
        System.out.println("f) Número de dígitos: " + numeroDigitos);
        
        // palíndromo
        boolean ehPalindromo = isPalindromo(input);
        System.out.println("g) É um palíndromo: " + ehPalindromo);
        
        scanner.close();
    }
    
    // função para contar vogais
    private static int contarVogais(String str) {
        int count = 0;
    
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // Obtém o caractere na posição i
            // Verifica se o caractere é uma vogal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
    
        return count;
    }
    
    // função para contar dígitos(Fiz na linguagem que tenho mais facilidade dps converti)
    private static int contarDigitos(String str) {
        int count = 0;
    
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); 
            if (c >= '0' && c <= '9') {
                count++;
            }
        }
    
        return count;
    }
    
    // função para verificar se é um palíndromo (PESQUISEI, nao sabia fazer)
    private static boolean isPalindromo(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        
        return cleanedStr.equals(reversedStr);
    }
}