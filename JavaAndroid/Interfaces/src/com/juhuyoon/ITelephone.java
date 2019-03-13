package com.juhuyoon;

public interface ITelephone {
    //here we only assign the methods that will be used in the interface
    //that a class that implements this interface.

    //these are all signatures.
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

    //in interface, public/private are not needed
    //as those would be defined in the class.

    //When you have an interface all the signatures must be implemented.



}
