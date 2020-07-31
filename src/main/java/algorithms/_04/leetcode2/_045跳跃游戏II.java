package algorithms._04.leetcode2;

import java.util.Arrays;

public class _045跳跃游戏II {
    public int jump(int[] nums) {
        int[] steps = new int[nums.length];
        Arrays.fill(steps, Integer.MAX_VALUE);
        steps[0] = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= i + nums[i]&& j < nums.length; j++) {
                steps[j] = Math.min(steps[i]+1, steps[j]);
            }
        }

        return steps[steps.length - 1];
    }

    public static void main(String[] args) {
        _045跳跃游戏II s = new _045跳跃游戏II();
        s.jump(new int[]{1,2,1,1,1});
    }
}
