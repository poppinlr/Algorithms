package algorithms._04.leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _018四数之和 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> r = new ArrayList<>();
        for (int i1 = 0; i1 < nums.length - 3; i1++) {
            if (i1 > 0 && nums[i1] == nums[i1 - 1]) {
                continue;
            }
            for (int i2 = i1 + 1; i2 < nums.length - 2; i2++) {
                if (i2 > i1 && nums[i2] == nums[i2 - 1]) {
                    continue;
                }

                int left = i2 + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i1] + nums[i2] + nums[left] + nums[right];
                    if (sum == target) {
                        r.add(List.of(nums[i1], nums[i2], nums[left], nums[right]));
                        //TODO 还要继续找
                        left++;
                        right--;
                        while (left - 1 >i2 && nums[left] == nums[left -1]) {
                            left++;
                        }
                        while (left < right - 1 && nums[right] == nums[right - 1]) {
                            right--;
                        }
                    } else if (sum < target) {
                        left++;
                        while (left - 1 >i2 && nums[left] == nums[left -1]) {
                            left++;
                        }
                    } else {
                        right--;
                        while (left < right - 1 && nums[right] == nums[right - 1]) {
                            right--;
                        }
                    }
                }

            }
        }

        return r;
    }

    public static void main(String[] args) {
        _018四数之和 s = new _018四数之和();
        List<List<Integer>> r = s.fourSum(new int[]{-2, -1, 0, 0, 1, 2}, 0);
    }
}
