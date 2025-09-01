package atividade_Diogenes.InvestmentManager;

import java.util.Scanner;

public class TesteInvestimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarteiraInvestimentos carteira = new CarteiraInvestimentos();

        System.out.println("Digite o tipo de investimento (ex.: CDB): ");
        String tipo = scanner.nextLine();

        System.out.println("Digite o valor inicial: ");
        double valor = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a taxa de juros anual (ex.: 0.05 para 5%): ");
        double taxa = Double.parseDouble(scanner.nextLine());

        InvestimentoRendaFixa investimento = new InvestimentoRendaFixa(tipo, valor, taxa);
        carteira.adicionarInvestimento(investimento);

        System.out.println("Retorno total do investimento: " + investimento.calcularRetornoTotal());
        System.out.println("Retorno total da carteira: " + carteira.calcularRetornoTotalCarteira());

        scanner.close();
    }
}