import edu.duke.*;

public class CaesarCipher {
    /*
     * Encrypting the String parameter using the key. We make two Strings of lower
     * and upper case characters and shift it according to the key.
     */
    public String encrypt(String input, int key) {
        // Make a StringBuilder with message (encrypted)
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

// Which one of the following shows how you could assign the character variable ch to the lowercase version of itself, without having to write any additional methods?
//result: ch = Character.toLowerCase(ch);


//Consider writing the method isAorE that has one char parameter, ch. This method should return true if ch is either ‘a’ or ‘e’, and otherwise return false.
//Which two of the following are correct implementations for the method isAorE?
//result 1)
public boolean isAorE (char ch) {    	
     if (ch == 'a') {        
          return true;          
     }    	    
     if (ch == 'e') {        	
          return true;    	
     }    	
     return false;	
}
//result 2)
public boolean isAorE (char ch) {
     if (ch == 'a' || ch == 'e') { 
          return true; 
     }
     return false;
}

//Assume that isVowel is a method with one char parameter, and that this method returns true if that character is a vowel, and false if it is not a vowel.
//Consider the following code to replace all vowels in a string phrase with a given character ch.
StringBuilder sb = new StringBuilder(phrase);for(
    int k = 0;k<sb.length();k++)
    {                  
     // MISSING CODE       	
}

// Which one of the following is the missing code to modify sb so that all vowels in sb are replaced with the character ch?

//result:

    if(isVowel(sb.charAt(k))) {       
     sb.setCharAt(k, ch);
}

// Consider the following definition where phrase is a String.
StringBuilder sb = new StringBuilder(phrase);

// Which two of the following are correct ways to ask if a character in the kth
// position of sb is equal to the character ch, when we want them to match
// regardless of case?
//result 1):
if (Character.toLowerCase(sb.charAt(k)) == Character.toLowerCase(ch)) {

//result 2): 
char one = Character.toLowerCase(sb.charAt(k));      	
char two = Character.toLowerCase(ch);      	
if (one == two) {