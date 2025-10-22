package week9.praktikum2;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck("Done");
        Dog dog = new Dog("dddd");


        System.out.println("========= Duck ==========");
        duck.makeSound();
        duck.eat();
        duck.fly();
        duck.swim();


        System.out.println("========= Dog ==========");
        dog.makeSound();
        dog.eat();
        dog.swim();
    }
}
