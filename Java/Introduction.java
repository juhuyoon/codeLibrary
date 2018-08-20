// http://greggordon.org/java/tij4/solutions.htm 
//Soln Guide    

//1) Everything is an Object
//2) A program is a bunch of objects telling each other what to do by sending messages.
//3) Each object has its own memory made up of other objects. 
//4) Every object has a type.
//5) All objects of a particular type can receive the same messages.

//Class: Creating abstract data typpes is a fundamental concept in object-oriented programming. 
//Since a class describes a set of objects, a class is really a data type. 
    //Once a class is established, can make as many objects of that class as you like and then manipulate those objects. 
    //A major challenge of object-oriented programming is to create a one-to-one mapping between elements int he problem space and objects in the solution space. 

    //To make an object useful, requests must be made and these are defined by an interface. 
    //Interface determines the requests that you can make for a particular object. 

//An object provides services:
    //each object has a cohesive set of services it offers.
    //In a good object-oriented design, each object does one thing well, but does not try to do too much.

    //Break into class creators and client programmers
        //Goal of class creators is to build a class that exposes only what's necessary to the client programmer and keeps everything else hiden.
        //Goal of the client programmers is to collect a toolbox full of classes to use for rapid application development.
    //When you create a library, you establish a relationship with the client programmer. 

    //Java uses three explicit keywords to set boundaries in a class: public, private, and protected
        //These are access specifiers determine who can use the classes/definitions.
        //Public: following element is available to everyone.
        //Private: no one can access that element except the creator
        //Protected: similar to private, with the exception that an inheriting class has access to protected members, but not private members. 

        //There is a 'default' access, which is package access b/c classes can access the members of other classses in the same package, but outside the package it is private. 