package Faculdade.Avaliacao_Lennin;

public class ExemploSplit {
    public static void main(String[] args) {
        // String original
        String texto = "Java,Python,C++,JavaScript";

        // Usando split para dividir a string por vírgulas
        String[] linguagens = texto.split(",");

        // Imprimindo as substrings resultantes
        for (String x : linguagens) {
            System.out.println(x);
        }
    }
}