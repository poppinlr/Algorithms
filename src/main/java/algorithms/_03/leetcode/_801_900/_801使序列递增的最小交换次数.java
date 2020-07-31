package algorithms._03.leetcode._801_900;

import java.util.Arrays;

/**
 * 198
 * dp[i][0] 表示不抢劫
 * dp[i][1] 表示抢劫
 */
public class _801使序列递增的最小交换次数 {

    /**
     * dp[i][0] 表示最小交换, without swappingA[i]/B[i]
     * dp[i][1] 表示最小交换, after   swappingA[i]/B[i]
     */

    public int minSwapM(int[] A, int[] B) {
        int[][] dp = new int[A.length][2];
        dp[0][0] = 0;
        dp[0][1] = 1;
        for (int i = 1; i < A.length; i++) {
            dp[i][0] = Integer.MAX_VALUE;
            dp[i][1] = Integer.MAX_VALUE;
            if (A[i] > A[i - 1] && B[i] > B[i - 1]) {
                dp[i][0] = dp[i - 1][0];
                dp[i][1] = dp[i - 1][1] + 1;
            }

            if (A[i] > B[i - 1] && B[i] > A[i - 1]) {
                dp[i][1] = Math.min(dp[i - 1][0] + 1, dp[i][1]);
                dp[i][0] = Math.min(dp[i - 1][1], dp[i][0]);
            }
        }

        return Math.min(dp[A.length - 1][0], dp[A.length - 1][1]);
    }

    public int minSwap(int[] A, int[] B) {
        int n = A.length;
        int[] keep = new int[n];
        int[] swap = new int[n];
        keep[0] = 0;
        swap[0] = 1;
        for (int i = 1; i < n; i++) {
            keep[i] = Integer.MAX_VALUE;
            swap[i] = Integer.MAX_VALUE;
            if (A[i] > A[i - 1] && B[i] > B[i - 1]) {
                keep[i] = keep[i - 1];
                swap[i] = swap[i - 1] + 1;
            }

            if (A[i] > B[i - 1] && B[i] > A[i - 1]) {
                swap[i] = Math.min(keep[i - 1] + 1, swap[i]);
                keep[i] = Math.min(swap[i - 1], keep[i]);
            }
        }

        return Math.min(keep[n - 1], swap[n - 1]);
    }
}
