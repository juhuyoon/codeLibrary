public class RelationalOperatorDemo {
    public static void main(String args[]) {
       int num1 = 10;
       int num2 = 50;
       if (num1==num2) {
      System.out.println("num1 and num2 are equal");
       }
       else{
      System.out.println("num1 and num2 are not equal");
       }
 
       if( num1 != num2 ){
      System.out.println("num1 and num2 are not equal");
       }
       else{
      System.out.println("num1 and num2 are equal");
       }
 
       if( num1 > num2 ){
      System.out.println("num1 is greater than num2");
       }
       else{
      System.out.println("num1 is not greater than num2");
       }
 
       if( num1 >= num2 ){
      System.out.println("num1 is greater than or equal to num2");
       }
       else{
      System.out.println("num1 is less than num2");
       }
 
       if( num1 < num2 ){
      System.out.println("num1 is less than num2");
       }
       else{
      System.out.println("num1 is not less than num2");
       }
 
       if( num1 <= num2){
      System.out.println("num1 is less than or equal to num2");
       }
       else{
      System.out.println("num1 is greater than num2");
       }
    }
 }