package Faculdade.ExercicioFeliz;

public class Carro extends Veiculo {
    private final int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    @Override
    public void acelerar() {
        velocidade += 15;
        System.out.println("O carro acelerou. Velocidade: " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        velocidade = Math.max(0, velocidade - 10);
        System.out.println("O carro freou. Velocidade: " + velocidade + " km/h");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Portas: " + portas);
    }
}

