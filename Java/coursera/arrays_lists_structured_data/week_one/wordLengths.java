import edu.duke.*;

public class WordLengths {

    public void countWordLengths(FileResource resource, int counts[]) {
        int i = 0;
        int numberOfWords = 0;
        for (String word : resource.words()) {
            word = word.toLowerCase();
            i = word.length();
            if (Character.isLetter(word.charAt(0)) == false || Character.isLetter(word.charAt(i - 1)) == false) {
                i -= 1;
            }
            counts[i] += 1;
            numberOfWords++;
        }

        for (int k = 0; k <= numberOfWords; k++) {
            System.out.println(counts[k] + " words of length " + k);
        }
    }

    public void testCountWordLengths() {
        FileResource resource = new FileResource("manywords.txt");
        int[] counts = new int[31];
        countWordLengths(resource, counts);

    }
}
