
import java.util.*;

public abstract class AbstractMarkovModel implements IMarkovModel {
    protected String myText;
    protected Random myRandom;
    protected int order;

    public AbstractMarkovModel() {
        myRandom = new Random();
    }

    @Override
    public String toString() {
        return "MarkovModel of order " + order;
    }

    public void setRandom(int seed) {
        myRandom = new Random(seed);
    }

    public void setTraining(String s) {
        myText = s.trim();
    }

    // A signature for the abstract method getRandomText that has one integer
    // parameter
    // named numChars indicating the length of the randomly generated text
    abstract public String getRandomText(int numChars);

    /**
     * Finds all the characters from the private variable myText in MarkovOne that
     * follow key and puts all these characters into an ArrayList.
     * 
     * @returns the ArrayList
     */
    protected ArrayList<String> getFollows(String key) {
        ArrayList<String> follows = new ArrayList<String>();
        // Loop through myText until no more characters are found
        int pos = 0;
        while (true) {
            // Find indexes of key and succeeding character
            int index = myText.indexOf(key, pos);
            int indexOfSuccessor = index + key.length();
            // Break if key isn't found or if successor index is greater than last index
            if (index == -1 || indexOfSuccessor >= myText.length()) {
                break;
            }
            // Add to ArrayList the character immediately after key
            String successor = myText.substring(indexOfSuccessor, indexOfSuccessor + 1);
            follows.add(successor);
            // Update search position in myText
            pos = index + 1;
        }
        return follows;
    }
}