package atividade_Diogenes.ContactList;

public class ContatoProfissional implements Contato {
    private String nome;
    private String telefone;
    private String email;
    private String empresa;
    private String cargo;

    public ContatoProfissional(String nome, String telefone, String email, String empresa, String cargo) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.empresa = empresa;
        this.cargo = cargo;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getTelefone() {
        return this.telefone;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("--- Contato Profissional ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Empresa: " + this.empresa);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Email: " + this.email);
    }


    public void agendarReuniao(String assunto) {
        System.out.println("Enviando convite de reunião sobre '" + assunto + "' para " + this.nome + ".");
    }
}