// Telling a Random Story quiz

//How many unique words are in likeit.txt?
//result: 4932

//Which word occurs the most often int he file likeit.txt?
//result: the

//Find the word that occurs the most often in the file likeit.txt
//result: 692

//What is the name of the character with the most speaking parts in likeit.txt?
//result: rosalind

//Find the name of the character with the most speaking parts in the file likeit.txt
//result: 200

//Name one of the five characters in the file likeit.txt who has at least 10 speaking lines, but no more than 15. 
//result: adam

//Using and Improving GladLibs
//Using file dnaMystery1, which reading frame results in the most unique codons?
//result: 2

//With reading frame 2, enter the codon that appears exactly 4 times
//result: TTA


// With reading frame 1, enter the codon that appears exactly 6 times
// result: TTA


//Consider the five files with plays by Shakespeare: caesar.txt, hamlet.txt, likeit.txt, macbeth.txt, and romeo.txt.
//How many words are there that occur in five files?

//result: 880

// Consider the five files: caesar.txt, hamlet.txt, likeit.txt, macbeth.txt, and
// romeo.txt.
//In which file does the word "sad" not appear?

//result: hamlet.txt

//Consider the five files: caesar.txt, hamlet.txt, likeit.txt, macbeth.txt, and romeo.txt.
//In which files does the word “red” appear? (Select all that are correct.)

//result: caesar, hamlet, likeit

// In the first version of GladLibs we saw in this lesson, assume an ArrayList
// named wordsUsed will store words that are used as replacements, so no
// replacement word will be used more than once. Which one of the following
// could be the MISSING CODE for the code below in GladLibs to make sure that no
// word is used twice?

String sub = getSubstitute(w.substring(first+1,last));
while (true) {
    [MISSING CODE]
}

//result: 
if (! wordsUsed.contains(sub)) {
    wordsUsed.add(sub);
    break;   	     
}
sub = getSubstitute(w.substring(first+1,last));


// Consider the map version of GladLibs, and consider the method totalWordsInMap that returns the total number of words in all the ArrayLists in the HashMap myMap. Which one of the following is the best choice for the loop in this method?

//result: 
for (String category : myMap.keySet()) {

//Consider the map version of GladLibs, and consider the method totalWordsConsidered that returns the total number of words in the ArrayLists of the categories that were used for a particular GladLib. What type of private instance variable would be the best choice to solve this problem?

//result: An ArrayList of Strings representing the unique categories used. 