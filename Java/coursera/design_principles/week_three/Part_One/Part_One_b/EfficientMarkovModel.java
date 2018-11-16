import java.util.*;

public class EfficientMarkovModel extends AbstractMarkovModel {
    private HashMap<String, ArrayList<String>> map;

    /**
     * Takes integer specifying the number of characters to use to predict the next
     * character.
     */
    public EfficientMarkovModel(int num) {
        myRandom = new Random();
        order = num;
        map = new HashMap<String, ArrayList<String>>();
    }

    @Override
    public String toString() {
        return "EfficientMarkovModel of order " + order;
    }

    public void setTraining(String s) {
        myText = s.trim();
        buildMap();
        printHashMapInfo();
    }

    /**
     * Predicts the next character by finding all the characters that follow a
     * substring of keyLength characters in the training text, and then randomly
     * picking one of them as the next character.
     */
    public String getRandomText(int numChars) {
        if (myText == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        // Generate a random index from valid indexes (those that have following
        // characters)
        int index = myRandom.nextInt(myText.length() - order);
        // Assign to key the character string at the random index that is keyLength long
        String key = myText.substring(index, index + order);
        sb.append(key);
        // NOTE: Generate numChars minus four cuz they are set before the loop
        for (int k = 0; k < numChars - order; k++) {
            // Find all characters that follow the current 4-character string
            ArrayList<String> follows = getFollows(key);
            // Break if no characters were found
            if (follows.size() == 0) {
                break;
            }
            // Randomly pick one of them as the successor
            index = myRandom.nextInt(follows.size());
            String successor = follows.get(index);
            sb.append(successor);
            // Combine old key (except first character) with successor to make next key
            key = key.substring(key.length() - (order - 1)) + successor;
        }
        return sb.toString();
    }

    /**
     * Builds a HashMap to calculate the follows ArrayList for each possible
     * substring only once.
     */
    private void buildMap() {
        // Build HashMap of the characters that follow each substring of order length
        for (int pos = 0; pos <= myText.length() - order; pos++) {
            int subEnd = pos + order;
            // Identify the current substring
            String sub = myText.substring(pos, subEnd);
            // If HashMap doesn't yet contain substring as key
            if (!map.containsKey(sub)) {
                map.put(sub, new ArrayList<String>());
            }
            // Add to HashMap the character that follows current substring, if there is one
            if (subEnd < myText.length()) {
                String follower = myText.substring(subEnd, subEnd + 1);
                // System.out.println(sub + ": " + follower);
                ArrayList<String> followers = map.get(sub);
                followers.add(follower);
                map.put(sub, followers);
            }
        }
    }

    /**
     * Tests HashMap to make sure it is built correctly.
     */
    public void printHashMapInfo() {
        // Print the HashMap (all the keys and their corresponding values)
        // System.out.println("Hashmap: " + "\n" + map);

        // Print the number of keys in the HashMap
        System.out.println("Number of keys: " + map.size());

        // Print the size of the largest largest ArrayList of characters in the HashMap
        int largestSize = 0;
        for (String key : map.keySet()) {
            int keySize = map.get(key).size();
            if (keySize > largestSize) {
                largestSize = keySize;
            }
        }
        System.out.println("The size of the largest ArrayList of characters: " + largestSize);

        // Print the keys that have the maximum size value
        System.out.println("The keys that have the maximum size value:");
        for (String key : map.keySet()) {
            if (map.get(key).size() == largestSize) {
                System.out.println(key);
            }
        }

        System.out.println("\n");
    }

    @Override
    public ArrayList<String> getFollows(String key) {
        return map.get(key);
    }
}