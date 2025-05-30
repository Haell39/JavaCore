package Faculdade.TestClass;

public class Pessoa {
    // atributos private para proteger os dados
    private String nome;
    private int anoNascimento;
    private int anoAtual;

    // getters e setters publicos para poder acessar e modificar
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    // Método pra verificar se é maior de idade
    public boolean isMaiorDeIdade() {
        return (anoAtual - anoNascimento) >= 18;
    }
}


