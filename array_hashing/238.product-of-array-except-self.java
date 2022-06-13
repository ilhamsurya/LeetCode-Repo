package array_hashing;

/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Solution by ilham surya 13/06/22
        // Array approach
        int[] res = new int[nums.length];

        // First loop will contain and add the initial num to result
        for (int i = 0, tmp = 1; i < nums.length; i++) {
            res[i] = tmp;
            tmp *= nums[i];
        }

        // Second loop will multiply it with all number except itself
        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
            res[i] *= tmp;
            tmp *= nums[i];
        }
        return res;
    }
}
// @lc code=end
