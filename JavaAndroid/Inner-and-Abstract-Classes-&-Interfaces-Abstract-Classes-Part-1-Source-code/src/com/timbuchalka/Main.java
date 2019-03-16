package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        //abstract classes define methods, but do not provide implementation of the methods.
        //implementation by the inheritance of the classes from the abstract classes.
	    Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
