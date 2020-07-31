package algorithms._03.leetcode._701_800;

public class _790多米诺和托米诺平铺 {
    public int numTilings(int N) {
        long[][] dp = new long[N + 1][3];
        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[0][2] = 0;

        dp[1][0] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;
        for (int i = 2; i < N; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0] + dp[i - 1][1] + dp[i - 1][2];
            dp[i][1] = dp[i - 2][0] + dp[i - 1][2];
            dp[i][2] = dp[i - 2][0] + dp[i - 2][1];
        }
        return (int) (dp[N][0] % (Math.pow(10, 9) + 7));
    }
}


