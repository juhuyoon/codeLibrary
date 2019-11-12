package com.example.Google.Easy;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubString {
    //Return the minimum window from the string S which has all the chars from string T.

    /* Sliding window approach = works with two pointers,
        RIGHT pointer = expands current window
        LEFT pointer = contract a given window
        Expand the window by moving the right pointer, and when all the desired chars are in range,
        Contract until it is the smallest window.

        Input S = "ADOBECODEBANC", T = "ABC"
        Output: "BANC"
     */

    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        //Keeps count of all the unique chars in it.
        Map<Character, Integer> mapperT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            int count = mapperT.getOrDefault(t.charAt(i), 0);
            mapperT.put(t.charAt(i), count + 1);
        }

        //Number of unique chars in t, which is needed in desired window.
        int required = mapperT.size();

        //Pointers
        int l = 0;
        int r = 0;

        //Keeps track of UNIQUE chars in t
        int formed = 0;

        // Keeps track of all the unique chars in current window;
        Map<Character, Integer> windowCounts = new HashMap<>();

        //list of the form(window length, left, right)
        int[] ans = {-1, 0, 0};

        while (r < s.length()) {
            //Adds one char from the right to the window
            char c = s.charAt(r);
            int count = windowCounts.getOrDefault(c, 0);
            windowCounts.put(c, count + 1);

            //If frequency of current chara added equals to desired count, then increment the formed count by 1.
            if (mapperT.containsKey(c) && windowCounts.get(c).intValue() == mapperT.get(c).intValue()) {
                formed++;
            }

            //Try & contract the window till the point where it ceases to be 'desirable'
            while (l <= r && formed == required) {
                c = s.charAt(l);
                if (ans[0] == -1 || (r - l + 1 < ans[0])) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;

                    //Char at the position pointed by the LEFT pointer is no longer part of window
                    windowCounts.put(c, windowCounts.get(c) - 1);
                    if (mapperT.containsKey(c) && windowCounts.get(c).intValue() < mapperT.get(c).intValue()) {
                        formed--;
                    }
                    l++;
                }
                r++;
            }
        }
        return ans[0] == -1 ? " " : s.substring(ans[1], ans[2] + 1);
    }
}
