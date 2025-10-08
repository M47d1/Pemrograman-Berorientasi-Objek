public class Main{
    public static void main(String[] args){
        Animal a1 = new Animal("Kucing ", 2);
        Dog d1 = new Dog("Woof", 3);

        System.out.println(a1.toString());
        a1.makeSound();

        System.out.println(d1.toString());
        d1.makeSound();
    }
}