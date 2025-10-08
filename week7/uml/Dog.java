public class Dog extends Animal{
   public Dog(){
      super();
   }

   public Dog(String name, int age){
      super(name, age);
   }

   @override
   public void makeSound(){
      System.out.println("Dog barks : Woof Woof");
   }

   @override
   public String toString(){
      return "Dog => " + super.toString();
   }
}