package com.example.Google.CTS;

public class WagonR extends Car{
    private String carMileage;

    public WagonR(int carMileage) {
        super(false, "4");
        this.carMileage = Integer.toString(carMileage);
    }


    @Override
    public String getMileage() {
        return carMileage;
    }

}
