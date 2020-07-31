package algorithms._03.leetcode._001_100;

public class _055跳跃游戏 {

    public boolean canJump(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            length = Math.max(length, i + nums[i]);
            if (length <= i) {
                return i == nums.length - 1;
            }
        }
        return length >= nums.length - 1;
    }
}
