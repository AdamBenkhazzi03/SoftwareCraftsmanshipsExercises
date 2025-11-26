package be.ucll.craft.twosums;

import java.util.HashMap;
import java.util.Map;

//This is the naive implementation of the Two Sum problem
// what is the current big O time complexity?
// can you improve it to O(n) time complexity?

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (indices.containsKey(diff) && indices.get(diff) != i) {
                return new int[]{i, indices.get(diff)};
            }
        }

        return new int[0];
    }
}
