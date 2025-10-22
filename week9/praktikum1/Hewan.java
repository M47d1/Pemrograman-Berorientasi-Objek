package week9.praktikum1;

public abstract class Hewan {
    protected String nama;
    protected int jumKaki;
    protected boolean bisaTerbang;
    
    public Hewan(String nama, int jumKaki, boolean bisaTerbang){
        this.nama = nama;
        this.jumKaki = jumKaki;
        this.bisaTerbang = bisaTerbang;
    }

    public void infoHewan(){
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah Kaki: " + jumKaki);
        System.out.println("Bisa Terbang: " + (bisaTerbang ? "Ya" : "Tidak"));
    }

    public abstract void bersuara();
}
