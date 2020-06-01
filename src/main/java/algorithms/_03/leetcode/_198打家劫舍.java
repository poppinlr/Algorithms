package algorithms._03.leetcode;

public class _198打家劫舍 {

    public int rob(int[] nums) {

        int[] money = new int[nums.length];
        money[0] = nums[0];
        money[1] = Math.max(nums[1], nums[0]);
        for (int i = 2; i < nums.length; i++) {
            money[i] = Math.max(money[i - 1], money[i - 2] + nums[i]);
        }

        return money[nums.length - 1];
    }


    public static void main(String[] args) {
        _198打家劫舍 s = new _198打家劫舍();
        s.rob(new int[]{2, 7, 9, 3, 1});
    }
}
