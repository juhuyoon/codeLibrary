import edu.duke.*;
import java.util.*;

public class WordFrequencies {
    
    // parallel array for the frequencies of the words
    private ArrayList<String> myWords;
    private ArrayList<Integer> myFreqs; //to store the frequencies

    public WordFrequencies() {
        myWords = new ArrayList<String>();
        myFreqs = new ArrayList<Integer>();
    }

    public void findUnique() {
            myWords.clear();
            myFreqs.clear(); //to reset
        FileResource fr = new FileResource();

        for (String s: resource.words()) {
            s = s.toLowerCase();
            int index = myWords.indexOf(s);
            if(index == -1) {
                myWords.add(s);
                myFreqs.add(1);
            } else { 
            int value = myFreqs.get(index); //access the value of the location of the word at its frequency with get index
            myFreqs.set(index, value+1); //set the value in the frequency to value + 1
            }
        } 
    }

    //to return an integer that is the index location of the largets value in myFreqs. If there is a tie, return first value. 
    public int findIndexOfMax() {
        int max = myFreqs.get(0);
        int maxIndex = 0;
        for(int i = 0; i < myFreqs.size(); i++) {
            if(myFreqs.get(i) > max) {
                max = myFreqs.get(i);
                maxIndex = k;
            }
        }
        return maxIndex;
    }

    public void tester() {
        findUnique();
        System.out.println("# unique words: " + myWords.size(i));

        int index = findIndexOfMax();

        for(int i = 0; i < myFreqs.size(); i++) {
            System.out.println(myFreqs.get(i) + "\t" + myWords.get(i));
        }
        System.out.println("The word that occurs the most often is " + myWords.get(index) + " and the count is " + myFreqs.get(index));
        System.out.println("The unique word is " + myWords.size());
    }
}

