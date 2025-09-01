package atividade_Diogenes.InvestmentManager;

public class InvestimentoRendaFixa extends InvestimentoAbstract {
    private double taxaJurosAnual;

    public InvestimentoRendaFixa(String tipoInvestimento, double valorInicial, double taxaJurosAnual) {
        super(tipoInvestimento, valorInicial);
        this.taxaJurosAnual = taxaJurosAnual;
    }

    @Override
    public double calcularRetornoTotal() {
        return valorInicial * (1 + taxaJurosAnual);
    }
}
