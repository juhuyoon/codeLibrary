package com.example.Google.CTS;

public abstract class Car {
    protected boolean isSedan;
    protected String seats;
    abstract public String getMileage();

    public Boolean getIsSedan() {
        return isSedan;
    }

    public void setIsSedan(Boolean sedan) {
        isSedan = sedan;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public Car(Boolean isSedan, String seats) {
        this.isSedan = isSedan;
        this.seats = seats;
    }

    public void printCar(String name) {
        System.out.println(
                "A " + name + " is" + (this.getIsSedan() ? "" : "not ") + "Sedan, is " + this.getSeats() + "-seater, and has a mileage of around " + this.getMileage() + "."
        );
    }

}
