//Vigenere cipher
    //key is "word" (array of ints)
    //use "mod" to wrap around 0,1,2,3,0,1,...

//Message: Meet me At Dawn
    //Key + 382438243824382
    //Encrypted = Take through those keys at skip to the letters that are there

//use slice string
for(int i = 4; i < 30; i += 7) {
    System.out.println(i);
}

//advice on writing sliceString:
    //remember stringbuilder
    //counting for loops can...
        //start at any number
        //count by any number

public int[] tryKeyLength(String encrypted, int klength, char mostCommon)
//Find key for encrypted for given klength
    //mostCommon = most frequent letter('e');
        //For later: differnt languages
    //Use sliceString
    //And CaesarCracker
        //int getKey(String encrypted)
        //Constructor takes mostCommons

public void breakVigenere() 
    //method to call from IDE
    //use FileResource to read file
        //useful: .asString()
    //Use tryKeyLength to breka key
        //for now keyLength given, most Common = 'e'
    //Use vigenereCipher's .decrypt(String)