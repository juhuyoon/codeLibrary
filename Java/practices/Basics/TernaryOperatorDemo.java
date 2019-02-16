public class TernaryOperatorDemo{
    
    public static void main(String args[]) {
        int num1, num2;

        num1 = 25;
        /* num1 is not equal to 10, so the second value after colon is assigned 
         * to the variable num2 
         */

         num2 = (num1 == 10) ? 100 : 200;
         System.out.println( "num2: " + num2);

         num2 = (num2 = 25) ? 100: 200;
         System.out.println("num2: " + num2);
    }
}

 
 /* 
 If the expression results true then the first value before the colon (:) is assigned to the variable num1 else the second value is assigned to the num1.
 */

 /* Operator Precedence in Java 
  * This determines which operator needs to be evaluated first: 
  * Unary Operators
  * Multiplicative
  * Additive
  * Shift
  * Relationalo
  * Equality
  * Bitwise AND
  * Bitwise XOR
  * Bitwise OR
  * Logical AND
  * Logical OR
  * Ternary
  * Assignment 
 */