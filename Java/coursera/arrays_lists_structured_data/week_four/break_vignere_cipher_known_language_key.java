import java.util.*;
import edu.duke.*;

public class VigenereBreaker {
    public String sliceString(String message, int whichSlice, int totalSlices){
        String sliced = "";
        for (int i = whichSlice; i < message.length(); i += totalSlices) {
            sliced += message.charAt(i);
        }
        return sliced;
    }

    public int[] tryKeyLength(String encrypted, int klength, char mostCommon) {
        int[] key = new int[klength];
        CaesarCracker ccr = new CaesarCracker(mostCommon);
        for(int i = 0; i < klength; i++) {
            String m = sliceString(encrypted, i, klength);
            int k = ccr.getKey(m);
            key[i] = k;
        }
        return key;
    }
}

public void breakVigenere() {
    FileResource fr = new FileResource();
    String message = fr.asString();

    VigenereBreaker

}