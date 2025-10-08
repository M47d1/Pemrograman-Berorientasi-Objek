public class Manager extends Employ {
    public Manager(String name, double  salary){
        super(name, salary);
    }

    @Override
    public double calculateBonus(){
        return salary * 0.2;
    }
}
