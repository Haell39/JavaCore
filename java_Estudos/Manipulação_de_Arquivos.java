package java_Estudos;
import java.io.*;

public class Manipulação_de_Arquivos {

    public static void main(String[] args) {
        String nomeArquivo = "exemplo.txt";
        
        // Escreve no arquivo
        escreverNoArquivo(nomeArquivo, "Esta eh uma linha de texto no arquivo.\n");
        escreverNoArquivo(nomeArquivo, "Esta eh a segunda linha de texto no arquivo.\n");

        // Lê o conteúdo do arquivo
        lerArquivo(nomeArquivo);
    }

    // Método para escrever no arquivo
    public static void escreverNoArquivo(String nomeArquivo, String conteudo) {
        // O bloco try-with-resources fecha automaticamente o arquivo após o uso
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            writer.write(conteudo);
            System.out.println("Texto escrito no arquivo: " + conteudo);
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    // Método para ler o conteúdo do arquivo
    public static void lerArquivo(String nomeArquivo) {
        // O bloco try-with-resources fecha automaticamente o arquivo após o uso
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            System.out.println("\nConteúdo do arquivo:");
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
