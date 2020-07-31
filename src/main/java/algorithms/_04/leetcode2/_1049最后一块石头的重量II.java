package algorithms._04.leetcode2;

public class _1049最后一块石头的重量II {

    public int lastStoneWeightII(int[] stones) {
        // /* 由于石头拿走还能放回去，因此可以简单地把所有石头看作两堆
        //  * 假设总重量为 sum, 则问题转化为背包问题：如何使两堆石头总重量接近 sum / 2
        //  */
        // int len = stones.length;
        // /* 获取石头总重量 */
        // int sum = 0;
        // for (int i : stones) {
        //     sum += i;
        // }
        // /* 定义 dp[i] 重量上限为 i 时背包所能装载的最大石头重量 */
        // int maxCapacity = sum/2;
        // int[] dp = new int[maxCapacity + 1];
        // for (int i = 0; i < len; i++) {
        //     int curStone = stones[i];
        //     for (int j = maxCapacity; j >= curStone; j--) {
        //         dp[j] = Math.max(dp[j], dp[j-curStone] + curStone);
        //     }
        // }
        // return sum - 2 * dp[maxCapacity];
        int N = stones.length;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + stones[i];
        }

        int C = sum/2;//为什么要
        int[][] max = new int[N][C+1];//要让C最大值为11， 则需要创建一个长度为C+1的范围，从0开始如果创建范围为C的长度，那么j的最大值就只有10
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < C+1; j++) {
                if (i == 0) {
                    if (stones[i] <= j) {
                        max[i][j] = stones[0];
                    } else {
                        max[i][j] = 0;
                    }
                } else {
                    if (stones[i] <= j) {
                        max[i][j] = Math.max(max[i - 1][j], stones[i] + max[i - 1][j - stones[i]]);
                    } else {
                        max[i][j] = max[i - 1][j];
                    }
                }
            }
        }

        return sum-2*max[N-1][C];

    }

    public static void main(String[] args) {
        _1049最后一块石头的重量II s = new _1049最后一块石头的重量II();
        s.lastStoneWeightII(new int[]{2, 7, 4, 1, 8, 1});
    }
}
