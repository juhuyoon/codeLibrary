/* 
    Example of Abstract class and Methods:
    With an abstract class Animal, 
    with abstract method animalSound()
    Since every animal sound is different, should make it abstract and override the method
    to give its own implementation details. 
*/ 

//abstract class
abstract class Animal {
    //abstract method
    public abstract void animalSound();
}

public class Dog extends Animal {
    public void animalSound() {
        System.out.println("Woof!");
    }
  public static void main(String args[]) {
      Animal obj = new Dog();
      obj.animalSound();
  }
}