package String;

import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        // Solution by ilham surya 05/06/22
        // String, Array Approach Time O(N), Space O(1)
        String digitletter[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> list = new ArrayList<>();
        if (digits.length() == 0)
            return list;
        list.add("");
        for (int i = 0; i < digits.length(); i++) {
            list = combine(digitletter[digits.charAt(i) - '0'], list);
        }
        return list;
    }

    public List<String> combine(String digit, List<String> list) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < digit.length(); i++) {
            for (String x : list) {
                result.add(x + digit.charAt(i));
            }
        }
        return result;
    }
}
// @lc code=end
