package atividade_Diogenes.InvestmentManager;

import java.util.ArrayList;
import java.util.List;

public class CarteiraInvestimentos {
    private List<IInvestimento> investimentos;

    public CarteiraInvestimentos() {
        this.investimentos = new ArrayList<>();
    }

    public void adicionarInvestimento(IInvestimento investimento) {
        investimentos.add(investimento);
    }

    public double calcularRetornoTotalCarteira() {
        double total = 0;
        for (IInvestimento investimento : investimentos) {
            total += investimento.calcularRetornoTotal();
        }
        return total;
    }
}
