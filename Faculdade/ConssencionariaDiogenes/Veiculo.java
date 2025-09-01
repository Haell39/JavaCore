package Faculdade.ConssencionariaDiogenes;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double velocidade;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public abstract void acelerar();
    public abstract void frear();

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Velocidade: " + velocidade + " km/h");
    }
}
