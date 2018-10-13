import java.util.*;
import edu.duke.*;

public class WordsWithArrays { //StorageResource is used here as we don't know how many words there will be. So it has to be unlimited
    StorageResourcee myWords;
    
    public WordsWithArrays() {
        myWords = new StorageResource();
    }

    //read all the words and put it into storage of myWords in lowercase
    public void readWords() {
        myWords.clear();
        FileResource resource = new FileResource();
        for(String word: resource.words()) {
            myWords.add(word.toLowerCase());
        }
    }

    //Method that will check if what is passed already in the array
    
    public boolean contains(String[] list, String word, int number) {
        for(int i = 0; i < number; i++) {
            if(list[i].equals(word)) {
                return true; //returns true if the word passed is already in the array
            }
        }
        return false; 
    }

    //to note how many of the words are unique and to return that number of unique words when called upon
    public int numberOfUniqueWords() {
        int numStored = 0;
        String[] words = new String[myWords.size()]; //creates a separate array that has all of the unique words. 
                                    //myWords.size is kept open as we don't know how many words there might be
        for(String s : myWords.data()){
            if(! contains(words, s, numStored)) {
                words[numStored] = s;
                numStored++;
            }
        }
        return numStored;
    }

    //tester method 
    public void tester() {
        readWords();
        System.out.println("number of words read: " + myWords.size());
        int unique = numberOfUniqueWords();
        System.out.println("array count " + unique);
    }
}