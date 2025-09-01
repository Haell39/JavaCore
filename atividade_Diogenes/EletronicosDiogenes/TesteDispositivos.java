package atividade_Diogenes.EletronicosDiogenes;

public class TesteDispositivos {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21");
        Notebook notebook = new Notebook("Dell", "Inspiron 15");
        Televisao televisao = new Televisao("LG", "Smart TV 4K");

        System.out.println("--- Smartphone ---");
        smartphone.exibirInformacoes();
        smartphone.ligar();
        smartphone.executarFuncao();
        smartphone.desligar();
        smartphone.executarFuncao();

        System.out.println("\n--- Notebook ---");
        notebook.exibirInformacoes();
        notebook.ligar();
        notebook.executarFuncao();
        notebook.desligar();
        notebook.executarFuncao();

        System.out.println("\n--- Televisão ---");
        televisao.exibirInformacoes();
        televisao.ligar();
        televisao.executarFuncao();
        televisao.desligar();
        televisao.executarFuncao();
    }
}

