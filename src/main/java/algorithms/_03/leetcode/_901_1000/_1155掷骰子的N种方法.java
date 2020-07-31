package algorithms._03.leetcode._901_1000;

public class _1155掷骰子的N种方法 {

    /**
     *
     *
     *
     * @param d d个骰子
     * @param f f个面
     * @param target 和
     * @return
     */
    public int numRollsToTarget(int d, int f, int target) {
        int[][] dp = new int[d][target];
        for (int i = 0; i < f; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < d; i++) {
            for (int j = 1; j < target; j++) {
                for (int k = j; k <= f; k++) {
                    dp[i][j] = dp[i][j] + dp[i-1][j-k];
                }
            }
        }

        return 0;
    }
}
