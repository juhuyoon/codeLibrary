//Suppose you have written a Java program that has one class and one method.
//Which one of the following best describes what you need to do in order to run the program?

//answer: Compile the program, create a new object for the class, and call the method.

// Which one of the following best describes what happens when one compiles a Java program in BlueJ on their computer?

//answer: The .java file is translated into a .class file that can be run on that computer.


//Consider the following Java statements: 
int a = 5;
int b = 3;
int c = 4;
c = a + b ;

//What is the value of c after these lines execute?
//Answer: 8

int a = 1 ;
int b = a + 2 ;
int c = b + b ;

//What is the value of c after these lines execute?
//Answer: 6

int a = 3 ;
int b = 4 + a / 2 ;
int c = b % 3 ;

//What is the values of c after these lines execute?
//Answer: 2

int func2(int w) {
  return w * 3;
}

int func1 (int a, int b) {
  int n = a + b;
  return 2 + func2(n);
}

int start() {
  int z = 4;
  return func1(z, 1) - 3;
}

//What is the return value of the call start()?
//Answer: 14

int g (int a) {
  if (a < 9) {
    return 9;
  }
  
  if (a < 7) {
    return 7;
  }
  
  if (a < 4) {
    return 4;
  }
  
  return 0;
}

//What is the value returned from the call g(5)?
//Answer: 9

int k (int a, int b) {
  if (a < b) {
    if (b > 4) {
      return 0 ;
    }
    else {
      return 1;
    }
  }
  else {
    if (a > 4) {
      return 2;
    }
    else {
      return 3;
    }
  }
}

//For which of the values a and b would 2 be the return value?
//Answer: a = 6, b = 6

//Consider the following method play, and assume appropriate import statements are there for classes used in this function.

public void play () {
  Frog fred = new Frog();
  Cat jiang = new Cat();
  fred.hop(4);
  jiang.jump(5, fred);
  String greet = "That is all";
  fred.say(greet, 3);
};

//Without seeing any details of classes used in this program and their methods, but assuming the methods shown are valid methods for these classes, which one of the following are methods in the Frog class?

//Answer: hop and say


public class Thing {
  
  private int a;
  
  public Thing(int x) {
    a = x;
  }
  
  public int geta() {
    return a;
  }
  
  public void print() {
    int b = 4;
    System.out.println(geta() + " " + b);
  }
}

//Which method is the constructor?
//Answer: Thing

public class Something {   
  
  public void run() {
    FileResource f = new FileResource("words.txt");
    for (String g : f.lines()) {
      System.out.println(g);
      System.out.println(g);
    }
  }
}

//Suppose the file words.txt contains the following lines:
//cat giraffe, bird, zebra
//How many times is the loop executed?

//Answer: 3

// Consider the following code segment that uses the edu.duke FileResource
// class. The method .length() calculates how many characters are inside a
// string. For example, for the string "puppy", .length() would calculate a
// value of 5. We will learn more about strings later in this course.
    FileResource f = new FileResource("words.txt");for(
    String g:f.lines())
    {
  
  if (g.length() > 5) {
    System.out.println(g);
  }
}

//Suppose the file words.txt contains the following lines:
//cat, elephant, monkey, tiger, lion
//Which of the following would be the output from the code segment?

//Answer: elephant, monkey

//Consider the following Java code segment:
int m = 7 ;
int n = 9 ;
double d = 4.5 ;
double f = 8.974 ;   
//Which one of the following arithmetic expressions would need a cast for the addition to work? 

//Answer: int y = n + f;


// Consider the Thing class shown below.

public class Thing {
  
  private int a;
  
  public Thing(int x) {
    a = x;
  }
  
  public int geta() {
    return a ;
  }
  
  public void combine (Thing y) {
    a = a + y.geta();
  }
}

// And consider the following code segment that uses the Thing class.
Thing f = new Thing(6);
Thing g = new Thing(8);
f.combine(g);
System.out.println(f.geta());
System.out.println(g.geta());

//What is printed when this code is executed?

//Answer: 14, 8