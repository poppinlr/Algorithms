package algorithms._03.leetcode;

public class _322零钱兑换 {

    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        //初始化每个dp为amount+1, 比最大可能的数大1
        for (int i = 0; i < amount + 1; i++) {
            dp[i] = amount + 1;
        }
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] < 0) continue;
                //dp[i - coins[j]] ==11 , dp[i - coins[j]]+1=12, Min = 11
                dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
            }
        }

        return (dp[amount] == amount + 1) ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        _322零钱兑换 s = new _322零钱兑换();
        s.coinChange(new int[]{2, 4}, 10);
    }
}
