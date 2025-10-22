package week9.praktikum2;

public class Dog extends Animal implements Flyable, Swimmable{
    public Dog(String name){
        super(name);
    }

    public void makeSound(){
        System.out.println(name + "ceicei");
    }

    public void swim(){
        System.out.println(name + "dog dog dog");
    }
}
