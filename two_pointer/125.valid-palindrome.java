package two_pointer;

/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        // Solution by ilham surya
        // Two Pointer Approach Time O(N)
        int head = 0;
        int tail = s.length() - 1;
        char chHead, chTail;
        while (head <= tail) {
            chHead = s.charAt(head);
            chTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(chHead)) {
                head++;
            } else if (!Character.isLetterOrDigit(chTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(chHead) != Character.toLowerCase(chTail))
                    return false;
                head++;
                tail--;
            }

        }
        return true;
    }
}
// @lc code=end
