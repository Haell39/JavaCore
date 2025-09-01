package Faculdade.EletronicosDiogenes;

public class Smartphone extends Dispositivo {
    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void executarFuncao() {
        if (ligado) {
            System.out.println(modelo + " está fazendo uma chamada.");
        } else {
            System.out.println(modelo + " está desligado. Não pode fazer chamada.");
        }
    }
}

