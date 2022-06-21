import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                int res[] = { map.get(diff), i };
                return res;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
// @lc code=end
