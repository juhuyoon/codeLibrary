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
