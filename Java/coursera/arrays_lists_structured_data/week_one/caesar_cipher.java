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





public class CharacterDemo {
    public void digitTest() {
        String test = "ABCabc0123456789';#!";
        for(int k=0; k < test.length(); k++){
            char ch = test.charAt(k);
            if (Character.isDigit(ch)){
               System.out.println(ch+" is a digit"); 
            }
            if (Character.isAlphabetic(ch)){
                System.out.println(ch+" is alphabetic");
            }
            if (ch == '#'){
                System.out.println(ch +" #hashtag");
            }
        }
    }
    
    public void conversionTest(){
        String test = "ABCDEFabcdef123!#";
        for(int k=0; k < test.length(); k++){
            char ch = test.charAt(k);
            char uch = Character.toUpperCase(ch);
            char lch = Character.toLowerCase(ch);
            System.out.println(ch+" "+uch+" "+lch);
        }
    }
}
