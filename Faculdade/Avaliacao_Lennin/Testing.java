package Faculdade.Avaliacao_Lennin;

public class Testing {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String original = "Brasil";
        String sub = original.substring(0, 3); // "Bra"
        String anotherSub = "Bra"; // string literal
        System.out.println("\n" + sub);

// Comparando substrings
System.out.println(sub.equals(anotherSub)); // Isso retornará true
    }
}