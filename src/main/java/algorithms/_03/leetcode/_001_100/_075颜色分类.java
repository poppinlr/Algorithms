package algorithms._03.leetcode._001_100;

public class _075颜色分类 {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int index = 0;
        for (int i = 0; i < count[0]; i++) {
            nums[index++] = 0;
        }
        for (int i = 0; i < count[1]; i++) {
            nums[index++] = 1;
        }
        for (int i = 0; i < count[2]; i++) {
            nums[index++] = 2;
        }
    }

    private void exch(int[] nums, int lo, int hi) {
        int tmp = nums[lo];
        nums[lo] = nums[hi];
        nums[hi] = tmp;
    }
}
