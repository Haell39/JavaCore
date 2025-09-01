package Faculdade.ConssencionariaDiogenes;

public class Moto extends Veiculo {
    private final boolean partidaEletrica;

    public Moto(String marca, String modelo, int ano, boolean partidaEletrica) {
        super(marca, modelo, ano);
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public void acelerar() {
        velocidade += 20;
        System.out.println("A moto acelerou. Velocidade: " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        velocidade = Math.max(0, velocidade - 15);
        System.out.println("A moto freou. Velocidade: " + velocidade + " km/h");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Partida elétrica: " + (partidaEletrica ? "Sim" : "Não"));
    }
}

