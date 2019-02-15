/* 
    If we had a class
*/
public abstract class Animal {
    /* A method that is declared but not defined. Only method signature no body
       Declared using the abstract keyword:
       abstract publid void playInstrument();
       Used to put some kind of compulsion on class who inherits the class has abstract methods. 
       These cannot be abstract:
            Constructors
            Static Methods
            Private Methods
            Methods declared as 'final'
    */
    
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


