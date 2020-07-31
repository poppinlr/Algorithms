package algorithms._03.leetcode._101_200;

public class _188买卖股票的最佳时机IV {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n <= 1) {
            return 0;
        }

        if (k >= n / 2) {
            int[][] dp = new int[n][2];
            dp[0][0] = 0;
            dp[0][1] = -prices[0];

            for (int i = 1; i < n; i++) {
                dp[i][0] = Math.max(dp[i - 1][1] + prices[i], dp[i - 1][0]);
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            }

            return dp[n - 1][0];
        }


        int[][][] dp = new int[n][k][2];
        dp[0][0][0] = 0;
        dp[0][0][1] = -prices[0];

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j][0] = Math.max(dp[i - 1][j][1] + prices[i], dp[i - 1][j][0]);
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
            }
        }

        return dp[n - 1][k][0];
    }
}
