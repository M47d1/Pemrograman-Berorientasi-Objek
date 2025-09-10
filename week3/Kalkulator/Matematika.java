package week3.Kalkulator;

public class Matematika {

    public int tambah(int a, int b) {
        return a + b;
    }

    public int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public double bagi(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Error: Tidak bisa dibagi dengan nol!");
        }
        return (double) a / b;
    }

    public double rataRata(int a, int b) {
        return (a + b) / 2.0;
    }
}
