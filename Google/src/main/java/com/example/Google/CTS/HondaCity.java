package com.example.Google.CTS;

public class HondaCity extends Car {
    private String carMileage;

    public HondaCity(String carMileage) {
        super(true, "4");
        this.carMileage = carMileage;
    }

    @Override
    public String getMileage() {
        return carMileage;
    }
}
