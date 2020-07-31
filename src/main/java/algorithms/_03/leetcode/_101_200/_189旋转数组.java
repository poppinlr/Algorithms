package algorithms._03.leetcode._101_200;

public class _189旋转数组 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int from, int end) {
        while (from <= end) {
            int tmp = nums[end];
            nums[end] = nums[from];
            nums[from] = tmp;

            from++;
            end--;
        }
    }
}
