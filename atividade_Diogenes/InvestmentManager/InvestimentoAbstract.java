package atividade_Diogenes.InvestmentManager;

public abstract class InvestimentoAbstract implements IInvestimento {
    protected String tipoInvestimento;
    protected double valorInicial;

    public InvestimentoAbstract(String tipoInvestimento, double valorInicial) {
        this.tipoInvestimento = tipoInvestimento;
        this.valorInicial = valorInicial;
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public abstract double calcularRetornoTotal();
}
