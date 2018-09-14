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

//Searching for many genes
    //use the power of looping in using iterables to access data and information
            //Use these techniques to find all genes in DNA
            //Algorithms for finding one gene and repeat
                //How many is enough for general cases to check for Start and Stop codons?
                    //Cannot pick any particular number
                    //Need algorithm to repeat checks
    //Storing immediate results
    //Lets you process results
            //Lets you filter results
            //Iterable you add to with code
                //Repetition will turn into loops
                    //Figure out WHAT to loop over
                        //Using both For and While loops;
    //While Loops
        //complements of for loop with iterables

    //StorageResource 
        //adding values, counting them, filtering them, preview of using arrays
    //Short-circuited boolean evaluation
        //Helps in developing good coding practices [architectures]

//New Generalization:
        //1) Find first occurrence of "ATG" and call its index startIndex
        //2) Find the "TAA" starting from (startIndex + 3), call this result currIndex;

            //Can make this repetitive! As long as...
                //3) Check if(currIndex - startIndex) is a multiple of 3
                //4) If not, update currIndex to the index of the next "TAA", starting from (currIndex + 1)
                //5) Check if (currIndex - startIndex) is a multiple of 3
                //6) If so, text between startIndex and currIndex + 3 is the answer

            //Repetition ends when you stop finding TAAs or the gene is longer running/going. 

            while (x < y) { //Generally for (as long as [condition])
                System.out.println(x);
                x += 3;
            }   //evaluates expression, must return a boolean value. 
                //returns back to the top until x is no longer less than y, and stops. 

            class WhileDemo {
                public static void main(String[] args){
                    int count = 1;
                    while (count < 11) {
                        System.out.println("Count is: " + count);
                        count++;
                    }
                }
            };

        
//What if there are three different stop codons of "TAA", "TGA", "TAG"
//Try spliting the problem up into three parts:
             //1) Find first occurrence of "ATG" and call its index startIndex
                //2) If startIndex is -1, then your answer is the empty string. 
                //3) findStopCodon (dnaStr, startIndex, "TAA") and call the result taaIndex
                //4) findStopCodon (dnaStr, startIndex, "TAG") and call the result tagIndex
                //5) findStopCodon (dnaStr, startIndex, "TGA") and call the result tgaIndex
                //6) Take the smallest of taaIndex, tgaIndex, and tagIndex: call it minIndex
                //7) Answer is text from startIndex to minIndex + 3, no longer always be TAA
                
//Split this into its own:
findStopCodon(str, startIndex, codon)
        //2) Find the stopCodon starting from (startIndex + 3), call this result currIndex;
            //As long as currIndex is not equal to -1
                //3) Check if(currIndex - startIndex) is a multiple of 3
                //4) If so, currIndex is the answer
                //5) If not, update currIndex to the index of the next stopCodon, starting from (currIndex + 1)
                //6) If so, answer is dnrStr.length()
                                    //If no valid answer, then return to -1, but if we use -1, we need to check specially rather than just ask for the minimum. 


//Logical And/Or
             //1) Find first occurrence of "ATG" and call its index startIndex
                //2) If startIndex is -1, then your answer is the empty string. 
                //3) findStopCodon (dnaStr, startIndex, "TAA") and call the result taaIndex
                //4) findStopCodon (dnaStr, startIndex, "TAG") and call the result tagIndex
                //5) findStopCodon (dnaStr, startIndex, "TGA") and call the result tgaIndex

                //6) Take the smallest of taaIndex, tgaIndex, and tagIndex: call it minIndex
                    //Manipulating step 6 so that we find stopCodon return at -1 when there's no valid stopCodon
                    //Picking Minimum that is not -1 as well, done via step by step comparisons.
                    //if taaIndex is -1 OR (tgaIndex is not -1 AND tgaIndex < taaIndex), then pick tgaIndex
                //9) Check if minindex is =1 OR (tagIndex is not -1 AND tagIndex < minIndex)
                    //10) If so, st minIndex to tagIndex
                //11) If minIndex is -1, your answer is the empty string
                //12) your answer is the text from startIndex to minIndex + 3
                
//Special Rules: "Short circuit evaluation" if Java can figure out the answer from one operand, it does not evaluate the other. 
//Express AND with&&
            if(x < y && y < z )  {...}
//Express OR with ||
            if(a > b || c < d)  {...}
                //Check if taaIndex is =1 OR (tgaIndex is not =1 AND tgaIndex < taaIndex)
                //if(taaIndex == -1 || tgaIndex != -1 && tgaIndex < taaIndex)

                //EG: When x has value 5 and y has value 6
                if ( (x%2 == 0 || y%2 == 0) && x>3 ){
                    System.out.println("condition was true")
                  }


//Finding Multiple Genes
    //Printing them out in one line
    //Since you can already find a gene...
                  //Might adjust slightly to take a starting position
                  //Loops are familiar now so.... (use a while loop?)
                  //Must determine when the loop ends using break

//1) Set startIndex to 0
//2) As long as there are more genes after startIndex, repeat the following steps
    //3) Find the next gene after startIndex
    //3.5) If no gene was found, leave the loop
    while (true && gene.isEmpty()) {
        ... 
        break;
    }
    //4) Print that gene out
    //5) Set startIndex to just past the end of the gene