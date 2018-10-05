import edu.duke.*;


public class CaesarCipherDecrypt {
    public int [] countLetters(String encrypted){
        String alph = "abcdefghijklmnopqrstuvwxyz";
        int [] counts = new int[26];
        for(int k = 0; k< encrypted.length(); k++){
            char ch = Character.toLowerCase(encrypted.charAt(k));
            int dex = alph.indexOf(ch);
            if(dex != -1){
                counts[dex] +=1; 
            }
        }
        return counts;
    }
    
    public int maxIndex (int [] freqs){
        int max = 0;
        for(int i = 0; i<freqs.length; i++){
            if(freqs[i] > freqs[max]){
                max = i;
            }
        }
        return max;
    }
    
    public String decrypt(String encrypted){
        CaesarCipher cc = new CaesarCipher();
        int [] freqs = countLetters(encrypted);
        int maxDex = maxIndex(freqs);
        int dKey = maxDex-4;
        if(maxDex<4){
            dKey = 26 - (4-maxDex);
        }
        return cc.encrypt(encrypted, 26-dKey);
    }
    
    public String halfOfString (String message, int start){
        String empty0 = "";
        String empty1 = "";
           for(int i = 0; i < message.length(); i++) {
            if(i%2 == 0){
                empty0 = empty0 + message.charAt(i);
            }
            else empty1 = empty1 + message.charAt(i);
        }
        
        if(start == 0) return empty0;
        else return empty1;
    }
    
    public int getKey(String s){
        int [] count = new int[26];
        int dKey= 0;
        count = countLetters(s);
        int maxDex = maxIndex(count);
        dKey = maxDex-4;
        if(maxDex<4){
            dKey = 26 - (4-maxDex);
        }
        return dKey;
    }
    
    public String decryptTwoKeys(String s){
        CaesarCipher cc = new CaesarCipher();
        String firstHalf = halfOfString(s, 0);
        String secondHalf = halfOfString(s, 1);
        int getKey1 = getKey(firstHalf);
        int getKey2 = getKey(secondHalf);
        System.out.println(getKey1 + " " + getKey2 );
        
        String newString1 = cc.encrypt(firstHalf, 26-getKey1);
        String newString2 = cc.encrypt(secondHalf, 26-getKey2);
        //StringBuilder news1 = new StringBuilder(newString1);
        //StringBuilder news2 = new StringBuilder(newString2);
        //int capacity = 100;
        StringBuilder sb = new StringBuilder(newString1+newString2);
        
         for (int i=0;i<newString1.length();i++) {
            sb.setCharAt(2*i, newString1.charAt(i));
        }
        //put s1 to place
        for (int i=0;i<newString2.length();i++) {
            sb.setCharAt(2*i+1, newString2.charAt(i));
        }
        
        return sb.toString();
        
    }
    
    public void testmaxIndex(){
        int [] freqs = {7,2,9,4,0};
        int max = maxIndex(freqs);
        System.out.println("Max freq is : " + max);
    }
    
    public void testDecrypt(){
        String encrypted = "Yjhi p ithi higxcv lxiw adih du ttttttttttttttttth ";
        String decrypted = decrypt(encrypted);
        System.out.println(decrypted);
    
    
    }
    
    public void testhalfOfString(){
        String example = "Qbkm Zgis";
        String result = halfOfString(example, 1);
        System.out.println("Half string is " + result);
        
    }
    
    public void testdecryptTwoKeys(){
        FileResource fr = new FileResource();
        String message = fr.asString();
        //String example = "Aal uttx hm aal Qtct Fhljha pl Wbdl. Pvxvxlx!";
        String result = decryptTwoKeys(message);
        System.out.println(result);

    }
    }