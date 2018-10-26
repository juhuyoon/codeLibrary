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

    public void testTryKeyLength() {
        FileResource fr = new FileResource();
        String message = fr.asString();
        int[] array = tryKeyLength(message, 4, 'e');
        System.out.println(Arrays.toString(array));
    

public void breakVigenere() {
    FileResource fr = new FileResource();
    String message = fr.asString();

    VigenereBreaker vb = new VigenereBreaker();
    int[] key = vb.tryKeyLength(message, 4, 'e');

    VigenereCipher vc = new VigenereCipher(key);
    for(int i : key) {
        System.out.println(i);
    }
    System.out.println(vc.decrypt(message));
}
}