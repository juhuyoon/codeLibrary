// http://greggordon.org/java/tij4/solutions.htm 
// https://www.plusfeeds.com/java-programming-for-beginners-cheat-sheet/
// http://phaiax.github.io/rust-cheatsheet/ 
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

//Reusing code (implementation)
    //Simplest way to reuse a class is to just use an object of that class directly
    //Another way is to place an object of that class inside a new class. 
    //composing a new class from existing classes is called COMPOSITION(if the composition happens dynamically, call it AGGREGATION)
    //Compositions have a great deal of flexibility, with member objects of the new class typically private, thus can change members without disturbing existing client code. 

//Inheritance
    //Does not have the same flexibility in reusability as compositions, but are important in object-oriented programming. 
    //Concepts are expressed as fundamental units in the programming language via CLASS keyword. 
    //used to take an exisiting class, clone it, then make additions and modifications to the clone (inheritance). 
    //If the original class is changed, the modified "clone" also reflects those changes. 

    //Different types of concept of inheritance:
        //1) Base Types: contains all of the characteristics and behavior that are shared among the types derived from it. 
            //e.g.: used to represent the core of your ideas about some objects in your system.
            //Using inheritance, can build a type hierarchy that expresses the problem you're trying to solve in terms of its types. 
                //e.g. trash example, shape example. 
        //2) Derived Types: Taking an existing type means you're creating a new type. 
            //Duplicates the interface of the base class. 
    //Ways to differentiate the new derived class from original base class: 
        //Add brand new methods to the derived class. 
        //Better way to differentiate the new class is to change the behavior of an existing base-class method(overriding the method)
            //To do so, simply create a new definition for the method in the derived class. 

//Substitution Principle:
    //When you can exactly substitute an object of the derived class for an object of the base class. 
    //When dealing with type hierarchies, often want to treat an object not as the specific type, but instead as its base type. 
        //Can then write code that doesn't depend on specific types. 
        //Programs with these concepts in mind will be extensible to future classes and programmings. 

//Singly rooted hierarchy
    //Should all classes be ultimately be inherited from a single base class?
        //In Java, YES
    //All objects in a singly rooted hierarchy can be guaranteed to have certain functionality. 
    //Singly rooted hierarchy makes it much easier to implement certain styles more than others.    
        //You will always end up with an object that you can determine and especially important with exception handlings, etc. 

//Containers
    //How do you know how much space to create for an application from the beginning?
    //Containers can be used to expand itself whenever necessary to accommodate everything you place inside it. 
    //Two reasons to need a choice of containers
        //1) Containers provide different types of interfaces and external behavior.
        //2) Different containers have different efficiencies for certain operations. 

//Error Handling
    //An exception is an object that is 'thrown' from the site of the error and can be 'caught' by an appropriate exception handler designed to handle that particular type of error. 
    