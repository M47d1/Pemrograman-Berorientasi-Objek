package week9.praktikum1;

public class Burung extends Hewan {

    public Burung(String nama, int jumKaki, boolean bisaTerbang) {
        super(nama, jumKaki, bisaTerbang);
    }
    
    @Override
    public void bersuara(){
        System.out.println("mbee, mbee");
    }
}
