package week9.praktikum2;

public class Duck extends Animal implements Flyable, Swimmable {
    public Duck(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " bersuara: Kwek kwek!");
    }

    @Override
    public void fly(){
        System.out.println(name + " sedang terbang di langit!");
    }

    @Override
    public void swim(){
        System.out.println(name + " sedang berenang di danau!");
    }
}
