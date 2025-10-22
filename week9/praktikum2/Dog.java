package week9.praktikum2;

public class Dog extends Animal implements Flyable, Swimmable {
    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " menggonggong: Woof woof!");
    }

    @Override
    public void fly(){
        System.out.println(name + " tidak bisa terbang!");
    }

    @Override
    public void swim(){
        System.out.println(name + " sedang berenang di kolam!");
    }
}
