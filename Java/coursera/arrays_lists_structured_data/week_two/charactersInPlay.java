import java.util.*;
import java.util.*;

import edu.duke.*;

public class CharactersInPlay {

    private List<String> characters;
    private List<Integer> counts;

    public CharactersInPlay() {
        characters = new ArrayList<>();
        counts = new ArrayList<>();
    }

    public void update(String person) {
        int index = characters.indexOf(person);
        if (index != -1) {
            counts.set(index, counts.get(index) + 1);
        } else {
            characters.add(person);
            counts.add(1);
        }
    }

    public void findAllCharacters() {
        characters.clear();
        counts.clear();
        FileResource resource = new FileResource();
        for (String line : resource.lines()) {
            int indexOfPeriod = line.indexOf('.');
            if (indexOfPeriod != -1) {
                String person = line.substring(0, indexOfPeriod);
                update(person);
            }
        }
    }

    public void charactersWithNumParts(int num1, int num2) {
        for (int i = 0; i < characters.size(); i++) {
            if (counts.get(i) >= num1 && counts.get(i) <= num2) {
                System.out.println(characters.get(i));
            }
        }
    }

    public void tester(int minimumCount) {
        findAllCharacters();
        for (int i = 0; i < characters.size(); i++) {
            if (counts.get(i) >= minimumCount) {
                System.out.println(characters.get(i) + " " + counts.get(i));
            }
        }
        // charactersWithNumParts(10, 15);
    }

    public static void main(String[] args) {
        CharactersInPlay cip = new CharactersInPlay();
        cip.tester(3);
    }

}