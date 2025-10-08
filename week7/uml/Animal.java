public class Animal{

    private String name;
    private int age;

    public Animal(){
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void getName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void getAge(int age){
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
    
    @Override
    public String toString(){
        return "nama : " + name + "Umur : " + age;
    }
}