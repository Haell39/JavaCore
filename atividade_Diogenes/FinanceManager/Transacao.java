package atividade_Diogenes.FinanceManager;

public class Transacao {
    private String descricao;
    private double valor; // positivo = receita, negativo = despesa
    private boolean revisar;

    public Transacao(String descricao, double valor, boolean revisar) {
        this.descricao = descricao;
        this.valor = valor;
        this.revisar = revisar;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public boolean isRevisar() {
        return revisar;
    }

    @Override
    public String toString() {
        return descricao + " | Valor: " + valor + (revisar ? " | Revisar" : "");
    }
}
