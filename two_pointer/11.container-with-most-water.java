package two_pointer;

/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        // Solution by ilham surya 10/06/22
        // Two Pointer Approach
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);

            // Calculate based on edge case, if the left smaller than right
            if (height[left] < height[right]) {
                left++;
            }
            // if the opposite happen
            else if (height[left] > height[right]) {
                right--;
            }
            // if neither happen
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}
// @lc code=end
