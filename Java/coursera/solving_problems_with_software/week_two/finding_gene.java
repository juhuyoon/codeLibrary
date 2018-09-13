import jdk.nashorn.api.scripting.URLReader;

// 1. Create a new Java project named StringsFirstAssignments. You can put all the classes for this programming exercise in this project.

// 2. Create a new Java Class named Part1. The following methods go in this class.

// 3. . Write the method findSimpleGene that has one String parameter dna, representing a string of DNA. This method does the following:

// Finds the index position of the start codon “ATG”. If there is no “ATG”, return the empty string.
// Finds the index position of the first stop codon “TAA” appearing after the “ATG” that was found. If there is no such “TAA”, return the empty string.
// If the length of the substring between the “ATG” and “TAA” is a multiple of 3, then return the substring that starts with that “ATG” and ends with that “TAA”.
// 4. Write the void method testSimpleGene that has no parameters. You should create five DNA strings. The strings should have specific test cases, such as: DNA with no “ATG”, DNA with no “TAA”, DNA with no “ATG” or “TAA”, DNA with ATG, TAA and the substring between them is a multiple of 3 (a gene), and DNA with ATG, TAA and the substring between them is not a multiple of 3. For each DNA string you should:

// Print the DNA string.
// See if there is a gene by calling findSimpleGene with this string as the parameter. If a gene exists following our algorithm above, then print the gene, otherwise print the empty string.


public class Part1 {
    public String findSimpleGene(String dna) {
        int start = dna.indexOf("ATG");
        if (start == -1) {
            return "";
        }
        int stop = dna.indexOf("TAA", start);
        if (stop == -1) {
            return "";
        }
        if ((stop - start) % 3 == 0) {
            return dna.substring(start, stop + 3);
        } else {
            return "";
        }
    }

public void testSimpleGene() {
        String a = "AAATGCCCTAACTAGATTAAGAAACC";
        String ap = "CCAATGCAGCGATAC";
        String apa = "CTAATCCGGATCCGA";
        String app = "CCAGCATGCCAGTCAGCTAACAG";
        String appa = "CCAGCATGCCAGTAGCTAACAG";

        System.out.println("The string is: " + a + ". The Gene is: " + findSimpleGene(a));
        System.out.println("The string is: " + ap + ". The Gene is: " + findSimpleGene(ap));
        System.out.println("The string is: " + apa + ". The Gene is: " + findSimpleGene(apa));
        System.out.println("The string is: " + app + ". The Gene is: " + findSimpleGene(app));
        System.out.println("The string is: " + appa + ". The Gene is: " + findSimpleGene(appa));
    }

    public static void main (String[] args) {
        Part1 gene = new Part1();
        gene.testSimpleGene();
    }
}


// Part 2: Finding a Gene - Using the Simplified Algorithm Reorganized
    //determine if a DNA strand has a gene in it by using the simplified algorithm from the lesson. 
    //Specifically, you should do the following:

// 1. Create a new Java Class named Part2 in the StringsFirstAssignments project.

// 2. Copy and paste the two methods findSimpleGene and testSimpleGene from the Part1 class into the Part2 class.

// 3. The method findSimpleGene has one parameter for the DNA string named dna. Modify findSimpleGene to add two additional parameters, one named startCodon for the start codon and one named stopCodon for the stop codon. What additional changes do you need to make for the program to compile? After making all changes, run your program to check that you get the same output as before.

// 4. Modify the findSimpleGene method to work with DNA strings that are either all uppercase letters such as “ATGGGTTAAGTC” or all lowercase letters such as “gatgctataat”. Calling findSimpleGene with “ATGGGTTAAGTC” should return the answer with uppercase letters, the gene “ATGGGTTAA”, and calling findSimpleGene with “gatgctataat” should return the answer with lowercase letters, the gene “atgctataa”. HINT: there are two string methods toUpperCase() and toLowerCase(). If dna is the string “ATGTAA” then dna.toLowerCase() results in the string “atgtaa”.

public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        String result = "";
        if(Character.isUpperCase(dna.charAt(0))) {
            startCodon = startCodon.toUpperCase();
            stopCodon = stopCodon.toLowerCase();
        } else {
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        }
        int start = dna.indexOf(startCodon);
        if (start == -1) {
            return "";
        }
        int stop = dna.indexOf(stopCodon, start);
        if (stop == -1) {
            return "";
        }
        if ((stop - start) % 3 == 0) {
            return dna.substring(start, stop + 3);
        } else {
            return "";
        }
    }

    public void testSimpleGene() {
        String a = "AAATGCCCTAACTAGATTAAGAAACC";
        String ap = "CCAATGCAGCGATAC";
        String apa = "CTAATCCGGATCCGA";
        String app = "CCAGCATGCCAGTCAGCTAACAG";
        String appa = "CCAGCATGCCAGTAGCTAACAG";

        System.out.println("The string is: " + a + ". The Gene is: " + findSimpleGene(a, "ATG", "TAA"));
        System.out.println("The string is: " + ap + ". The Gene is: " + findSimpleGene(ap, "ATG", "TAA"));
        System.out.println("The string is: " + apa + ". The Gene is: " + findSimpleGene(apa, "ATG", "TAA"));
        System.out.println("The string is: " + app + ". The Gene is: " + findSimpleGene(app, "ATG", "TAA"));
        System.out.println("The string is: " + appa + ". The Gene is: " + findSimpleGene(appa, "ATG", "TAA"));
    }

    public static void main(String[] args) {
        Part2 gene = new Part2();
        gene.testSimpleGene();
    }
}

// Part 3: Problem Solving with Strings
// This assignment will give you additional practice using String methods. You will write two methods to solve some problems using strings and a third method to test these two methods.

// Specifically, you should do the following:

// 1. Create a new Java Class named Part3 in the StringsFirstAssignments project. Put the following methods in this class.

// 2. Write the method named twoOccurrences that has two String parameters named stringa and stringb. This method returns true if stringa appears at least twice in stringb, otherwise it returns false. For example, the call twoOccurrences(“by”, “A story by Abby Long”) returns true as there are two occurrences of “by”, the call twoOccurrences(“a”, “banana”) returns true as there are three occurrences of “a” so “a” occurs at least twice, and the call twoOccurrences(“atg”, “ctgtatgta”) returns false as there is only one occurence of “atg”.

// 3. Write the void method named testing that has no parameters. This method should call twoOccurrences on several pairs of strings and print the strings and the result of calling twoOccurrences (true or false) for each pair. Be sure to test examples that should result in true and examples that should result in false.

// 4. Write the method named lastPart that has two String parameters named stringa and stringb. This method finds the first occurrence of stringa in stringb, and returns the part of stringb that follows stringa. If stringa does not occur in stringb, then return stringb. For example, the call lastPart(“an”, “banana”) returns the string “ana”, the part of the string after the first “an”. The call lastPart(“zoo”, “forest”) returns the string “forest” since “zoo” does not appear in that word.

// 5. Add code to the method testing to call the method lastPart with several pairs of strings. For each call print the strings passed in and the result. For example, the output for the two calls above might be:

// The part of the string after an in banana is ana.
// The part of the string after zoo in forest is forest.

public class Part3 {
    public boolean twoOccurrences(String stringa, String stringb) {
        int index1 = stringb.indexOf(stringa);
        if(index1 != -1) {
            int index2 = stringb.indexOf(stringa, index1+1);
            if(index2 != -1) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }
    public void testing() {
        System.out.println(twoOccurrences("by", "A story by Abby Long"));
        System.out.println(twoOccurrences("a", "banana"));
        System.out.println(twoOccurrences("aatg", "ctgtatgta"));
        System.out.println(twoOccurrences("an", "banana"));
        System.out.println(twoOccurrences("zoo", "forest"));
        System.out.println(twoOccurrences("zoo", "farzookeeper"));
    }

    public String lastPart(String stringa, String stringb) {
        if(stringb.indexOf(stringa) != -1) {
            int index = stringb.indexOf(stringa);
            return stringb.substring(index+stringa.length(), stringb.length());
        } else {
            return stringb;
        }
    }

    public static void main() {
        Part3 howMany = new Part3();
        howMany.testing();
    }
}

// //Part 4: Finding Web Links
// Write a program that reads the lines from the file at this URL location, http://www.dukelearntoprogram.com/course2/data/manylinks.html, and prints each URL on the page that is a link to youtube.com. Assume that a link to youtube.com has no spaces in it and would be in the format (where [stuff] represents characters that are not verbatim): “http:[stuff]youtube.com[stuff]”

// Here are suggestions to get started.

// 1. Create a new Java Class named Part4 in the StringsFirstAssignments project and put your code in that class.

// 2. Use URLResource to read the file at http://www.dukelearntoprogram.com/course2/data/manylinks.html word by word.

// 3. For each word, check to see if “youtube.com” is in it. If it is, find the double quote to the left and right of the occurrence of “youtube.com” to identify the beginning and end of the URL. Note, the double quotation mark is a special character in Java. To look for a double quote, look for (\”), since the backslash (\) character indicates we want the literal quotation marks (“) and not the Java character. The string you search for would be written “\”” for one double quotation mark.

// 4. In addition to the String method indexOf(x, num), you might want to consider using the String method lastIndexOf(s, num) that can be used with two parameters s and num. The parameter s is the string or character to look for, and num is the last position in the string to look for it. This method returns the last match from the start of the string up to the num position, so it is a good option for finding the opening quotation mark of a string searching backward from “youtube.com.” More information on String methods can be found in the Java documentation for Strings: http://docs.oracle.com/javase/7/docs/api/java/lang/String.html.

public class Part4{
    public void printUrls(String url) {
    URLResource myurl = new URLResource(url);
    for(String word : myurl.words()) {
        if(word.toLowerCase().indexOf("youtube.com") != -1) {
            int quoteIndex = word.indexOf("\"");
            int lastQuoteIndex = word.indexOf("\"", quoteIndex+1);
            System.out.println(word.substring(quoteIndex+1, lastQuoteIndex));
        }
    }
}
    public void testUrl() {
        printUrls("https://www.dukelearntoprogram.com/course2/data/manylinks.html");
    }

    public static void main() {
        Part4 url = new Part4();
        url.testUrl();
    }

}

//Using While Loops to search more efficiently
public class FindGeneWhile{
    public Strinb findGene(String dna) {
        //Find first occurrence of "ATG" call its index 'startIndex'
        int startIndex = dna.indexOf("ATG");
        //Find the "TAA" starting from (startIndex+3), call this result currIndex
        int currIndex = dna.indexOf("TAA", startIndex + 3);
        //As long as currIndex is not equal to -1
        while(currIndex != -1) {
            //Check if (currindex - startIndex) is a multiple of 3
            if((currIndex - startIndex) % 3 == 0) {
                //If so, the text between startIndex and currIndex
                return dna.substring(startIndex, currIndex + 3);
            } else {
                currIndex = dna.indexOf("TAA", currIndex + 1);
                //If not, update currIndex to the index
            }
        }
        //Your answer is the empty string
        return "";
    }
}

//now trying to look for 3 stop codons
    public class AllCodons {
        public int findStopCodon(String dnaStr, int startIndex, string stopCodon) {
            // 2) Find the stopCodon starting from (startIndex + 3), call this result
                    // currIndex;
                    int currIndex = dnaStr.indexOf(stopCodon, startIndex+3);
        // As long as currIndex is not equal to -1
                    while(currIndex != -1) {       
        // 3) Check if(currIndex - startIndex) is a multiple of 3
                        int diff = currIndex - startIndex;
        // 4) If so, currIndex is the answer
                        if(diff % 3 == 0 ) {
                            return currIndex;
                        }
        // 5) If not, update currIndex to the index of the next stopCodon, starting from
                        else { currIndex = dnaStr.indexOf(stopCodon, currIndex +1)
        // (currIndex + 1)
                         }
                }  // 6) If so, answer is dnrStr.length()
        return dnaStr.length();
        }

        public String findGene(String dna) {
            // 1) Find first occurrence of "ATG" and call its index startIndex
            // 2) If startIndex is -1, then your answer is the empty string.
            // 3) findStopCodon (dnaStr, startIndex, "TAA") and call the result taaIndex
            // 4) findStopCodon (dnaStr, startIndex, "TAG") and call the result tagIndex
            // 5) findStopCodon (dnaStr, startIndex, "TGA") and call the result tgaIndex
            // 6) Take the smallest of taaIndex, tgaIndex, and tagIndex: call it minIndex
            return "";
        }
    }

        public void testFindStop() {
            String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxx";
            int dex = findStopCodon(dnaStr, 0, "TAA");
            if(dex != 9) System.out.println("error on 9");
            dex = findStopCodon(dna, 9, "TAA");
            if(dex != 21) System.out.println("error on 21");
            dex = findStopCodon(dna, 1, "TAA");
            if (dex != 26) System.out.println("error on 26");
            dex = findStopCodon(dna, 0, "TAG");
            System.out.println("tests finished");
        }

        