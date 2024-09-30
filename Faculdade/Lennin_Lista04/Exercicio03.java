package Faculdade.Lennin_Lista04;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar que o usuário digite seu nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        // Chamar a função para extrair as iniciais
        String iniciais = extrairIniciais(nome);
        
        // Exibir as iniciais
        System.out.println("As iniciais são: " + iniciais);
        
        // Fechar o scanner
        scanner.close();
    }

    public static String extrairIniciais(String nome) {
        // Lista de conectores a serem ignorados
        String[] conectores = {"e", "do", "da", "dos", "das", "de", "di", "du"};
        
        // Separar o nome em partes
        String[] partes = nome.split(" ");
        
        // StringBuilder para armazenar as iniciais
        StringBuilder iniciais = new StringBuilder();
        
        // Percorrer cada parte do nome
        for (String parte : partes) {
            // Verificar se a parte não é um conector
            if (!isConector(parte.toLowerCase(), conectores)) {
                // Adicionar a inicial maiúscula à string de iniciais
                iniciais.append(Character.toUpperCase(parte.charAt(0)));
            }
        }
        
        // Retornar as iniciais como uma string
        return iniciais.toString();
    }

    public static boolean isConector(String parte, String[] conectores) {
        for (String conector : conectores) {
            if (parte.equals(conector)) {
                return true; // É um conector
            }
        }
        return false; // Não é um conector
    }
}
