package array_hashing;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        // Solution By Ilham Surya 15/06/22
        // Array Approach Time O(N), Space O(1) optimized

        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            alphabet[ch - 'a']++;
        }
        for (int j = 0; j < t.length(); j++) {
            char ch = t.charAt(j);
            alphabet[ch - 'a']--;
        }
        for (int i : alphabet) {
            if (i != 0)
                return false;
        }
        return true;

    }
}
// @lc code=end
