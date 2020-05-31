package algorithms._03.leetcode;

import java.util.Arrays;

public class _031下一个排列 {

    public void nextPermutation(int[] nums) {
        nums = new int[]{1,5,8,4,7,6,5,3,1};

        int N = nums.length;
        boolean isSorted = true;
        for (int i = 0; i < N-1; i++) {
            if (nums[i] < nums[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            Arrays.sort(nums);
            return;
        }

        int lefti = 0;
        for (int i = N - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                lefti = i-1;
                break;
            }
        }

        int righti = 0;
        for (int i = lefti+1; i < N; i++) {
            if (nums[i] > nums[lefti]) {
                righti = i;
            } else {
                break;
            }
        }

        int tmp = nums[righti];
        nums[righti] = nums[lefti];
        nums[lefti] = tmp;

        Arrays.sort(nums, lefti+1, N);
    }
}
