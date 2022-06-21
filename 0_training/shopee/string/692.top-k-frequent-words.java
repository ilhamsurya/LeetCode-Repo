import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode id=692 lang=java
 *
 * [692] Top K Frequent Words
 */

// @lc code=start
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // Solution By Ilham Surya 20/06/22
        // HashMap Approach Time O(N), Space O(N)
        HashMap<String, Integer> map = new HashMap<>();
        int count, count2 = 0;
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        List<String> result = new ArrayList<>(map.keySet());

        // Sorting will compare the frequency first,
        // if it the same then sort it basend on lexicographically
        // else sort it from bigger frequency
        Collections.sort(
                result,
                (w1, w2) -> map.get(w1).equals(map.get(w2)) ? w1.compareTo(w2) : map.get(w2) - map.get(w1));

        return result.subList(0, k);
    }
}
// @lc code=end
