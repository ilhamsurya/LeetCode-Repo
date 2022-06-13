package greedy;

/*
 * @lc app=leetcode id=134 lang=java
 *
 * [134] Gas Station
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // Solution by ilham surya 13/06/22
        // Greedy Approach Time O(N), Space O(1)

        int tank = 0;
        // Simulate the travel by estimating the fuel usage
        for (int i = 0; i < cost.length; i++) {
            tank += gas[i] - cost[i];
        }
        // if the fuel is negative, then the travel not possible. so return -1
        if (tank < 0) {
            return -1;
        }

        int start = 0;
        int distanceTraveled = 0;

        for (int i = 0; i < cost.length; i++) {
            int currentDistance = gas[i] - cost[i];
            // if the current travel have negative value, then move to next station
            if (distanceTraveled + currentDistance < 0) {
                start = i + 1;
                distanceTraveled = 0;
            } else {
                distanceTraveled += currentDistance;
            }
        }
        return start;

    }
}
// @lc code=end
