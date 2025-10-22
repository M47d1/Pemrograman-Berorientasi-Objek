package week9.praktikum2;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck("Donald");
        Dog dog = new Dog("Buddy");

        System.out.println("========= Duck ==========");
        duck.makeSound();
        duck.eat();
        duck.fly();
        duck.swim();

        System.out.println("\n========= Dog ==========");
        dog.makeSound();
        dog.eat();
        dog.fly();
        dog.swim();
    }
}