package algorithms._03.leetcode._701_800;

public class _714买卖股票的最佳时机含手续费 {

    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        if (n < 1) {
            return 0;
        }
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[1][0] = Math.max(dp[0][0], dp[0][1] + prices[1]);
        dp[1][1] = Math.max(dp[0][1], dp[1][0] - prices[1]);

        for (int i = 2; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][1] + prices[i], dp[i - 1][0]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 2][0] - prices[i]);
        }

        return dp[n - 1][0];
    }
}
