package two_pointer;

/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        // Solution by ilham surya 08/06/22
        // Two Pointer Approach
        String temp = Integer.toString(x);
        int[] newNum = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            newNum[i] = temp.charAt(i) - '0';
        }
        int head = 0;
        int tail = newNum.length - 1;

        while (head < tail) {
            if (newNum[head] == newNum[tail]) {
                head++;
                tail--;
            } else {
                return false;
            }
        }
        return true;

    }
}
// @lc code=end
