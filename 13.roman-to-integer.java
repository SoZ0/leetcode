import java.util.HashMap;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {

    HashMap<Character, Integer> romanChars = new HashMap<>(){{
        put('I',1);
        put('V',5);
        put('X',10);
        put('L',50);
        put('C',100);
        put('D',500);
        put('M',1000);
    }};

    public int romanToInt(String s) {
        int value = 0;
        char p = ' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            value += romanChars.get(c);
            if(p ==  'I' && (c == 'V' || c == 'X')) value -= 2;
            if(p ==  'X' && (c == 'L' || c == 'C')) value -= 20;
            if(p ==  'C' && (c == 'D' || c == 'M')) value -= 200;
            System.out.println(c + " - "+value);
            p = c;
        }
        return value;
    }
}
// @lc code=end

