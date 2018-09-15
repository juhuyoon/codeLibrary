// 1) Consider the assignment that goes with this lesson and its algorithm for finding a gene with stop codon TAA.
// Consider the following DNA string.
// “AAATGCCCTAACTAGATTAAGAAACC”
// Which one of the following is the gene returned using that algorithm?\

//result: "ATGCCCTAA"

// 2) Which one of the following replaces the String variable dna with the lowercase version of this string?
//result: 
dna=dna.toLowerCase();
// 3) After adding two additional parameters to findSimpleGene for the startCodon and stopCodon, which of the following is another change that must be made for the program to compile?
//Two arguments must be added to the call to findSimpleGene.

// 4) Suppose that stringa is in stringb at position pos. Which one of the following returns the part of stringb that comes after stringa in the method lastPart?

//result: 
return stringb.substring(pos+stringa.length());

// 5) In the method twoOccurrences, suppose pos is the value of the first occurrence of stringa when stringa is found. Which of the following lines of code assigns pos2 to the second occurrence of stringa if there is a second occurrence?

//result: 
pos2 = stringb.indexOf(stringa, pos+1);

//6) Consider assignment 2 for this lesson. Consider the code to find and print all the YouTube URL links.
URLResource file = new  URLResource("http://someURL");
   	for (String item : file.words()) {
       	   String itemLower = item.toLowerCase();
       	   int pos = itemLower.indexOf("youtube.com");
       	   if (pos != -1) {
           	MISSING CODE
               }
       }
       
//result: which one of the following is the missing code to find and print all the Youtube URLs?
int beg = item.lastIndexOf("\"",pos);
int end = item.indexOf("\"", pos+1);
System.out.println(item.substring(beg+1,end));

//Which one of the following is the first gene for this strand of DNA where you want to consider all three of the stop codons?
//“AATGCTAACTAGCTGACTAAT”

//Result: ATGCTAACTAGCTGA

//Consider the following code segment to count the number of times the string “TG” occurs in the string dna, that does not work correctly.
String dna = "CTGCCTGCATGATCGTA";
int pos = dna.indexOf("TG");
int count = 0;
while (pos >= 0) {
  count = count + 1;
  pos = dna.indexOf("TG",pos);
}
System.out.println(count);

//result: Each time pos is reset in the while loop it finds the same “TG”.

//Consider the following segment of code from a program:
while (count < 3) {
  count += 1;
  newDna = newDna + dna.substring(startPos,pos);
  startPos = pos+1;
  pos = dna.indexOf("T", startPos);
  if (pos == -1) {
    break;
  }
}
//result: 2

//Which one of the following conditionals correctly evaluates to true if the integer num is an odd number and to false if it is an even number.

//result : if(num%2==1)