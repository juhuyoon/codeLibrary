
import java.util.*;

public class MarkovWordOne implements IMarkovModel {
    private String[] myText;
    private Random myRandom;

    public MarkovWordOne() {
        myRandom = new Random();
    }

    public void setRandom(int seed) {
        myRandom = new Random(seed);
    }

    public void setTraining(String text) {
        myText = text.split("\\s+");
    }

    public String getRandomText(int numWords) {
        StringBuilder sb = new StringBuilder();
        int index = myRandom.nextInt(myText.length - 1); // random word to start with
        String key = myText[index];
        sb.append(key);
        sb.append(" ");
        for (int k = 0; k < numWords - 1; k++) {
            ArrayList<String> follows = getFollows(key);
            // System.out.println(key + ": " + follows);
            if (follows.size() == 0) {
                break;
            }
            index = myRandom.nextInt(follows.size());
            String next = follows.get(index);
            sb.append(next);
            sb.append(" ");
            key = next;
        }

        return sb.toString().trim();
    }

    /**
     * Returns an ArrayList of all the single words that immediately follow the key
     * in the training text.
     */
    private ArrayList<String> getFollows(String key) {
        ArrayList<String> follows = new ArrayList<String>();

        int index = 0;
        while (true) {
            index = indexOf(myText, key, index);

            if (index == -1 || (index + 1) >= myText.length) {
                break;
            }

            follows.add(myText[index + 1]);

            index++;
        }

        return follows;
    }

    /**
     * Looks at the start position and returns the first index location in words
     * that matches target. If no word is found, then returns -1.
     */
    private int indexOf(String[] words, String target, int start) {
        int index = -1;
        for (int i = start; i < words.length; i++) {
            if (words[i].equals(target)) {
                return i;
            }
        }
        return index;
    }

    public void testIndexOf() {
        String[] words = "this is just a test yes this is a simple test".split(" ");

        int index = indexOf(words, "this", 0);
        System.out.println(index);
        index = indexOf(words, "this", 3);
        System.out.println(index);
        index = indexOf(words, "frog", 0);
        System.out.println(index);
        index = indexOf(words, "frog", 5);
        System.out.println(index);
        index = indexOf(words, "simple", 2);
        System.out.println(index);
        index = indexOf(words, "test", 5);
        System.out.println(index);
    }
}