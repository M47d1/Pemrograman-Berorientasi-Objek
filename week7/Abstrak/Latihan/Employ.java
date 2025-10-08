
public abstract class Employ{
    protected String name;
    protected double salary;

    public Employ(String name, double salary2){
        this.name = name;
        this.salary = salary2;
    }

    public abstract double calculateBonus();

    public void display(){
        System.out.println(name + "Nama: ");
        System.out.println(salary + "Gaji: ");
        System.out.println(calculateBonus() + "Bonus: ");
    }
}