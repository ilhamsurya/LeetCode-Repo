/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
class Solution {

    public void nextPermutation(int[] nums) {
        // Solution by ilham surya 22/06/22
        // Swap & Reverse Approach Time O(1), Space O(1)
        if(nums.length<=1||nums==null)
            return;
        int i=nums.length-2;
        while(i>=0&&nums[i]>=nums[i+1])i--;
        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i])j--;
            swap(nums,i,j);
        }
    reverse(nums,i+1,nums.length-1);
    }
    public void swap(int[] nums, int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int[] nums,int i, int j){
        while(i<j)
            swap(nums,i++,j--);
    }
}
// @lc code=end

