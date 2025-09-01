package atividade_Diogenes.ConssencionariaDiogenes;

public class TesteVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Uno", 2020, 4);
        Moto moto = new Moto("Honda", "CG 160", 2022, true);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2018, 18.5);

        System.out.println("--- Carro ---");
        carro.exibirInformacoes();
        carro.acelerar();
        carro.frear();

        System.out.println("\n--- Moto ---");
        moto.exibirInformacoes();
        moto.acelerar();
        moto.frear();

        System.out.println("\n--- Caminhão ---");
        caminhao.exibirInformacoes();
        caminhao.acelerar();
        caminhao.frear();
    }
}

