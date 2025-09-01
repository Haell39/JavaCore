package atividade_Diogenes.TestClass;
import java.util.Scanner;

/* Programa de calcular media  */
/* menor 4 reprova */
/* maior que 7 aprovado */

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a priemira nota do dicente: ");
        float nota = sc.nextFloat();
        System.out.println("Digite a segunda nota do dicente: ");
        float nota2 = sc.nextFloat();
        System.out.println("Digite a terceira nota do dicente: ");
        float nota3 = sc.nextFloat();
        float media = (nota + nota2 + nota3) / 3;

        System.out.printf("A média do aluno é: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else if (media < 4) {
            System.out.println("Aluno reprovado");
        } else {
            System.out.println("Aluno em recuperação");
        }

    }

}
