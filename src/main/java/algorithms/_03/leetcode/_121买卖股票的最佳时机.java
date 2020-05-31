package algorithms._03.leetcode;

public class _121买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        if(prices.length > 0){
            int N = prices.length;
            int sell = 0;
            int min = prices[0];
            for (int i = 0; i < N; i++) {
                if(prices[i]< min){
                    min = prices[i];
                }
                sell = Math.max(sell, prices[i] - min);
            }
            return sell;
        } else {
            return 0;
        }


    }
}
