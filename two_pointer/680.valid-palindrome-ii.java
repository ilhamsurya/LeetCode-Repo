package two_pointer;

/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        // Solution by ilham surya 07/06/22
        // Two Pointer Approach

        int head = 0;
        int tail = s.length() - 1;

        while (head <= tail) {
            if (s.charAt(head) == s.charAt(tail)) {
                head++;
                tail--;
            } else {
                return isPalindrome(s, head + 1, tail) || isPalindrome(s, head, tail - 1);
            }
        }
        return true;
    }

    // isPalindrome module will handle the check after remove one char from string
    public boolean isPalindrome(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
