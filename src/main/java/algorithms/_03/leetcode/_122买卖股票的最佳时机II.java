package algorithms._03.leetcode;

public class _122买卖股票的最佳时机II {

    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length-1; i++) {
            res = res + Math.max(prices[i + 1] - prices[i], 0);
        }

        return res;
    }


}
