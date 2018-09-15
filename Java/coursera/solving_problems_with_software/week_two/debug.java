//  Write a method that finds each occurrence of “abc_” in a String 
//  input (where _ is a single character) and prints “bc_” for each 
//  such occurrence. For example, findAbc(“abcdefabcghi”) should print:
//  
//  bcd
// bcg

public class Debugging_1 {
    public void findAbc(String input) {
        int index = input.indexOf("abc");
        while (true) {
            if (index == -1) {
                break;
            }
            //if (index >= input.length() - 3) {
            //    break;
            //}
            System.out.println("index+1: " + (index+1));
            System.out.println("index+4: " + (index+4));
            // NOTE: Make sure that the print command is not concatenating 
            // "index" + "4" by grouping the value (index+4) 
            String found = input.substring(index+1, index+4);
            System.out.println(found);
            index = input.indexOf("abc", index+4);
        }
    }
       public void test() {
         //findAbc("abcd");  // prints "bcd"
         //findAbc("woiehabchi");  // prints "bch"
         //findAbc("abcdabc"); //prints 
         findAbc("abcbbbabcdddabc");  // throws a StringIndexOutOfBoundsException 
         // this error can be fixed by adding the commented out if statement in findAbc 
    }
}

//Compile and run your code. Which two of the following are results?
//result: A StringIndexOutOfBoundsException is thrown, "bcd" is printed.

//Which line of the program is causing the error?
// result: 
String found = input.substring(index+1, index+4);

//What is the index that is out of range?
//Result: 8

//What is the length of input for this method call?
//Result: 7

//At the time this error is produced, what are the values of index+1 and index+4? You may want to add print statements to your code and run it again to see what these values are.
//Result: 5,8

//Why does the program throw an index out of bounds exception for this input?
//Result: The method substring() is trying to access index 8 but the String input is only 7 characters long.

//result: The method substring() is trying to access index 8 but the String input is only 7 characters long.

//Which of the following are examples of input that would also throw this exception? Check all that are correct.
//result: "aaaaabc", "abcbbbabcdddabc", "yabcyabc"

//Add an if statement, such that the while loop breaks if the index is out of bounds. Compile the code and run it again. It should now print "bcd" without throwing an exception. Try it on the examples you selected the previous question to make sure it works.
//result: index >= input.length() - 3, index > input.length() - 4


///////////////////////////////////////////////////
// Your friend is trying to solve the following problem using Java:
//   
//   Write a method that finds each occurrence of “abc_” in a String 
//   input (where _ is a single character) and prints “bc_” for each 
//   such occurrence. For example, findAbc(“abcdefabcghi”) should print:
//   
//   bcd
//   bcg

public class Debugging_2 {
    public void findAbc(String input) {
        int index = input.indexOf("abc");
        while (true) {
            if (index == -1) {
                break;
            }
            if (index >= input.length() - 3) {
                break;
            }
            System.out.println("index+1: " + (index+1));
            System.out.println("index+4: " + (index+4));
            String found = input.substring(index+1, index+4);
            System.out.println("index before updating: " + index);
            System.out.println(found);
            index = input.indexOf("abc", index+4);
            //Switching to the below line will fix the error
            //index = input.indexOf("abc",index+3);
            System.out.println("index after updating: " + index);
        }
    }
       public void test() {
         //findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");  // error 
         //findAbc("qwertyabcuioabcp");  // no error
         findAbc("abcabcabcabca");  // error
         /* When one occurrence of “abc” is followed immediately by another occurrence of “abc”, 
          * the method does not find the second “abc” because it starts searching at the “b” rather 
          * than at the “a” following the first “abc”
          */
    }
}