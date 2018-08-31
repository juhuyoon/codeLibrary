//Operator takes one or more arguments and produces a new value.
//Different than ordinary method calls, effect is the same. 

//All operators produce a value from their operands. Some operators change the value of the operand (side effect)
//Almost all operators work only with primitives. 

//Precedence:
    //use parentheses to make explicit classifications, although in simple arithmetic, division/multiplication occurs before addition/subtraction.
    //Assignment via = . 
    //For example, if you say a = b for primitives, then the contents of b are
    //copied into a. If you then go on to modify a, b is naturally unaffected by this modification.

    //eg 
    class Tank {
        int level;
    }
public class Assignment {
 public static void main(String[] args) {
 Tank t1 = new Tank();
 Tank t2 = new Tank();
 t1.level = 9;
 t2.level = 47;
 print("1: t1.level: " + t1.level +
 ", t2.level: " + t2.level);
 t1 = t2;
 print("2: t1.level: " + t1.level +
 ", t2.level: " + t2.level);
 t1.level = 27;
 print("3: t1.level: " + t1.level +
 ", t2.level: " + t2.level);
 }
} /* Output:
1: t1.level: 9, t2.level: 47
2: t1.level: 47, t2.level: 47
3: t1.level: 27, t2.level: 27 
*/

//Note that t1 and t2 point to the same object!
//Aliasing means there are multiple aliases to a location that can be updated, and these aliases have different types. 
//In the following example, a and b are two variable names that have two different types A and B. B extends A.


//If you don't want aliasing, forego the assignment via:
t1.level = t2.level; //retains two separate objects instead of discarding one (t2)

//Aliasing during Method Calls

class Letter {
    char c;
}

public class Object {
    static void f(letter y) {
        y.c = 'z';
    }
    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1: y.c " = x.c);
        f(x);
        print("2: x.c " = x.c);
    }
}; /* Output:
1: x.c: a
2: x.c: z */



//ex2): Create a class containing a float and use it to demonstrate aliasing.

class MyClass {
	float f;
}


public class Ch03ex02 {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass();
		print("obj1.f = " + obj1.f);
		print("obj2.f = " + obj2.f);
		print();
		obj1.f = 5;
		obj2.f = 10;
		print("obj1.f = " + obj1.f);
		print("obj2.f = " + obj2.f);
		print();
		obj1 = obj2;
		print("After obj1 = obj2: ");
		print("obj1.f = " + obj1.f);
		print("obj2.f = " + obj2.f);
		print();
		obj1.f = 15;
		print("obj1.f = " + obj1.f);
		print("obj2.f = " + obj2.f);
		print();
		obj2.f = 20;
		print("obj1.f = " + obj1.f);
		print("obj2.f = " + obj2.f);

	}

}

/* Output:
obj1.f = 0.0
obj2.f = 0.0
obj1.f = 5.0
obj2.f = 10.0
After obj1 = obj2: 
obj1.f = 10.0
obj2.f = 10.0
obj1.f = 15.0
obj2.f = 15.0
obj1.f = 20.0
obj2.f = 20.0
*/


//ex3): Create a class containing a float and use it to demonstrate aliasing during method calls.
