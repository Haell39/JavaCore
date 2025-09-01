package atividade_Diogenes.EletronicosDiogenes;

public class Notebook extends Dispositivo {
    public Notebook(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void executarFuncao() {
        if (ligado) {
            System.out.println(modelo + " está rodando um programa.");
        } else {
            System.out.println(modelo + " está desligado. Não pode rodar programas.");
        }
    }
}

