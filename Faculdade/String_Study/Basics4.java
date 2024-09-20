package Faculdade.String_Study;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Basics4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        char sexo;

        System.out.print("Informe o seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Informe o sexo (M/F): ");
        sexo = scanner.next().charAt(0);

        if (Character.toUpperCase(sexo) == 'M') {
            System.out.printf("\nSeja bem vindo Sr. %s. \n", nome);
        } else if (Character.toUpperCase(sexo) == 'F') {
            System.out.printf("\nSeja bem vinda Sra. %s \n", nome);
        } else {
            System.out.println("\nOpção inválida!");
        }
    }
}