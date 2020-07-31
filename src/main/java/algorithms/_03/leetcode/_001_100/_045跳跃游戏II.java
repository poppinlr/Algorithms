package algorithms._03.leetcode._001_100;

public class _045跳跃游戏II {

    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int count = 1;
        int length = nums.length;
        int max = nums[0] + 1;

        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, i + nums[i] + 1);
            count++;

            if (max >= length) {
                return count;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        _045跳跃游戏II s = new _045跳跃游戏II();


        int t = s.jump(new int[]{2,3,1,1,4});
    }
}
