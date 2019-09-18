package com.example.Google.CTS;

public class InnovaCrysta extends Car {

    private String carMileage;

    public InnovaCrysta(String carMileage) {
        super(false, "6");
        this.carMileage = carMileage;
    }

    @Override
    public String getMileage() {
        return carMileage;
    }
}
