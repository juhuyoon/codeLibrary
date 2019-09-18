package com.example.Google.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
    Given a string, find the length of the longest substring
    without repeating characters.

    Input: "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3

 */
//Soln 1: Time Complexity of O(n^3)
public class LongestSubStringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j <= n; j++) {
                if(allUnique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }
        }
        return ans;
    }


    //First check on the length that it starts off at
    //To see whether or not they are all unique values.
    public boolean allUnique(String s, int start, int end) {
        Set<Character> subString = new HashSet<>();
        if (subString.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if(subString.contains(ch)) {
                return false;
            }
            subString.add(ch);
        }
        return true;
    }
}

//With Hash Maps rather than set.
class longestSubStringWithoutChars2 {
    public int lengthOfLongestSubString2(String s) {
        if(s.length() == 0)  {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int j = 0;
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, (i - j + 1));
        }
        return max;
    }
}


