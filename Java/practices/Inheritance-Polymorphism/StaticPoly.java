/* Static PolyMorphism */
/* Polymorphism that is resolved during compiler time, example - method overloading */
/* Method Overloading: Allows us to have more than one methods with same name in a class that differs in signature*/

class DisplayOverLoading {
    public void disp(char c) {
        System.out.println(c);
    }
    public void disp(char c, int num) {
        System.out.println(c + " " + num);
    }
}

public class StaticPoly {
    public static void main(String args[]){
        DisplayOverLoading obj = new DisplayOverLoading();
        obj.disp('a');
        obj.disp('a', 10);
    }
}