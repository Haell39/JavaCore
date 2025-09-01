package atividade_Diogenes.FinanceManager;

import java.util.List;

public interface IFinancas {
    void adicionarTransacao(String descricao, double valor, boolean revisar);
    double calcularSaldo();
    List<Transacao> listarRevisao();
    void listarTransacoes();
}

