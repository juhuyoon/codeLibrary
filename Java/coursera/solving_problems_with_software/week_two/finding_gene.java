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
    
}