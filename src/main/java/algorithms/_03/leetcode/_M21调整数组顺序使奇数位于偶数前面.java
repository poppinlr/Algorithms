package algorithms._03.leetcode;

public class _M21调整数组顺序使奇数位于偶数前面 {

    public int[] exchange(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while (i < j) {
            while (i < j&&nums[i] % 2 == 1) {
                i++;
            }

            while (i < j&&nums[j] % 2 == 0) {
                j--;
            }

            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        return nums;
    }

    public static void main(String[] args) {
        _M21调整数组顺序使奇数位于偶数前面 s = new _M21调整数组顺序使奇数位于偶数前面();
        int[] n = s.exchange(new int[]{1, 3, 5});

    }
}
