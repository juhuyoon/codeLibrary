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

//Mathematical Operators

//to generate numbers, first create a Random object.
//If Random object with no arguments = uses current time as a seed for the random number generator, creating a new output for each execution. 


//Auto increment and decrement
	//-- (decrease by one unit) && ++ (increase by one unit)
		//e.g. int a = ++a is equal to (a = a + 1)
	//prefix & postfix versions of auto increment/decrements.
		//pre-increment appears before variable, post-increment appears after.
			//pre-increment/pre-decrement = the operation is performed and the value is produced.
			//post-increment/post-decrement = value is produced and the operation is performed. 
			//e.g.
			public class AutoInc {
				public static void main(String[] args) {
					int i = 1;
					print("i : " + i);
		print("++i : " + ++i); // Pre-increment
		print("i++ : " + i++); // Post-increment
		print("i : " + i);
		print("--i : " + --i); // Pre-decrement
		print("i-- : " + i--); // Post-decrement
		print("i : " + i);
	}
} /*
	 * Output: i : 1 
	 ++i : 2 
	 i++ : 2 
	 i : 3 
	 --i : 2 
	 i-- : 2 
	 i : 1
	 */


//Relational Operators
	//generates a boolean result, evalutes relationship between value of operands via true or false.
		//< , > , <=, >=, !=, ==

// : operators/Equivalence.java
public class Equivalence {
	public static void main(String[] args) {
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
	}
} /*
	 * Output: false true
	 */// :~ 
	 //because while the contents of the objects are the same, the references for the objects are NOT the same. 

	 //to compare actual contents of an object, use equals()
	 // : operators/EqualsMethod.java
public class EqualsMethod {
	public static void main(String[] args) {
 Integer n1 = new Integer(47);
 Integer n2 = new Integer(47);
 System.out.println(n1.equals(n2)); 
	}
} /*
	 * Output: true
	 */// :~

 
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
class Box {
	float a;
}

public class PassObject2 {
	static void f(Box y) {
		y.a = 2.71828f;
	}
	public static void main(String[] args) {
		Box x = new Box();
		x.a = 3.1416f;
		print("1: x.a = " + x.a);
		f(x);	
		print("2: x.a = " + x.a);
	}
};

//ex4): Write a program that calculates velocity using a constant distance and a constant time. 
class VelocityCalculator {
	static float velocity(float d, float t) {
		if (t == 0)
			return 0f;
		else
			return d / t;
	}
}

public class VelocityTester {
	public static void main(String[] args) {
		float d = 565.3f;
		float t = 3.6f;
		System.out.println("Distance: " + d);
		System.out.println("Time: " + t);
		float v = VelocityCalculator.velocity(d, t);
		System.out.println("Velocity: " + v);		
	}
}

//ex5): Create a class called Dog containing two Strings: name and says. In main(), create two dogs objects with names "spot" and "scurffy". Then display their names and what htey say. 

	class Dog {
		String name;
		String says;
		void setName(String n){
			name = n;
		}
		void setSays(String s) {
			says = s;
		}
		void showName() {
			Println(name);
		}
		void speak() {
			Println(says);
		}
	}

	public class DogTest {
		public static void main(String[] args) {
			Dog spot = new Dog();
			spot.setName("Spot");
			spot.setSays("Ruff!");
			Dog scruffy = new Dog();
			scruffy.setName("Scruffy");
			scruffy.setSays("Wurf!");
			spot.showName();
			spot.speak();
			scruffy.setName();
			scruffy.speak();
		}
	}

//ex6): Following Exercise 5, create a new Dog reference and assign it ot spot's object. Test for comparison using == and equals() for all referenes.
	class Dog{
		String name;
		String says;
		void setName(String n) {
			name = n;
		}
		void setSays(String s) {
			says = s;
		}
		void showName() {
			Println(name);
		}
		void speak() {
			Println(says);
		}
	}

	public class DogCompare {
		public static void main(String[] args) {
			Dog spot = new Dog();
			spot.setName("Spot");
			spot.setSays("Ruff");
			Dog scruffy = new Dog();
			scruffy.setName("Scruffy");
			scruffy.setSays("Wurf");

			spot.showName();
			spot.speak();

			scruffy.showName();
			scruffy.speak();

			Dog butch = new Dog();
			butch.setName("Butch");
			butch.setSays("Hello");

			butch.showName();
			butch.speak();

			Println("Comparison: ");
			Println("spot == butch: " + (spot == butch));
			Println("spot.equals(butch): " + spot.equals(butch));
			Println("butch.equals(spot): " + butch.equals(spot));
			Println("Now assign: spot = butch");

			spot = butch;

			Println("Compare again: ");
			Println("spot == butch: " + (spot == butch));
			Println("spot.equals(butch): " + spot.equals(butch));
			Println("butch.equals(spot): " + butch.equals(spot));
			Println("Spot: ");

			spot.showName();
			spot.speak();
			Println("Butch: ");
			butch.showName();
			butch.speak();
		}
	}

//ex7): Write a program that simulates coin-flipping
public class CoinToss {
	public static void main(String[] args) {
		Random rand = new Random();
		int coin = rand.nextInt();
		if (coin % 2 == 0)
			P.rintln("heads");
		else
			P.rintln("tails");
	}
}

//ex8): Using Long.toBinaryString to display the results. 
public class LongValues {
	public static void main(String[] args) {
		long n1 = 0xffff; // hexadecimal
		long n2 = 077777; // octal
		print("long n1 in hex = " + Long.toBinaryString(n1));
		print("long n2 in oct = " + Long.toBinaryString(n2));
	}
};

//ex9): Display the largest and smallest numbers for both float and double exponential notation.
public class MinMax {
	public static void main(String[] args) {
		double max = java.lang.Double.MAX_VALUE;
		System.out.println("Max double = " + max);
		double min = java.lang.Double.MIN_VALUE; 
		System.out.println("Min double = " + min);
		float maxf = java.lang.Float.MAX_VALUE;
		System.out.println("Max float = " + maxf);
		float minf = java.lang.Float.MIN_VALUE; 
		System.out.println("Min float = " + minf);	
	}
}

//ex10):  Write a program with two constant values, one with alternating binary ones and zeroes, with a zero in the least-significant digit, and the second, also
//alternating, with a one in the least-significant digit (hint: It's easiest to  use hexadecimal constants for this). Take these two values and combine them in
// all possible ways using the bitwise operators, and display the results using Integer.toBinaryString(). 


public class BinaryTest {
	public static void main(String[] args) {
		int i = 1 + 4 + 16 + 64;
		int j = 2 + 8 + 32 + 128;
		P.rintln("i = " + Integer.toBinaryString(i));
		P.rintln("j = " + Integer.toBinaryString(j));
		P.rintln("i & j = " + Integer.toBinaryString(i & j));
		P.rintln("i | j = " + Integer.toBinaryString(i | j));
		P.rintln("i ^ j = " + Integer.toBinaryString(i ^ j));
		P.rintln("~i = " + Integer.toBinaryString(~i));
		P.rintln("~j = " + Integer.toBinaryString(~j));
	}
}

/* ex11): Start with a number that has a binary one in the most significant position
* (hint: Use a hexadecimal constant). Using the signed right-shift operator,
* right shift it all the way through all of its binary positions each time
* displaying the result using Integer.toBinaryString().
*/ 

public class RightShiftTest {
	public static void main(String [] args) {
		int h = 0x10000000;
		P.rintln(Integer.toBinaryString(h));
		for(int i = 0; i < 28; i++) {
			h >>>= 1;
			P.rintln(Integer.toBinaryString(h));
		}
	}
}

/* ex12):  Start with a number that is all binary ones. Left shift it, then use the
* unsigned right-shift operator to right shift through all of its binary
* positions, each time displaying the result using Integer.toBinarySting().
*/ 

public class RightShiftTest2 {
	public static void main(String [] args) {
		int h = -1;
		P.rintln(Integer.toBinaryString(h));
		h <<= 10;
		P.rintln(Integer.toBinaryString(h));
		for(int i = 0; i < 32; i++) {
			h >>>= 1;
			P.rintln(Integer.toBinaryString(h));
		}
	}
}