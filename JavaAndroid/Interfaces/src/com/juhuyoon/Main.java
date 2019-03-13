package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
	// Interfaces are specified methods that a particular class
    // that implements the interface must implement.

        //the interface itself is abstract, with no code
        //only supply the actual method names and parameters.
        //Done to standardize a particular set of classes used.

        //ITelephone timsPhone = new ITelephone not valid
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(234565);
        //timsPhone.powerOn();
        timsPhone.callPhone(234565);
        timsPhone.answer();
    }
}
