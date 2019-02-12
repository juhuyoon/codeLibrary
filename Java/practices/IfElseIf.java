public class IfElseIf {
    public static void main(String args[]) {
        int num=1234;
        if(num < 100 && num >=1) {
            System.out.println("It is a two digit number");
        } 
        else if ( num < 1000 && num >= 100) {
            System.out.println("It is a three digit number");
        }
        else if ( num < 10000 && num >= 1000 ) {
            System.out.println("It is a four digit number");
        } 
        else {
            System.out.println("Number not between 1 & 99999");
        }
    }
}