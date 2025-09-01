package atividade_Diogenes.ContactList;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Gerenciador {

    public static void main(String[] args) {
        //  lista que pode armazenar qualquer objeto que seja um "Contato"
        List<Contato> minhaAgenda = new ArrayList<>();

        // Criando instâncias de contatos de diferentes tipos
        Contato pessoal = new ContatoPessoal(
                "Ana Silva",
                "99999-1234",
                "ana.silva@email.com",
                "Aninha",
                LocalDate.of(1995, Month.OCTOBER, 20)
        );

        Contato profissional = new ContatoProfissional(
                "Carlos Pereira",
                "88888-5678",
                "carlos.pereira@empresa.com",
                "Tech Solutions",
                "Desenvolvedor Sênior"
        );

        // add os contatos na mesma lista
        minhaAgenda.add(pessoal);
        minhaAgenda.add(profissional);

        System.out.println("### Exibindo detalhes de todos os contatos da agenda ###\n");

        // iteração e chamando o metódo
        for (Contato contato : minhaAgenda) {
            contato.exibirDetalhes(); // O método correto é chamado dependendo do tipo do objeto
            System.out.println("---------------------------------");
        }

        System.out.println("\n### Executando comportamentos específicos ###\n");

        for (Contato contato : minhaAgenda) {
            if (contato instanceof ContatoPessoal) {
                ((ContatoPessoal) contato).enviarParabens();
            } else if (contato instanceof ContatoProfissional) {
                ((ContatoProfissional) contato).agendarReuniao("Revisão de Projeto Trimestral");
            }
        }
    }
}