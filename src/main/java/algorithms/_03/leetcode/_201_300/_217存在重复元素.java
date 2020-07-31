package algorithms._03.leetcode._201_300;

import java.util.HashSet;
import java.util.Set;

public class _217存在重复元素 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.size() < i + 1) {
                return true;
            }
        }

        return false;
    }
}
