package algorithms._03.leetcode._101_200;

public class _121买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] buy = new int[n];
        int[] sell = new int[n];
        //初始第一天的收益
        buy[0] = -prices[0];
        sell[0] = 0;
        //
        for (int i = 1; i < n; i++) {
            //买入
            buy[i] = Math.max(-prices[i], buy[i - 1]);
            //卖出
            sell[i] = Math.max(prices[i] + buy[i - 1], sell[i - 1]);
        }

        return sell[n - 1];
    }

    public static void main(String[] args) {
        _121买卖股票的最佳时机 s = new _121买卖股票的最佳时机();
        s.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }
}
