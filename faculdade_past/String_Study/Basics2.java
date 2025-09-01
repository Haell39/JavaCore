package atividade_Diogenes.String_Study;

public class Basics2 {
    public static void main(String[] args) {
        int i;
// o especificador de formato para caractere (%c)
// mostra o i-ésimo caractere da tabela ASCII
        System.out.printf("Caracteres numericos: \n");
        for (i = 48; i <= 57; i++){
            System.out.printf("%c", i);
        }

        System.out.printf("\nAlfabeticos Maiusculos: \n");
        for (i = 65; i <=90; i++){
            System.out.printf("%c", i);
        }

        System.out.printf("\nAlfabeticos minusculos: \n");
        for (i = 97; i <=122; i++){
            System.out.printf("%c", i);
        }

    }
    
}
