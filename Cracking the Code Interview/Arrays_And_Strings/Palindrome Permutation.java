//1.4
//Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards.
//A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.

//Soln 1:
boolean isPermutationOfPalindrome(String phrase) {
    int[] table = buildCharFrequencyTable(phrase);
    return checkMaxOneOdd(table);
}

boolean checkMaxOneOdd(int[] table) {
    boolean foundOdd = false;
    for(int count : table) {
        if(count % 2 == 1) {
            if(foundOdd) {
                return false;
            }
            foundOdd = true;
        }
    }
    return true;
}

int getCharNumber(Character c) {
    int a = Character.getNumericValue('a');
    int z  Character.getNumericValue('z');
    int val = Character.getNumericValue(c);
    if(a <= val && val <= z) {
        return val - a;
    } return -1;
}

int[] buildCharFrequencyTable(String phrase) {
    int[] table = new int[Character.getNumericValue('z') -
                          Character.getNumericValue('a') + 1];
    for(char c : phrase.toCharArray()) {
        int x = getCharNumber(c);
        if(x != -1) {
            table[x]++;
        }
    }
    return table;
}

//This algorithm takes O(N) time, where N is the length of the string. 

//Soln 2:
//INstead of checking the number of odd counts at the end, we can check for the number counts as we go along. 
boolean isPermutationOfPalindrome(String phrase) {
    int countOdd = 0;
    int[] table = new int[Character.getNumericValue('z') - 
                          Character.getNumericValue('a') + 1];
                          for(char c: phrase.toCharArray()) {
                              int x= getCharNumber(c);
                              if(x != -1) {
                                  table[x]++;
                                  if(table[p]x] % 2 == 1) {
                                    countOdd++;
                                  } else {
                                      countOdd--;
                                  }
                              }
                          }
                          return CountOdd <= 1;
}
//shorter in writing and same big O time, however, may be slightly slower than the first solution. 