package com.juhuyoon;

//public means unrestricted access to the class
//private means no other class can access that class
//protected means the member class can only be accessed within its own package.
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) { //setter
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            //if model equals porsche or holden
            this.model = model; //update this variable of String model with the content from the method setModel
        } else {
            this.model = "Unknown";
        }

    }

    public String getModel() {
        return this.model;
    }

}
