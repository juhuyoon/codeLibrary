//How to run programs without BlueJ
    //Using main:
    public static void main(String[] args) 
    //Main must be public as it must be called by the code
    //Static means that the message does not live inside each particular instance of the class, but rather, there's just one of it for the class as a whole. 
    //void = return type of main
    //main = method name
    //parameter = String[] args, this parameter represents the command line arguments to the program. 

    public class HelloWorld {
        public static void main(String[] args) {
            if(args.length == 0) {
                System.out.rpintln("Please specify the filename");
                System.exit(1); //only use when you want the program to quit completely. 
            }
            FileResource hello = new FileResource(args[0]);
            for(Strign line: hello.lines()) {
                    System.out.println(line);
            }
        }
    }

    //Static:
        //Means that the method belongs to the class in general, but NOT any particular instance. 
        //Non-static instances:
        class BankAccount {
            int acctNum;
            double balance;
            int nextAcctNum;
        } //Using this as a non-static, for each instance, (each different bank account) has its own account number and its own balance. 
            //Since these fields are not static, they exist in each instance.

        //If you want to keep track of nextAcctNum to assign...

    BankAccount() { //constructor
        int acctNum = nextAcctNum;
        nextAcctNum++;
    }
    //Uses this next account number to initialize the account number of the bank account being constructred, then increments the next account number. 
    //Will then start at 0 values then increment upwards, but if there is a second bank account, there will be a problem. 
    //The newly created bank account object has its own copy of each field, so that when you execute the first line of the constructor, it uses the object's next account number to initialize this object's account number. So, they both can have the same account number. 

    //Static is done to 
    class BankAccount {
        int acctNum;
        double balance;
        static int nextAcctNum;
    }
    BankAccount.nextAcctNum;
    //BankAccount's nextAcctNum: 103 


    //When something does not belong IN EACH OBJECT of a particular type, but rather is shared by all objects of that type. 
    //The nextAcctNum data is not stored in each bank account, but rather there is one copy that is shared by all of them. 

    //Static Fields:
        //one shared by all instances
        //not as common as instance variables
        //static methods:
            //not inside any particular instance
            //can access static fields and call static methods
            //cannot access instance variables or call regular methods 
                //need to specify what objects to use. 

    edu.duke.*;
        //contains FileResource
        //contains URLResource

    //What if you don't have it?
        //one: download it as it's open source
        //two: Java's IO libraries. 
    
    //Exceptions: what are they?
        //Ways to keep track of errors and crashes that went wrong.

        //Stack trace : When your program has an unhandled exception and your program does not know how to deal with it, it prints a stack trace. 
        //When a program is unable to complete a process, this is known as an exception. 

        //MalformedURLException: when the URL is some string that is not accepted.
    
    //How to handle Exceptions: Try/Catch
        try {
            URL myURL = new URL(someString);
            //code that uses myURL
            //e.g. connects to it and reads the data
        } catch (MalformedURLException mfe) {
            //code to handle the error
        }

    //Declaring Exceptions:
        //When you don't know how to handle the exception:
        public void myMethod(String urlName)
            [throws malformedURLExeption] {
                URL myURL = new URL(someString);
                //cdoe that uses myURL
                //e.g., connects to it and reads data
            } //When you do not handle the exception, it will propagate to the caller automatically. 

    //Any class can extend to Throwable
            //a class that extends Exceptions (Exceptions extends Throwables)

    //Java has many built-in exceptions
            //up to 57..
            //If you write a program where you need exceptions beyond the built in ones, you can always write you rown by writing you rown class and making it extended appropriate existing exception types.

    //IN the java.nio.package, the following classes use static methods to get/create resources:
            //Files & Paths
