public class Animal{

    private String name;
    private int age;

    public Animal(){
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void getName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void getAge(int age){
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
    
    @Override
    public String toString(){
        return "nama : " + name + "Umur : " + age;
    }
}

// import java.util.ArrayList;

// class Peminjam {
//     private String nama;
//     private String idPeminjam;
//     private String status;
//     private double jumlahPinjaman;
//     private int lamaPinjaman;
//     private double bunga;
//     private double rewardBunga;
//     private double denda;

//     // Constructor
//     public Peminjam(String nama, String idPeminjam, String status, double jumlahPinjaman, int lamaPinjaman) {
//         this.nama = nama;
//         this.idPeminjam = idPeminjam;
//         this.status = status;
//         this.jumlahPinjaman = jumlahPinjaman;
//         this.lamaPinjaman = lamaPinjaman;
//     }

//     // Method perhitungan dasar
//     public double hitungAngsuranPokok() {
//         return jumlahPinjaman / lamaPinjaman;
//     }

//     public double hitungAngsuranPokok(double biayaAdmin) {
//         return (jumlahPinjaman + biayaAdmin) / lamaPinjaman;
//     }

//     public double hitungBunga() {
//         bunga = jumlahPinjaman * 0.1; // contoh bunga 10%
//         return bunga;
//     }

//     public boolean hitungTotalBayar(boolean tepatWaktu) {
//         double total = hitungAngsuranPokok() * lamaPinjaman + hitungBunga();
//         if (tepatWaktu) {
//             total -= rewardBunga;
//         } else {
//             total += denda;
//         }
//         System.out.println("Total yang harus dibayar: " + total);
//         return tepatWaktu;
//     }

//     // Getter dan Setter
//     public String getNama() {
//         return nama;
//     }

//     public String getIdPeminjam() {
//         return idPeminjam;
//     }

//     public String getStatus() {
//         return status;
//     }

//     public double getJumlahPinjaman() {
//         return jumlahPinjaman;
//     }

//     public int getLamaPinjaman() {
//         return lamaPinjaman;
//     }

//     public double getRewardBunga() {
//         return rewardBunga;
//     }

//     public double getDenda() {
//         return denda;
//     }

//     public void setRewardBunga(double rewardBunga) {
//         this.rewardBunga = rewardBunga;
//     }

//     protected void setDenda(double denda) {
//         this.denda = denda;
//     }
// }

// // Subclass Mingguan
// class PeminjamMingguan extends Peminjam {

//     public PeminjamMingguan(String nama, String idPeminjam, double jumlahPinjaman, int lamaPinjaman) {
//         super(nama, idPeminjam, "Mingguan", jumlahPinjaman, lamaPinjaman);
//     }

//     @Override
//     public double hitungAngsuranPokok() {
//         return getJumlahPinjaman() / getLamaPinjaman();
//     }

//     @Override
//     public double hitungBunga() {
//         return getJumlahPinjaman() * 0.02; // bunga 2% per minggu
//     }

//     @Override
//     public double hitungTotalBayar(boolean tepatWaktu) {
//         double total = (hitungAngsuranPokok() + hitungBunga()) * getLamaPinjaman();
//         if (!tepatWaktu) {
//             total += 50000; // denda jika telat
//         }
//         return total;
//     }
// }

// // Subclass Bulanan
// class PeminjamBulanan extends Peminjam {

//     public PeminjamBulanan(String nama, String idPeminjam, double jumlahPinjaman, int lamaPinjaman) {
//         super(nama, idPeminjam, "Bulanan", jumlahPinjaman, lamaPinjaman);
//     }

//     @Override
//     public double hitungAngsuranPokok() {
//         return getJumlahPinjaman() / getLamaPinjaman();
//     }

//     @Override
//     public double hitungBunga() {
//         return getJumlahPinjaman() * 0.05; // bunga 5% per bulan
//     }

//     @Override
//     public double hitungTotalBayar(boolean tepatWaktu) {
//         double total = (hitungAngsuranPokok() + hitungBunga()) * getLamaPinjaman();
//         if (!tepatWaktu) {
//             total += 100000;
//         }
//         return total;
//     }
// }

// // Subclass Tahunan
// class PeminjamTahunan extends Peminjam {

//     public PeminjamTahunan(String nama, String idPeminjam, double jumlahPinjaman, int lamaPinjaman) {
//         super(nama, idPeminjam, "Tahunan", jumlahPinjaman, lamaPinjaman);
//     }

//     @Override
//     public double hitungAngsuranPokok() {
//         return getJumlahPinjaman() / getLamaPinjaman();
//     }

//     @Override
//     public double hitungBunga() {
//         return getJumlahPinjaman() * 0.1; // bunga 10% per tahun
//     }

//     @Override
//     public double hitungTotalBayar(boolean tepatWaktu) {
//         double total = (hitungAngsuranPokok() + hitungBunga()) * getLamaPinjaman();
//         if (!tepatWaktu) {
//             total += 500000;
//         }
//         return total;
//     }
// }

// // Kelas untuk mengelola pinjaman
// class Pinjaman {
//     private ArrayList<Peminjam> daftarPeminjam = new ArrayList<>();

//     public void tambahPeminjam(Peminjam peminjam) {
//         daftarPeminjam.add(peminjam);
//     }

//     public void hitungSemuaAngsuran(boolean statusTepatWaktu) {
//         for (Peminjam p : daftarPeminjam) {
//             double total = p.hitungTotalBayar(statusTepatWaktu);
//             System.out.println("Nama: " + p.getNama() + ", Total Bayar: " + total);
//         }
//     }
// }

// // Kelas main untuk demo
// public class Main {
//     public static void main(String[] args) {
//         Pinjaman pinjaman = new Pinjaman();

//         Peminjam p1 = new PeminjamMingguan("Andi", "P001", 2000000, 4);
//         Peminjam p2 = new PeminjamBulanan("Budi", "P002", 5000000, 6);
//         Peminjam p3 = new PeminjamTahunan("Citra", "P003", 10000000, 2);

//         pinjaman.tambahPeminjam(p1);
//         pinjaman.tambahPeminjam(p2);
//         pinjaman.tambahPeminjam(p3);

//         pinjaman.hitungSemuaAngsuran(true);
//     }
// }
