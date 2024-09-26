// Print Hello World
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java!");

        // Criando instâncias de Cachorro e Gato
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        // Chamando os métodos fazerSom
        cachorro.fazerSom();
        gato.fazerSom();
    }
}

// Interface Animal
interface Animal {
    void fazerSom();
}

// Classe Cachorro que implementa a interface Animal
class Cachorro implements Animal {
    public void fazerSom() {
        System.out.println("O cachorro late.");
    }
}

// Classe Gato que implementa a interface Animal
class Gato implements Animal {
    public void fazerSom() {
        System.out.println("O gato mia.");
    }
}