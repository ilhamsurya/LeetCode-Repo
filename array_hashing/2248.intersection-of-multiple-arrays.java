package array_hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode id=2248 lang=java
 *
 * [2248] Intersection of Multiple Arrays
 */

// @lc code=start
class Solution {
    public List<Integer> intersection(int[][] nums) {
        // Solution by ilham surya 13/06/22
        // HashMap Approach Time O(N) Space O(N)
        int arrCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int[] num : nums) {
            for (int i = 0; i < num.length; i++) {
                if (map.containsKey(num[i])) {
                    map.put(num[i], map.get(num[i]) + 1);
                } else {
                    map.put(num[i], 1);
                }
            }
            arrCount++;
        }

        for (int num : map.keySet()) {
            if (map.get(num) == arrCount) {
                list.add(num);
            }
        }
        Collections.sort(list);
        return list;
    }

}
// @lc code=end
