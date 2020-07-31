package algorithms._03.leetcode._201_300;

public class _238除自身以外数组的乘积 {

    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;

        int[] l = new int[N];
        int[] r = new int[N];

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                l[i] = 1;
                r[N-1] = 1;
            } else {
                l[i] = nums[i - 1] * l[i - 1];
                r[N-1-i] = nums[N-i] * r[N-i];
            }
        }
        for (int i = 0; i < N; i++) {
            nums[i] = l[i] * r[i];
        }
        return nums;
    }
}
