package  Kalkulator.Matematika;
import Kalkulator.hitung;

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
            throw new IllegalArgumentException("Pembagi tidak boleh nol");
        }
        return (double) a / b;
    }

    public double rataRata(int a, int b) {
        return (a + b) / 2.0;
    }
}