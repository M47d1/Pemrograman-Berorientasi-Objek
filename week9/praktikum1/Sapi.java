package week9.praktikum1;

public abstract class Sapi extends Hewan {

    public Sapi(String nama, int jumKaki, boolean bisaTerbang) {
        super(nama, jumKaki, bisaTerbang);
    }
    
    @Override
    public void bersuara(){
        System.out.println("GOG, GOG, GOG");
    }
}
