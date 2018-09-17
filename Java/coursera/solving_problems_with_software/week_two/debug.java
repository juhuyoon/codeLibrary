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


// Let’s test some more. Run the above code with input
// “abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj”. What is the output?

//result: bcd, bca
//bcd, bca, bca

// You will have to do some debugging, since the output wasn’t what you were
// expecting. Let’s see which occurrences of “abc” the program is finding. Add a
// line to print the index before found is calculated.

//Result: 0, 30

// You can see that the program is finding the first two occurrences of “abc”
// but not the third. The while loop is breaking without finding this
// occurrence. So we know that when the variable index is updated after finding
// the second occurrence of “abc” at index 30, it must be updated either to -1
// or to something greater than or equal to the length of input – 3. Let’s see
// which it is.

System.out.println("index " + index);
//code
System.out.println("index after updating " + index);

//What is the value of index after updating for the last time?
//result: -1


//Now we can tell that the code isn’t finding the last occurrence of “abc” even though we can see that a third occurrence exists. At what index should the third occurrence of “abc” be found?
//result: 33


// After the program finds the 2nd occurrence of “abc”, at what index does it start searching for the 3rd occurrence?
//Hint:look at the line index=input.indexOf("abc",index+4);
//Look back at the indices you printed in question 3 to see what index is before searching for the 3rd occurrence. Think about what index is updated to at the line index = input.indexOf("abc", index+4)



//What are some other examples of input that would also have this problem? Select all that are correct.
//Result: “kdabcabcjei” , “abcabcabcabca”

//Imagine your friend wants to get help from Coursera classmates on the discussion forums. Which of the following would be the most helpful way to describe the problem so that others can easily help?


//What is causing this bug?
// When one occurrence of “abc” is followed immediately by another occurrence of “abc”, the method does not find the second “abc” because it starts searching at the “b” rather than at the “a” following the first “abc”



//Which change needs to be made to fix the bug?
index = input.indexOf("abc",index+4); 
//to 
index = input.indexOf("abc",index+3);

//Make the change. Test your method on the input options that would have caused the bug (see question 7). What is the output when you run it with input “abcabcabcabca”?