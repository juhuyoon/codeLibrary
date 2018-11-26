//1.2
//Check Permutation: Given two strings, write a method to decide if one is a permutation of the other. 

//Strings of different lengths cannot be permutations of each other. 

//Soln 1:
    String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    boolean permutation(String s, String t) {
        if(s.length() != t.length()) {
            return false; 
            return sort(s).equals(sort(t));
        }
    }
//not optimal, but it may be preferable whereas it's clean. 

//Soln 2: (Efficiency)
    boolean permutation(String s, String t) {
        if(s.length(0 != t.length())) {
            return false;
        }
        int[] letters = new int[128]; //Assumption of that it is ASCII. 

        char[] s_array = s.toCharArray();
        for(char c: s_array) {
            letters[c]++;
        }
        for(int i = 0; i < t.length(); i++) {
            int c = (int) t.charAt(i);
            letters[c]--;
            if(letters[c] < 0) {
                return false;
            }
        }
        return true;
    }

