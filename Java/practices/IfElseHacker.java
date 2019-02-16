import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IfElseHacker {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        String ans = "";
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2 == 1 || ((N%2 == 0) && (N >=6 && N <= 20))){
            ans = "Weird";
        } else {
            ans = "Not Weird";
        }
        System.out.println(ans);
        scanner.close();
    }
}

