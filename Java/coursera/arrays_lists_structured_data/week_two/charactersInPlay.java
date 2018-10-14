import edu.duke.*;
import java.util.*;

public class charactersInPlay {

    private ArrayList<String> characters;
    private ArrayList<Integer> charCounts;

    public charactersInPlay() {
      characters = new ArrayList<String>();
      charCounts = new ArrayList<Integer>();
    }

    //Updating the two ArrayLists and adding character names if they do not exist and counting the line as one speaking part for the person. 
    public void update(String person) {
        if (!characters.contains(person)) {
            characters.add(person);
            charactersCount.add(1);
        } else {
            int index = characters.indexOf(person);
            int count = charactersCount.get(index);
            charactersCount.set(index, count + 1);
        }
    }

    //opens the file and reads file line by line. 
    //If there is a period on the line, extract possible name of the part
    public void findAllCharacters() {
        characters.clear();
        charCounts.clear();
        FileResource fr = new FileResource();
        for(String line : resource.line()) {
            int index = line.indexOf(".");
            if(index != -1) {
                String character = line.substring(0, index);
                update(character); //call update and count it as an occurrence for the person. 
            }
        }
    }

    //grab the main character and grab the lines that he/she goes through the text. 
    private String getMainCharacter() {
        int max = charactersCount.get(0);
        int maxIndex = 0;
        for (int i = 0; i < charactersCount.size(); i++) {
            if (charactersCount.get(i) > max) {
                max = charactersCount.get(i);
                maxIndex = i;
            }
        }
        return characters.get(maxIndex);
    }

    //To print out names of all the characters that have exactly the same number of speaking parts or if num1 =< num2
    private void charactersWithNumParts(int num1, int num2) {
        for (int i = 0; i < characters.size(); i++) {
            if (charactersCount.get(i) >= num1 && charactersCount.get(i) <= num2)
                System.out.println(characters.get(i) + " " + charactersCount.get(i));
        }
    }

      public void tester(){
        findAllCharacters();
        System.out.println("Testing findAllCharacters ");
        for(int i=0; i<characters.size(); i++){
            if(charactersCount.get(i) < 100)
                System.out.println(characters.get(i) + " " + charactersCount.get(i) );
        }
        System.out.println("Testing charactersWithNumParts");
        charactersWithNumParts(10, 15);
        System.out.println("Testing get main character");
        String mainCharacter = getMainCharacter();
        System.out.println("Main Character: " + mainCharacter);
    }
}
