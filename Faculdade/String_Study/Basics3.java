package Faculdade.String_Study;

public class Basics3 {
    public static void main(String[] args) {
        char c;
        int n;
        // os caracteres são tipos ordinais, portanto, podem
        // ser usados no controle de instruções de repetição
        for(c='0'; c<='9'; c++){
            // converte o caractere numérico no respectivo valor inteiro
            n = c - 48;
            System.out.printf("%d X 10 = %d\n", n, (n * 10));
        }
    }
}
