package week3.Kalkulator;
import java.util.Scanner;

public class hitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matematika matematika = new Matematika();

        System.out.print("Input angka pertama: ");
        int a = scanner.nextInt();

        System.out.print("Input angka kedua: ");
        int b = scanner.nextInt();

        System.out.println("\nPilih Opsi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Rata-rata");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil Penjumlahan: " + matematika.tambah(a, b));
                break;
            case 2:
                System.out.println("Hasil Pengurangan: " + matematika.kurang(a, b));
                break;
            case 3:
                System.out.println("Hasil Perkalian: " + matematika.kali(a, b));
                break;
            case 4:
                try {
                    System.out.println("Hasil Pembagian: " + matematika.bagi(a, b));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 5:
                System.out.println("Hasil Rata-rata: " + matematika.rataRata(a, b));
                break;
            default:
                System.out.println("Opsi tidak valid");
        }

        scanner.close();
    }
}
