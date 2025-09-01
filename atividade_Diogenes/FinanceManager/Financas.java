package atividade_Diogenes.FinanceManager;

import java.util.ArrayList;
import java.util.List;

public class Financas implements IFinancas {
    private List<Transacao> transacoes = new ArrayList<>();

    @Override
    public void adicionarTransacao(String descricao, double valor, boolean revisar) {
        transacoes.add(new Transacao(descricao, valor, revisar));
    }

    @Override
    public double calcularSaldo() {
        double saldo = 0;
        for (Transacao t : transacoes) {
            saldo += t.getValor();
        }
        return saldo;
    }

    @Override
    public List<Transacao> listarRevisao() {
        List<Transacao> revisar = new ArrayList<>();
        for (Transacao t : transacoes) {
            if (t.isRevisar()) {
                revisar.add(t);
            }
        }
        return revisar;
    }

    @Override
    public void listarTransacoes() {
        for (Transacao t : transacoes) {
            System.out.println(t);
        }
    }
}

