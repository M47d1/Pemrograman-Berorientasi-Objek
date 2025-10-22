package week9.praktikum1;

public class Sapi extends Hewan {

    public Sapi(String nama, int jumKaki, boolean bisaTerbang) {
        super(nama, jumKaki, bisaTerbang);
    }
    
    @Override
    public void bersuara(){
        System.out.println(nama + " bersuara: Moo... Moo...");
    }
}
