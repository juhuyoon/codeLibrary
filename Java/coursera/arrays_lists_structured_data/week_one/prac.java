import com.sun.corba.se.impl.resolver.FileResolverImpl;

//for caesar ciphers

public class CaesarCipher {
    public String encrypt(String input, int key) {
        StringBuilder encrypted = new StringBuilder(input);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int counts = new int[26];
        //this would be switching to the lower case after the input
        String shiftedAlphabet = alphabet.toLowerCase().substring(key)  + alphabet.substring(0, key);
        //you would go through the loop
        for(int i = 0; i < encrypted.length(); i++) {
            char currentChar = encrypted.charAt(i);
            //this would be counting the characters of each indv. letter that was picked out
            if(alphabet.indexOf(currChar) != -1) {
                char newChar = shiftedAlphabet.charAt(alphabet.indexOf(currentChar));
                encrypted.setCharAt(i, newChar);
            } 
        }
        return encrypted.toString();
    }

    //pushing into the empty string after encryption is done (with two keys) cannot do numbers
    public String encryptTwoKeys(String input, int key1, int key2) {
        String stringsWithK1 = encrypt(input, key1);
        String stringsWithK2 = encrypt(input, key2);
        String empty = "";

        for(int i = 0; i < input.length; i++) {
            if(i % 2 == 0) {
                empty = empty + stringsWithK1.charAt(i);
            } else {
                empty = empty + stringsWithK2.charAt(i);
            }
            return empty;
        }
    }


    //changing the decryption from separate methods to one method(?) does it work...
    public String decrypt(String encrypted) {
        CaesarCipher code = new CaesarCipher();
        int[] numbers = 0;
        int[] freqs = shiftedAlphabet(encrypted);
        int max = 0;
        for(int i = 0; i < freqs.length; i++) {
            if(freqs[i] > freqs[max]) {
                max = i;
            }
        }
        return max;
        //the hope is that if any numbers show up on the cipher, then the number will also be encrypted. 
        //If it is 0, it will just return 0. 
        for(int j = 0; j < numbers.length; j++){
            if(numbers[i] > numbers[0]) {
                numbers =  4;
            } else {
                numbers = 0;
            }
            return numbers;
        }
        
        int maxDex = maxIndex(freqs);
        int decryptionKey = maxDex - 4;
        if(maxDex < 4 ) {
            decryptionKey = 26 - (4-maxDex);
        }
            return encrypt(encrypted, 26-decryptionKey);
    }

    public void testCaesar() {
        int key = 10;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String input = "";
        String encrypted = encrypt(input, key);
        System.out.println(encrypted);
        String decrypt = encrypt(encrypted, 26 - key);
        System.out.println(decrypt);
    }

    public void testwithTwoKeys() {
        FileResource fr = new FileResource();
        int key1 = 15;
        int key2 = 8;
        String input = "";
        String encrypted = encryptTwoKeys(input, key1, key2);
        System.out.println(encrypted);
    }

}