//caesar cipher and vignere cipher
//shifting the letters by N(+3 letters prior)

//e.g. 'F' - 3 = 'C' via math with letters.
//to have A addressed to the end of the alphabet, you can pre-shift the alphabet. 
    //then compute each shifts at the start, look up each letter, 
    //to find: 
    alphabet.indexOf("F");

    //alphabet
    //Strings are immutable and cannot be changed
    //Can only make new ones

   String encr =  alphabet.substring(key);
   encr = encr + alphabet.substring(0, key);

   //StringBuilder
    //For mutable sequence of characters
    StringBuilder sb = new StringBuilder("Hello");
        //methods: append, insert chatAt, setCharAt, toString





import edu.duke.*;

public class CaesarCipher {
    /*
     * Encrypting the String parameter using the key. We make two Strings of lower
     * and upper case characters and shift it according to the key.
     */
    public String encrypt(String input, int key) {
        // Make a StringBuilder with message (encrypted) is the StringBuilder an array build as well...?
        StringBuilder encrypted = new StringBuilder(input);
        // Write down the alphabet
        String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
        // Compute the shifted alphabet
        String shiftedAlphabetUpper = alphabetUpper.substring(key) + alphabetUpper.substring(0, key);
        String shiftedAlphabetLower = alphabetLower.substring(key) + alphabetLower.substring(0, key);
        // Count from 0 to < length of encrypted, (call it i)
        for (int i = 0; i < encrypted.length(); i++) {
            // Look at the ith character of encrypted (call it currChar)
            char currChar = encrypted.charAt(i);
            // If currChar is in the alphabetUpper
            if (alphabetUpper.indexOf(currChar) != -1) {
                char newCharU = shiftedAlphabetUpper.charAt(alphabetUpper.indexOf(currChar));
                // Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i, newCharU);
            }
            // If currChar is in the alphabetLower
            if (alphabetLower.indexOf(currChar) != -1) {
                char newCharL = shiftedAlphabetLower.charAt(alphabetLower.indexOf(currChar));
                // Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i, newCharL);
            }
        }
        // Your answer is the String inside of encrypted
        return encrypted.toString();
    }


    /*
     * This function also encrypts the String, but usues two keys in the process.
     */

    public String encryptTwoKeys(String input, int key1, int key2) {
        // StringBuilder encrypted = new StringBuilder(input);
        String stringWithK1 = encrypt(input, key1);
        String stringWithK2 = encrypt(input, key2);
        String empty = "";

        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                empty = empty + stringWithK1.charAt(i);
            } else
                empty = empty + stringWithK2.charAt(i);
        }
        return empty;
    }

    public void testCaesar() {
        int key = 15;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt("Can you imagine life WITHOUT the internet AND computers in your pocket?", key);
        System.out.println(encrypted);
        String decrypted = encrypt(encrypted, 26 - key);
        System.out.println(decrypted);
    }

    public void testencryptTwoKeys() {
        int key1 = 21;
        int key2 = 8;
        String input = "Can you imagine life WITHOUT the internet AND computers in your pocket?";
        String encrypted = encryptTwoKeys(input, key1, key2);
        System.out.println(encrypted);
        // String decrypted = encrypt(encrypted, 26-key);
        // System.out.println(decrypted);
    }
}
