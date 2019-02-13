/* 
    If we had a class
*/
public abstract class Animal {
    public abstract void animalSound();
}

public class Lion extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Roar");
    }
}

public class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Woof");
    }
}

/* 
Although we had the common action for all subclasses animalSound()
but were implemented in different ways to do the same action. 
polymorphism(feature that allows to perform a single action in different ways)
*/


