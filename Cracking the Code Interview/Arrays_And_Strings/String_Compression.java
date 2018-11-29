//1.6
//Implement a method to perform basic string compression using the counts of repeated characters. 
//For example, the string aabcccccaaa would become a2b1c5a3. 
//If the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a-z);

String compress(String str) {
    StringBuilder compressed = new StringBuilder();
    int countConsecutive = 0;
    for(int i = 0; i < str.length(); i++) {
        countConsecutive++;
    /* if next char is different than current, append this char to result */
    if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
        compressed.append(str.charAt(i));
        compressed.append(countConsecutive);
        countConsecutive = 0;
    }       
    }
    return compressed.length() < str.length() ? compressed.toSTring() : str;
}