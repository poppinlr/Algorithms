package algorithms._03.leetcode;

public class _153寻找旋转排序数组中的最小值 {
    public int findMin(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i + 1]) {
                return nums[i + 1];
            }
        }

        return 0;
    }
}
