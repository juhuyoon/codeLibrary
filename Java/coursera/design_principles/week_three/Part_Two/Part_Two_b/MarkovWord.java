import java.util.*;

public class MarkovWord implements IMarkovModel {
    private String[] myText;
    private Random myRandom;
    private int myOrder;

    public MarkovWord(int order) {
        myRandom = new Random();
        myOrder = order;
    }

    public void setRandom(int seed) {
        myRandom = new Random(seed);
    }

    public void setTraining(String text) {
        myText = text.split("\\s+");
    }

    /**
     * Looks for the first position from start that has words in the array words
     * that match the WordGram target. If no match is found, returns -1.
     */
    private int indexOf(String[] words, WordGram target, int start) {
        for (int i = start; i < words.length - myOrder; i++) {
            WordGram word = new WordGram(words, i, myOrder);
            if (word.equals(target)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns an ArrayList of all the single words that immediately follow an
     * instance of the WordGram parameter somewhere in the training text
     */
    private ArrayList<String> getFollows(WordGram kGram) {
        ArrayList<String> follows = new ArrayList<String>();

        int index = 0;
        while (true) {
            index = indexOf(myText, kGram, index);

            if (index == -1 || (index + myOrder) >= myText.length) {
                break;
            }
            follows.add(myText[index + myOrder]);
            index = index + myOrder;
        }

        return follows;
    }

    /**
     * Generates and returns random text that has numWords words. Generates each
     * word by randomly choosing a word from the training text that follows the
     * current word(s) in the training text.
     */
    public String getRandomText(int numWords) {
        // Initialize the random text to be returned
        StringBuilder sb = new StringBuilder();
        // Choose a random word to start with
        int index = myRandom.nextInt(myText.length - myOrder);
        // Create WordGram of size myOrder beginning at index
        WordGram key = new WordGram(myText, index, myOrder);
        sb.append(key); // its toString method is auto called
        sb.append(" ");
        for (int k = 0; k < numWords - myOrder; k++) {
            // Find all the words that follow this WordGram
            ArrayList<String> follows = getFollows(key);
            // System.out.println(key + ": " + follows);
            if (follows.size() == 0) {
                break;
            }
            // Add to text a random word that follows this WordGram
            index = myRandom.nextInt(follows.size());
            String next = follows.get(index);
            sb.append(next);
            sb.append(" ");
            key = key.shiftAdd(next);
        }

        return sb.toString().trim();
    }
}