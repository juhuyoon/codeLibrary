public class ConstructorEx {
    /* 
      Constructors look like a method but is not a method.
      Name is same as class name and it does NOT return any value. 
      MyClass obj = new MyClass();
    */
    int age;
    String name;

    //Default Constructor
    ConstructorEx() {
        this.name="Jung";
        this.age=25;
    }

    ConstructorEx(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public static void main(String args[]) {
        ConstructorEx obj1 = new ConstructorEx();
        ConstructorEx obj2 = 
                        new ConstructorEx("Steve", 56);
        System.out.println(obj1.name + " " + obj1.age);
        System.out.println(obj2.name + " " + obj2.age);
    }
}