import java.util.*;

public class MarkovOne {
    private String myText;
    private Random myRandom;

    // constructor classes
    public MarkovOne() {
        myRandom = new Random();
    }

    public void setRandom(int seed) {
        myRandom = new Random(seed);
    }

    public void setTraining(String s) {
        myText = s.trim();
    }

    // predicts the next characters by finding the characters in the training text,
    // and then randomly picking one of them as the next character.
    public String getRandomText(int numChars) {
        if (myText == null) {
            return "";
        }
        // used to create modifiable string.
        StringBuilder sb = new StringBuilder();

        int index = myRandom.nextInt(myText.length() - 1);
        String key = myText.substring(index, index + 1);
        sb.append(key);

        for (int k = 0; k < numChars - 1; k++) {
            ArrayList<String> follows = getFollows(key);
            if (follows.size() == 0) {
                break;
            }

            index = myRandom.nextInt(follows.size());
            String successor = follows.get(index);
            sb.append(successor);
            key = successor;
        }
        return sb.toString();
    }

    public ArrayList<String> getFollows(String key) {
        ArrayList<String> follows = new ArrayList<String>();
        int pos = 0;
        while (true) {
            int index = myText.indexOf(key, pos);
            int indexOfSuccessor = index + key.length();
            if (index == -1 || indexOfSuccessor >= myText.length()) {
                break;
            }

            String successor = myText.substring(indexOfSuccessor, indexOfSuccessor + 1);
            follows.add(successor);

            pos = index + 1;
        }
        return follows;
    }
}