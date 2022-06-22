/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Solution by ilham surya
        // Sort Approach
        Arrays.sort(nums);
        return nums[nums.length-k];

    }
}
// @lc code=end

