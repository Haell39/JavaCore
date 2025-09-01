package atividade_Diogenes.ContactList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ContatoPessoal implements Contato {
    private String nome;
    private String telefone;
    private String email;
    private String apelido;
    private LocalDate dataAniversario;

    public ContatoPessoal(String nome, String telefone, String email, String apelido, LocalDate dataAniversario) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.apelido = apelido;
        this.dataAniversario = dataAniversario;
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
        System.out.println("--- Contato Pessoal ---");
        System.out.println("Nome: " + this.nome + " (" + this.apelido + ")");
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Email: " + this.email);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Aniversário: " + this.dataAniversario.format(formatter));
    }


    public void enviarParabens() {
        System.out.println("Enviando mensagem de feliz aniversário para " + this.apelido + "!");
    }
}