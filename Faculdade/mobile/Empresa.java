package Faculdade.mobile;

// Classe Abstrata
abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    // Método comum
    public void baterPonto() {
        System.out.println(nome + " bateu o ponto.");
    }

    // Método abstrato (cada tipo de funcionário implementa do seu jeito)
    public abstract void trabalhar();
}

// Subclasse Gerente
class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está gerenciando a equipe.");
    }
}

// Subclasse Desenvolvedor
class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está codando em Java.");
    }
}

// Teste
public class Empresa {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente("Carlos", 8000);
        Funcionario f2 = new Desenvolvedor("Ana", 5000);

        f1.baterPonto();
        f1.trabalhar();

        f2.baterPonto();
        f2.trabalhar();
    }
}