package com.example.Google.CTS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int carType = Integer.parseInt(bufferedReader.readLine().trim());
        int carMileage = Integer.parseInt(bufferedReader.readLine().trim());

       if(carType == 0) {
           Car wagonR = new WagonR(carMileage);
           wagonR.printCar("WagonR");
       }
        Car wagonR = new WagonR(12);
       wagonR.printCar("WagonR");
    }
}
