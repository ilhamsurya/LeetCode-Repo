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
        // Hashmap Approach Time O(N), Space O(N)
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int j = 0; j < t.length(); j++) {
            char ch = t.charAt(j);
            if (map.containsKey(ch)) {
                if (map.get(ch) >= 1) {
                    map.put(ch, map.get(ch) - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        System.out.println(map);
        return true;
    }
}
// @lc code=end
