package atividade_Diogenes.FinanceManager;

public class AppFinancas {
    public static void main(String[] args) {
        IFinancas financas = new Financas();

        financas.adicionarTransacao("Salário", 3000.00, false);
        financas.adicionarTransacao("Aluguel", -1200.00, false);
        financas.adicionarTransacao("Compra online", -200.00, true);

        System.out.println("Transações:");
        financas.listarTransacoes();

        System.out.println("\nSaldo atual: " + financas.calcularSaldo());

        System.out.println("\nTransações para revisão:");
        for (Transacao t : financas.listarRevisao()) {
            System.out.println(t);
        }
    }
}

