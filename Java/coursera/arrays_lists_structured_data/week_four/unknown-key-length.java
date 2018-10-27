import java.util.*;
import edu.duke.*;

public class VigenereBreaker {
    public String sliceString(String message, int whichSlice, int totalSlices) {
        String sliced = "";
        for (int i = whichSlice; i < message.length(); i += totalSlices) {
            sliced += message.charAt(i);
        }
        return sliced;
    }

    public int[] tryKeyLength(String encrypted, int klength, char mostCommon) {
        int[] key = new int[klength];
        CaesarCracker ccr = new CaesarCracker(mostCommon);
        for (int i = 0; i < klength; i++) {
            String m = sliceString(encrypted, i, klength);
            int k = ccr.getKey(m);
            key[i] = k;
        }
        return key;
    }

    public void breakVigenere() {
        FileResource fr = new FileResource();
        String message = fr.asString();

        VigenereBreaker vb = new VigenereBreaker();
        int[] key = vb.tryKeyLength(message, 4, 'e');

        VigenereCipher vc = new VigenereCipher(key);
        for (int i : key) {
            System.out.println(i);
        }
        System.out.println(vc.decrypt(message));
    }

    public HashSet<String> readDictionary(FileResource fr) {
        HashSet<String> d = new HashSet<>();
        for(String l : fr.lines()) {
            d.add(l.toLowerCase());
        }
        return d;
    }

    public int countWords(String message, HashSet<String> dictionary) {
        String[] messageArray = message.split("\\W+"); //which returns a String array
        int count = 0;
        for(String word : messageArray) {
            if(dictionary.contains(word)) {
                count++;
            }
        }
        return count;
        }

        public void testTryKeyLength() {
        FileResource fr = new FileResource();
        String message = fr.asString();
        int[] array = tryKeyLength(message, 4, 'e');
        System.out.println(Arrays.toString(array));
        }
    
    public String breakForLanguage(String encrypted, HashSet<String> dictionary) {
        int max = 0;
        String d = "";
        int keyLong = 0;
        
        for(int i = 1; i < 100; i++) {
            int[] key;
            key = tryKeyLength(encrypted, i, 'e');
            VigenereCipher vc = new VigenereCipher(key);
            String decrypted = vc.decrypt(encrypted);

            if(countWords(decrypted, dictionary) > max) {
                max = countWords(decrypted, dictionary);
                d = decrypted;
                keyLong = i;
            }
        }
        System.out.println("key length used is " + keyLong);
        return d;
    }
    }
