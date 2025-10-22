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

    public void isHewan(){
        System.out.println("Ini adalah Hewan" + nama + "berapa Jumlah " + jumKaki + "bisa terbang" + bisaTerbang);
    }

    public abstract void bersuara();
}
