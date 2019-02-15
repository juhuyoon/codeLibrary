/* 
    Process in which a call to an overriden method is resolved at runtime rather than at compiler. 
*/

class Animal {
    public void animalSound() {
        System.out.println("Default Sound");
    }
}

public class DynamicPoly extends Animal {
    public void animalSound(){
        System.out.println("Dog goes woof!");
    }
    public static void main(String args[]) {
        Animal obj = new DynamicPoly();
        obj.animalSound();
    }
}

//public class Vehicle {  }
//public class Car extends Vehicle {
// private License myCarLicense;
//} A Car IS-A Vehicle and HAS-A License then the code would look like this. 