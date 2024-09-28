package Kotlin;

// FatorialCalculator.java
public class FatorialCalculator {
    public long calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }
}