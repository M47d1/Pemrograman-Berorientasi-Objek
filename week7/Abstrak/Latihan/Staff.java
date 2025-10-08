public class Staff extends Employ {
    public Staff(String name, double salary){
        super(name, salary);
    }

    @Override
    public double calculateBonus(){
        return salary * 0.1;
    }
}