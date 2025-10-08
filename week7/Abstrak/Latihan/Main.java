
public class Main {
    public static void main(String[] args) {
        Employ manager = new Manager("Adii", 100000);
        Employ staff = new Staff("Qui", 50000);

        System.out.println("\n---- Data Manager ----");
        manager.display();

        System.out.println("\n---- Data Staff ----");
        staff.display();
    }
}
