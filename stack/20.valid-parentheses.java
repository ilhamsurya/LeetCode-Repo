package stack;

import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        // Solution by ilham surya 15/06/22
        // Stack Approach Time O(N) Space O(N)
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{')
                stack.push(ch);
            else if (stack.empty())
                return false;
            else if (ch == ')' && stack.pop() != '(')
                return false;
            else if (ch == ']' && stack.pop() != '[')
                return false;
            else if (ch == '}' && stack.pop() != '{')
                return false;
        }
        return stack.empty();
    }
}
// @lc code=end
