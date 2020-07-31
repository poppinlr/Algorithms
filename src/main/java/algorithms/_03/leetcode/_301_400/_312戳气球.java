package algorithms._03.leetcode._301_400;

public class _312戳气球 {

    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] numsNew = new int[n + 2];
        for (int i = 0; i < n + 2; i++) {
            if (i == 0) {
                numsNew[i] = 1;
            } else if (i == n + 1) {
                numsNew[i] = 1;
            } else {
                numsNew[i] = nums[i];
            }
        }

        int[][] dp = new int[n + 2][n + 2];
        // len表示开区间长度
        for (int len = 3; len <= n + 2; len++) {
            // i表示开区间左端点
            for (int i = 0; i <= n + 2 - len; i++) {
                int res = 0;
                // k为开区间内的索引
                for (int k = i + 1; k < i + len - 1; k++) {
                    int left = dp[i][k];
                    int right = dp[k][i + len - 1];
                    res = Math.max(res, left + numsNew[i] * numsNew[k] * numsNew[i + len - 1] + right);
                }
                dp[i][i + len - 1] = res;
            }
        }
        return dp[0][n + 1];

    }
}
