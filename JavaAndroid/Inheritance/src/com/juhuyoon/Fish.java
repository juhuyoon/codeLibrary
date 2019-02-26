package com.juhuyoon;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {
        System.out.println("moving muscles");
    }

    private void moveBackFins() {
        System.out.println("moving backfins");
    }

    public void swim(int speed) {
        moveMuscles();
        moveBackFins();
        super.move(speed);

    }
}
