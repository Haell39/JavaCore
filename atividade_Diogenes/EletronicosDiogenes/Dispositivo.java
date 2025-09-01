package atividade_Diogenes.EletronicosDiogenes;

public abstract class Dispositivo {
    protected String marca;
    protected String modelo;
    protected boolean ligado;

    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println(modelo + " ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println(modelo + " desligado.");
    }

    public abstract void executarFuncao();

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ligado: " + (ligado ? "Sim" : "Não"));
    }
}
