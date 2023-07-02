/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c_array  = s.toCharArray();

        HashMap<Character, Integer> charMap = new HashMap<>();
        int longestSet = -1;
        for (int i = 0; i < c_array.length; i++) {
            char c = c_array[i];
            // System.out.println(charMap.toString() +" "+i);
            if(charMap.containsKey(c)){
                // System.out.println(charMap.toString() +" contained "+ c);
                if(longestSet < charMap.size()) longestSet = charMap.size();
                i = charMap.get(c);
                charMap.clear();
            }else{
                charMap.put(c, i);
            }
        }

        if(longestSet < charMap.size()){
            longestSet = charMap.size();
        }

        return longestSet;
    }
}
// @lc code=end

