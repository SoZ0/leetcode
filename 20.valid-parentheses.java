import java.io.IOError;
import java.util.ArrayList;
import java.util.Collections;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        ArrayList<Integer> opens = new ArrayList<>();
        ArrayList<Integer> closes = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int value = 0;
            switch (c) {
                case '(':
                value++;
                case '{':
                value++;
                case '[':
                value++;
                opens.add(value);
                continue;
                case ')':
                value++;
                case '}':
                value++;
                case ']':
                value++;
                closes.add(value);
                continue;
            }
        }
        System.out.println(opens + " " + closes);
        Collections.reverse(closes);

        if(opens.size() != closes.size()) return false;
         
        for (int i = 0; i < opens.size(); i++) {
            if(opens.get(i) != closes.get(i)) return false;
        }
        return true;
    }
}
// @lc code=end

