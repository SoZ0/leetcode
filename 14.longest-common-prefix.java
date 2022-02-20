import java.util.ArrayList;
import java.util.HashMap;

/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        HashMap<Integer, ArrayList<Character>> input = new HashMap<>();

        String result = "";
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                char c = strs[i].charAt(j);
                ArrayList<Character> list;
                if(!input.containsKey(j)) {
                   list = new ArrayList<Character>(){{add(c);}};
                }else{
                    list = input.get(j);
                    if(list.get(0) == c)list.add(c);
                }
                input.put(j, list);
            }
        }
        
        for (ArrayList<Character> clist : input.values()) {
            Character c = clist.get(0);
            if(clist.size() != strs.length) return result;
            result += c;
        }
        return result;
    }
}
// @lc code=end

