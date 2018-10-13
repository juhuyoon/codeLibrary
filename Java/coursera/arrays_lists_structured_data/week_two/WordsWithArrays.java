import java.util.*;
import edu.duke.*;

public class WordsWithArrays { //StorageResource is used here as we don't know how many words there will be. So it has to be unlimited
    StorageResourcee myWords;
    
    public WordsWithArrays() {
        myWords = new StorageResource();
    }

    public void readWords() {
        myWords.clear();
    }
}