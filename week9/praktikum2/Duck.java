package week9.praktikum2;

public class Duck extends Animal implements Flyable, Swimmable {
    public Duck(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " urururu ");
    }

    public void fly(){
        System.out.println(name + "......");
    }

    public void swim(){
        System.out.println(name + ".......");
    }
}
