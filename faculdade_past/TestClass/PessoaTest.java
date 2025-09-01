package atividade_Diogenes.TestClass;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setAnoNascimento(2000);
        pessoa.setAnoAtual(2024);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Maior de idade? " + (pessoa.isMaiorDeIdade() ? "Sim" : "Não"));
    }
}
