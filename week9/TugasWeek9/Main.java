package week9.TugasWeek9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<KendaraanListrik> kendaraanList = new ArrayList<>();


        kendaraanList.add(new MobilListrik(80, 20, 10));
        kendaraanList.add(new MotorListrik(30, 10, 5));
        kendaraanList.add(new MobilListrik(60, 45, 12));
        kendaraanList.add(new MotorListrik(25, 20, 4));

        double totalWaktu = 0;
        double totalEnergi = 0;

        for (KendaraanListrik k : kendaraanList){
            double waktu = k.hitungWaktuPengisian();
            double energi = k.hitungEnergiDibutuhkan();
            totalWaktu += waktu;
            totalEnergi += energi;

            if (k instanceof MobilListrik){
                System.out.printf("Mobil Listrik → waktu: %.4f jam, energi: %.1f kWh%n", waktu, energi);
            } else if (k instanceof MotorListrik) {
                System.out.printf("Motor Listrik → waktu: %.4f jam, energi: %.1f kWh%n", waktu, energi);
            }
        }
        System.out.println("\nTotal waktu pengisian seluruh kendaraan: " + totalWaktu + " jam");
        System.out.println("Total energi dibutuhkan: " + totalEnergi + " kWh");
    }
}
