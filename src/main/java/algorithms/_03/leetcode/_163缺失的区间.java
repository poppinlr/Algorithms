package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _163缺失的区间 {

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {

        int start = 0;
        while (nums[start] <= lower) {
            start++;
            if (start == nums.length) {
                return new ArrayList<>();
            }
        }

        start = start--;


        return new ArrayList<>();
    }
}
