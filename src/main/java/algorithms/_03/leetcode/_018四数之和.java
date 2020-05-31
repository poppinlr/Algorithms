package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _018四数之和 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> r = new ArrayList<>();

        if (nums == null || nums.length < 4) {
            return r;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            int a = nums[i];

            //core
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                //core
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int b = nums[j];

                int L = j + 1;
                int R = nums.length - 1;
                while (L < R) {
                    int sum = a + b + nums[L] + nums[R];
                    if (sum == target) {
                        r.add(List.of(a, b, nums[L], nums[R]));
                        //core
                        while (L < R && nums[L] == nums[L + 1]) L++;
                        while (L < R && nums[R] == nums[R - 1]) R--;
                        L++;
                        R--;
                    } else if (sum < target) {
                        while (L < R && nums[L] == nums[L + 1]) L++;
                        L++;
                    } else {
                        while (L < R && nums[R] == nums[R - 1]) R--;
                        R--;
                    }
                }
            }
        }

        return r;
    }

    public static void main(String[] args) {
        _018四数之和 s = new _018四数之和();
        List<List<Integer>> r = s.fourSum(new int[]{1,-2,-5,-4,-3,3,3,5}, -11);
    }
}
