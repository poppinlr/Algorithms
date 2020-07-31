package algorithms._04.leetcode2;

import java.util.ArrayList;
import java.util.List;

public class _163缺失的区间 {

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {

        List<String> r = new ArrayList<>();
        int numsI = 0;
        int lo = lower;
        int hi = upper;
        for (int i = lower; i <= upper; i++) {
            if (nums[numsI] == nums[i]) {
                numsI++;
            } else {
                lo = i;
                for (int j = i; j <= upper; j++) {
                    if (nums[numsI] == nums[j]) {
                        numsI++;
                    } else {
                        hi = j - 1;
                        if (hi == lo) {
                            r.add("" + lo);
                        } else {
                            r.add(lo + "->" + hi);
                        }
                        break;
                    }
                }
            }
        }

        return r;
    }

    public static void main(String[] args) {
        _163缺失的区间 s = new _163缺失的区间();
        s.findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99);
    }
}
