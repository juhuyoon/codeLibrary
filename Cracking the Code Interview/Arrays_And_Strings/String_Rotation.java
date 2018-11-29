//1.9
//Assume you have a method isSubstring which checks if one word is a substring of another. 
//Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubString


boolean isRotation(String s1, String s2) {
    int len = s1.length();
    if(len == s2.length() && len > 0) {
        String s1s1 = s1 + s1;
        return isSubstring(s1s1, s2);
    }
    return false;
}

//runtime varies on the runtime of isSubstring, can assume that isSubstring runs in O(A+B) time(on strings of length A & B), then runtime of isRotation is O(N);