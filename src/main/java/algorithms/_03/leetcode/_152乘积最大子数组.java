package algorithms._03.leetcode;

import java.util.Arrays;

public class _152乘积最大子数组 {

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int[] numMax = new int[nums.length];
        int[] numMin = new int[nums.length];
        numMax[0] = nums[0];
        numMin[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int max = numMax[i - 1];
            int min = numMin[i - 1];
            int num = nums[i];
            if (nums[i - 1] == 0) {
                numMax[i] = num;
                numMin[i] = num;
            } else {
                numMax[i] = Math.max(Math.max(num, max * num), min * num);
                numMin[i] = Math.min(Math.min(num, max * num), min * num);
            }
        }
        Arrays.sort(numMax);
        return numMax[numMax.length - 1];
    }

    public static void main(String[] args) {
        _152乘积最大子数组 s = new _152乘积最大子数组();
        s.maxProduct(new int[]{2, 3, -2, 4, -8, 0, 100, 2});
    }
}
