package algorithms._03.leetcode.unsolved;

import java.util.Arrays;

public class 和为K的子数组 {

    public int subarraySum(int[] nums, int k) {
        int count = 0;

        int i = 0;
        int j = 0;
        int sum = nums[i];
        int N = nums.length;
        Arrays.sort(nums);
        while (i <= j) {

            if (sum == k) {
                count++;
                if (j + 1 >= N) {
                    return count;
                }
                sum = sum + nums[++j];

            } else if (sum < k) {
                if (j + 1 >= N) {
                    return count;
                }
                sum = sum + nums[++j];

            } else {
                sum = sum - nums[i++];

            }
        }
        return count;

    }

    public static void main(String[] args) {
        和为K的子数组 s = new 和为K的子数组();
        s.subarraySum(new int[]{1, 2, 1,2,1}, 3);
    }
}
