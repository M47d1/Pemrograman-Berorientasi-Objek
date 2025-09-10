package week3.Percabangan.Parkiran;

import java.util.Scanner;

public class inputparkiran {
    Scanner scanner = new Scanner(System.in);

    public void getKendaraanHarian() {
        int totalBiaya = 0;
        int totalHariMasuk = 0;

        int hargaMotor = 2000;
        int hargaMobil = 5000;

        System.out.print("Berapa kali masuk kampus? ");
        int jumlahHari = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahHari; i++) {
            System.out.print("Hari ke-" + (i + 1) + " (Motor/Mobil): ");
            String kendaraan = scanner.nextLine();

            if (kendaraan.equalsIgnoreCase("Motor")) {
                totalBiaya += hargaMotor;
                totalHariMasuk++;
                System.out.println("-> Motor, biaya Rp " + hargaMotor);
            } else if (kendaraan.equalsIgnoreCase("Mobil")) {
                totalBiaya += hargaMobil;
                totalHariMasuk++;
                System.out.println("-> Mobil, biaya Rp " + hargaMobil);
            } else {
                System.out.println("-> Tidak valid, dianggap tidak masuk.");
            }
        }

        System.out.println("\n--- Rekap Parkir ---");
        System.out.println("Total hari masuk kampus: " + totalHariMasuk);
        System.out.println("Total biaya parkir: Rp " + totalBiaya);
    }

    public static void main(String[] args) {
        inputparkiran ip = new inputparkiran();
        ip.getKendaraanHarian();
    }
}
