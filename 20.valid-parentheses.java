
/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.HashMap;
import java.util.Stack;

class Solution {

    public boolean isValid(String s) {

        HashMap<Character, Character> charPairs = new HashMap<>();

        charPairs.put('{', '}');
        charPairs.put('[', ']');
        charPairs.put('(', ')');

        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {

            if(charPairs.containsKey(c)){
                stack.add(charPairs.get(c));
            }else{
                if(stack.isEmpty() || c != stack.peek()) return false;

                stack.pop();
            }
        }
        return stack.empty();
    }
}
// @lc code=end

