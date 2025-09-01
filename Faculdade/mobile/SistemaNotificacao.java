package Faculdade.mobile;

// Interface
interface Notificacao {
    void enviarMensagem(String mensagem);
}

// Implementação via Email
class Email implements Notificacao {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando EMAIL: " + mensagem);
    }
}

// Implementação via SMS
class SMS implements Notificacao {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}

// Outra implementação (extra) - WhatsApp
class WhatsApp implements Notificacao {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);
    }
}

// Teste
public class SistemaNotificacao {
    public static void main(String[] args) {
        Notificacao n1 = new Email();
        Notificacao n2 = new SMS();
        Notificacao n3 = new WhatsApp();

        n1.enviarMensagem("Relatório disponível.");
        n2.enviarMensagem("Seu código de verificação é 1234.");
        n3.enviarMensagem("Nova reunião às 15h.");
    }
}
