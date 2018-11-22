
import java.util.*;

public class MarkovWordTwo implements IMarkovModel {
    private String[] myText;
    private Random myRandom;

    public MarkovWordTwo() {
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
        int index = myRandom.nextInt(myText.length - 2); // random word to start with
        String key = myText[index];
        String key2 = myText[index + 1];
        sb.append(key);
        sb.append(" ");
        sb.append(key2);
        sb.append(" ");
        for (int k = 0; k < numWords - 1; k++) {
            ArrayList<String> follows = getFollows(key, key2);
            // System.out.println(key + " " + key2 + ": " + follows);
            if (follows.size() == 0) {
                break;
            }
            index = myRandom.nextInt(follows.size());
            String next = follows.get(index);
            sb.append(next);
            sb.append(" ");
            key = key2;
            key2 = next;
        }

        return sb.toString().trim();
    }

    /**
     * Returns an ArrayList of all the single words that immediately follow the key
     * in the training text.
     */
    private ArrayList<String> getFollows(String key, String key2) {
        ArrayList<String> follows = new ArrayList<String>();

        int index = 0;
        while (true) {
            index = indexOf(myText, key, key2, index);

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
    private int indexOf(String[] words, String target1, String target2, int start) {
        int index = -1;
        for (int i = start; i < words.length - 1; i++) {
            if (words[i].equals(target1) && words[i + 1].equals(target2)) {
                return i + 1;
            }
        }
        return index;
    }
}