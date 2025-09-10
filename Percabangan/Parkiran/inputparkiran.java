package Percabangan.Parkiran;

import java.util.Scanner;

public class inputparkiran {
    Scanner scanner = new Scanner(System.in);

    public void getKendaraanHarian() {
        int totalBiaya = 0;
        int totalHariMasuk = 0;

        int hargaMotor = 2000;
        int hargaMobil = 5000;

        String[] kendaraan = new String[4];

        for (int i = 0; i < kendaraan.length; i++) {
            System.out.print("Hari ke-" + (i + 1) + " (Motor/Mobil/Kosong): ");
            kendaraan[i] = scanner.nextLine();

            if (kendaraan[i].equalsIgnoreCase("Motor")) {
                totalBiaya += hargaMotor;
                totalHariMasuk++;
            } else if (kendaraan[i].equalsIgnoreCase("Mobil")) {
                totalBiaya += hargaMobil;
                totalHariMasuk++;
            } 
        }

        System.out.println("\n--- Rekap Parkir ---");
        System.out.println("Total hari masuk kampus: " + totalHariMasuk);
        System.out.println("Total biaya parkir: Rp " + totalBiaya);
    }

    public static void main(String[] args) {
        InputParkiran ip = new InputParkiran();
        ip.getKendaraanHarian();
    }
}
