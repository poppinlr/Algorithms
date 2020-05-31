package algorithms._03.leetcode;

import java.util.Arrays;

public class _016最接近的三数之和 {

    public int threeSumClosest(int[] nums, int target) {
        //sum <0 L++;
        //sum >0 R--;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int L = i + 1;
            int R = nums.length - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];

                if (sum == target) {
                    min = sum;
                    break;
                } else if (sum < target) {
                    L++;
                } else {
                    R--;
                }

                if (Math.abs(target - sum) < Math.abs(target - min)) {
                    min = sum;
                }
            }
        }

        return min;
    }

    public static void main(String[] args) {
        _016最接近的三数之和 s = new _016最接近的三数之和();
        int i = s.threeSumClosest(new int[]{-3,-2,-5,3,4}, -1);
    }
}
