package Java_degree;

// Classe abstrata para representar veículos
abstract class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Método abstrato, deve ser implementado pelas subclasses
    public abstract void acelerar();

    // Método concreto que pode ser sobrescrito pelas subclasses
    public void parar() {
        System.out.println("O veículo está parando.");
    }
}

// Classe Carro que herda de Veiculo
class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int portas) {
        super(marca, modelo);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    @Override
    public void parar() {
        System.out.println("O carro está parando.");
    }
}

// Classe Moto que herda de Veiculo
class Moto extends Veiculo {
    private boolean temCarenagem;

    public Moto(String marca, String modelo, boolean temCarenagem) {
        super(marca, modelo);
        this.temCarenagem = temCarenagem;
    }

    public boolean isTemCarenagem() {
        return temCarenagem;
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }
}

// Interface
interface Conduzivel {
    void conduzir();
}

// Classe abstrata que implementa a interface Conduzivel
abstract class Condutor implements Conduzivel {
    private String nome;

    public Condutor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void conduzir();
}

// Classe que implementa Condutor para Motoristas
class Motorista extends Condutor {
    public Motorista(String nome) {
        super(nome);
    }

    @Override
    public void conduzir() {
        System.out.println(getNome() + " está conduzindo um veículo.");
    }
}

// Classe que implementa Condutor para Pilotos
class Piloto extends Condutor {
    public Piloto(String nome) {
        super(nome);
    }

    @Override
    public void conduzir() {
        System.out.println(getNome() + " está pilotando uma moto.");
    }
}

// Padrão Factory para criar veículos
class VeiculoFactory {
    public static Veiculo criarVeiculo(String tipo, String marca, String modelo) {
        switch (tipo.toLowerCase()) {
            case "carro":
                return new Carro(marca, modelo, 4);
            case "moto":
                return new Moto(marca, modelo, true);
            default:
                throw new IllegalArgumentException("Tipo de veículo desconhecido.");
        }
    }
}

public class POOAvancada {
    public static void main(String[] args) {
        // Usando herança e polimorfismo
        Veiculo carro = new Carro("Toyota", "Corolla", 4);
        Veiculo moto = new Moto("Honda", "CBR", true);

        carro.acelerar();
        moto.acelerar();

        carro.parar();
        moto.parar();

        // Usando a interface e polimorfismo
        Conduzivel motorista = new Motorista("João");
        Conduzivel piloto = new Piloto("Maria");

        motorista.conduzir();
        piloto.conduzir();

        // Usando o padrão Factory para criar objetos
        Veiculo veiculo1 = VeiculoFactory.criarVeiculo("carro", "Ford", "Fiesta");
        Veiculo veiculo2 = VeiculoFactory.criarVeiculo("moto", "Yamaha", "YZF-R1");

        System.out.println("\nVeículos criados pelo Factory:");
        System.out.println(veiculo1.getMarca() + " " + veiculo1.getModelo());
        System.out.println(veiculo2.getMarca() + " " + veiculo2.getModelo());
    }
}
