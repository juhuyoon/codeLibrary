package com.juhuyoon;
import java.util.StringTokenizer;
//Put some String pieces back together
public class Main {

    public static void main(String[] args) {
        String s1 = "Hello" + ", " + "World";
        System.out.println(s1);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hello");
        sb2.append(",");
        sb2.append(" ");
        sb2.append("World");

        //Get the StringBuilder's value as a String, and print it.
//        String s2 = sb2.toString();
        System.out.println(sb2);

        String SAMPLE_STRING = "Didi TT Lala Lulu CoCo Momo ChuChu";

        //Converting a list of items into a comma-separated list.
        StringBuilder sb1 = new StringBuilder();
        for(String word : SAMPLE_STRING.split(" ")) {
            if(sb1.length() > 0) {
                sb1.append(", ");
            }
            sb1.append(word);
        }
        System.out.println(sb1);

        //Applying the same principle via the StringTokenizer
        StringTokenizer st1 = new StringTokenizer(SAMPLE_STRING);
        StringBuilder sb3 = new StringBuilder();
        while(st1.hasMoreElements()) {
            sb3.append(st1.nextToken());
            if(st1.hasMoreElements()) {
                sb3.append(", ");
            }
        }

        System.out.println(sb3);
    }
}
