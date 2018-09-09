//documentation from docs.oracle.com is good!
//http://www.dukelearntoprogram.com/course2/data/manylinks.html
//Using string to store readable data
//Practice making tables to find patterns in your algorithms. 
//Finding patterns and information via strings for the data

//e.g. Searching for genes with strings representing DNA
    //ATG = start codon
    //TAA = stop codon
    //Everything in between the codons are the DNA so...

    //1) Find a gene, Create a string  
    //2) Start looking after "ATG" until you find "TAA" (always look for both start and stop codons)
        //How do we find ATG in a string and how do we represent its position
            // Give each letter a positioning number in the index, starting at 0 [index]
    //3) Then take all the letters in between. (Note that it may not always be a string)
        //How do we get all the letters in a range?
            //Between two indices, using a built-in method in the String class

           
    String s = "dukeprogramming" ; //String literals in quotes
    String x = s.substring(4,7); //counts down, substring index starts at 4(inclusive), ends at 7(exclusive)
    String z = s.length() //counts the # of characters in the String
    String a = s.indexOf("program") Result = 4; //Find one string within another, return the starting index, starting with where "program" is. 
    String b = s.indexOf("g") //Result = 7    
    String f = s.indexOf('f') //If the letter does not exist, it will return -1
    String c = s.indexOf("g", 8) //can give another parameter where to start searching, so it would return value 14
    String y = s.startsWith("duke") //true
    String q = s.endsWith("king") //false

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class FindGeneSimpleandTest {
    public String findGeneSimple(String dna) {
        //start codon is "ATG"
        //stop codon is "TAA"
        String result = "" ;
        int startIndex = dna.indexOf("ATG"); //returns location of where it starts
        if(startIndex == -1) //no ATG {
            return "";
        };
        int stopIndex = dna.indexOf("TAA", startIndex+3); //returns location of where it ends
        if(stopIndex == -1) {
           // No TAA
           return ""; 
        }

        result = dna.substring(startIndex, stopIndex+3);
        
        return result;
    }
    
    public void testFindGeneSimple() {
        String dna = "AATGCGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        String gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);

        dna = "AATGCTAGGGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);
        
        dna = "TTATAA";
        //dna = "ATGTAA";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);
    }
}

//Can use 'mod' to find multiples of 3s and other math operators
(a-b) % 3 == 0 

//Two Different types of numbers
    //int represents integers = -2, -1, 0, 1, 2
    //double represents real numbers like floating points = 1.2, 3.4
    //Arithmetic integers always yields an integer so 5/2 = 2
                                                    //100 / 3 * 4 = 132
    
//Orders of Operations (precedence & associativity)