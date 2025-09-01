package Faculdade.ExercicioFeliz;

public class Caminhao extends Veiculo {
    private final double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void acelerar() {
        velocidade += 8;
        System.out.println("O caminhão acelerou. Velocidade: " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        velocidade = Math.max(0, velocidade - 6);
        System.out.println("O caminhão freou. Velocidade: " + velocidade + " km/h");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
    }
}

