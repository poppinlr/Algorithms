package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _152乘积最大子数组 {

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        List<Integer> list = new ArrayList<>();
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            List<Integer> newList = new ArrayList<>();
            newList.add(nums[i]);
            max = Math.max(max, nums[i]);
            for (int j = 0; j < list.size(); j++) {
                max = Math.max(max, nums[i] * list.get(j));
                newList.add(nums[i] * list.get(j));
            }

            list = newList;
        }

        return max;
    }

    public static void main(String[] args) {
        _152乘积最大子数组 s = new _152乘积最大子数组();
        s.maxProduct(new int[]{2, 3, -2, 4});
    }
}
