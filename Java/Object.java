import jdk.javadoc.internal.doclets.toolkit.taglets.ReturnTaglet;

//Objects

//Holding an object with a word/sentence, create a String reference
//Strings initialized with quoted text. 
//When you create a reference, you want to connect it with a new object via using the (new) operator.

String s = new String("asdf"); //how to make the String by supplying an initial character string. 

//You can create your own objects. 
//You can store data in five different places:
    //1) Registers: Fastest storage and exists inside the processor, but # of registers is similarly limited.
    //2) The Stack: lives in the general RAM area, directd support from the processor via stack pointer. Extremely fast and efficient.
                    //Exact lifetime of all the items are stocked on the stack, so there are limits on the flexibility.
    //3) The heap: general purpose pool of memory, also in RAM. Good thing: compiler doesn't need to know how long the storage must be in the heap. 
                    //Whenever you need an object, simply write the code to create it by using new, and storage is allocated in the heap when code is executed. 
    //4) Constant Storage: Often placed directly in the program code, saf. Only in ROM(read-only memory).
    //5) Non-RAM Storage: If data is outside a program, can exist while the program is not running.

//////////////////////////////////////////////////////////////////////////////////////////////////////
//Special case: primitive types
    //These are used to crate an object with new
        //These are automatic variables that are created that is NOT A REFERENCE. 
        //Primitive Types
    //boolean, char, byte, short, int, long, float, double, void

        //Wrapper Types (allows you to make a non-primitive object on the heap to represent the primitive type. )
    //     Basically, generic classes only work with objects and don’t support primitives. As a result, if we want to work with them, we have to convert primitive values into wrapper objects.
    //Boolean, Character, Byte, Short, Integer, Long, Float, Double, Void
    //e.g.:
    char c = 'x';
    Character ch = new Character(c); || Character ch = new Character('x');
    Character ch = 'x';
    char c = ch;

//Arrays in Java
    //Arrays in Java is guaranteed to be initialized and cannot be accessed outside of its range. 
    //An array of objects = an array of references, initialized to a special value with its own keyword: null. 

//Scoping in Java determined by curly braces {}
//e.g.
{
    int x = 12; //only x available  
    {
        int q = 96; //both x & q available
    }
    //only x available
    //q is out of scope
};

//reference vanishes at the end of the scope. 

//Creating new data types: class
    //if everything is an object, what determines how a particular class of object looks and behaves?
    //The class keyword is followed by the name of the new type. 
class ATypeName { /* Class body goes here */}
        //Can create an object of this type using new
        ATypeName a = new ATypeName();

//Fields and methods
    //When defining a class, can put two types of elements in your class: fields & methods
    //1) Field: object of any type that you can talk to via its reference or a primitive type. 
                //If reference to an object, must initialize that reference to connect with an actual object. 
                //Each object keeps its own storage for its field, not shared among objects.
                class DataOnly {
                    int i;
                    double d;
                    boolean b;
                } //only holds data.

                DataOnly data = new DataOnly(); //To creating an object. 
                //Assign values to the fields, and to refer to value, use a period.
                //Cannot do much except holding data. 
                
                data.i = 47;
                data.d = 1.1;
                data.b = false;

    //2) Methods: Determines the messages an object can receive. The fundamental parts of a method are the name, arguments, return type, and body. 
                //Basic Form:
                ReturnType methodName( /* Argument */) {
                    /* Method Body */
                }
                //Return type describes value that comes back from the method after it is called. 
                //The method name and argument list uniquely identify that method. 
                //Methods in Java can be created only as part of a class, can only be called for an object, the object must be able to eprform the method call. 

                //Call a method for an object by naming the object followed by a period, followed by the name of the method and its argument list:
                objectName.methodName(arg1, arg2, arg3);

                int x = a.f(); //return value must be compatible with the type of x, which in this case, is int. 
                
        //Argument List
                //Specifies what information you pass into the method, takes in the form of objects. 
                //Type of reference must be correct, so if the argument is a String, must also pass in a String or compiler will give an error. 

                int storage(String s) {
                    return s.length() * 2;
                }
                //argument is of type String and is called s, s is passed into the method, then treat it like any other object. 
                //the return keyword means ending and produces a value of whatever statement is after. Can return any type you want, but if you don't want to return anything,
                //To not return anything, use the method void. 

                boolean flag() { return true; }
                double naturalLogBase() { return 2.718; }
                void nothing() { return; }
                void nothing2() {}

                //when the return type is void, the return keyword is used only to exit the method, so it is unnecessary when you reach the end of the method. 
                //if you have a non-void return type, then compiler will force you to return the appropriate type of value regardless of where you return. 

//Using other components
                //when using a predefined class in the program, the compiler must know how to locate it. 
                //Must use the "import" keyword, which tells the compiler to bring in a package, which is a library of classes. 
                 import java.util.ArrayList; //to use Java's ArrayList class
                 import java.util.*; //To use all, indicating a wild card of the util's packages. 