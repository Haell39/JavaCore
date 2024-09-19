package Java_degree;
import java.util.InputMismatchException;
import java.util.Scanner;

// Exceção personalizada
class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException(String message) {
        super(message);
    }
}

public class Tratamento_de_Exceções {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Tentativa de leitura de números inteiros
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();
            
            // Verificação se num2 é zero para lançar exceção personalizada
            if (num2 == 0) {
                throw new DivisaoPorZeroException("Erro: Tentativa de divisão por zero.");
            }
            
            // Realiza a divisão
            int resultado = dividir(num1, num2);
            System.out.println("Resultado da divisão: " + resultado);
            
        } catch (DivisaoPorZeroException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        } catch (InputMismatchException e) {
            // Captura se o usuário digitar algo que não seja um número inteiro
            System.out.println("Erro: Você deve digitar um número inteiro.");
        } catch (Exception e) {
            // Captura qualquer outro tipo de exceção
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            // Bloco que sempre é executado
            System.out.println("Finalizando o programa. Obrigado!");
            scanner.close(); // Fecha o Scanner
        }
    }
    
    // Método que realiza a divisão entre dois números inteiros
    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }
}
