package Faculdade.EletronicosDiogenes;

public class Televisao extends Dispositivo {
    public Televisao(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void executarFuncao() {
        if (ligado) {
            System.out.println(modelo + " está mudando de canal.");
        } else {
            System.out.println(modelo + " está desligada. Não pode mudar de canal.");
        }
    }
}

