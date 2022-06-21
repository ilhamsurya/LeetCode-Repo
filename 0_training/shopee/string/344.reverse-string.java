/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        // Solution by ilham surya
        // Two Pointer approach Time O(1), Space O(1)
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;
            start++;
            end--;
        }

    }
}
// @lc code=end
