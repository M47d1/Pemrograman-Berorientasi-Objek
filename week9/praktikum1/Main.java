package week9.praktikum1;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Burung dan Sapi
        Burung burung = new Burung("Merpati", 2, true);
        Sapi sapi = new Sapi("Sapi Bali", 4, false);

        System.out.println("=== Informasi Hewan ===");
        burung.infoHewan();
        burung.bersuara();

        System.out.println();
        sapi.infoHewan();
        sapi.bersuara();
    }
}
