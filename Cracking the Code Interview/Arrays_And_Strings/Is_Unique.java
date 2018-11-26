//1.1
//Is Unique: implement an algorithm to determine if a string has all unique characters. WHat if you cannot use additional data structures?

    //First ask if it's ASCII string or a Unicode string
    //Array of boolean values, flag at index i indicates whether char i in the alphabet is contained in the string.
    //If you see this character again, return false. 

    boolean isUniqueChars(String str) {
        if(str.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for(int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

//time complexity is O(n), where n is the length of the string
//Space complexity is O(1).

//to reduce space usage, use a bit vector
    boolean isUniqueChars(String str) {
        int checker = 0;
        for(int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
    //if additional data structures cannot be used,
        //Compare every character of the string to every other character of the string, will take O(n^2) time and O(1) space.
    //If allowed to modify the input string, we could sort the string in O(n long(n)) time and then linearly check the string for neighboring characters that are identical. 

    