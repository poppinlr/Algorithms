package algorithms._03.leetcode;

import java.util.Arrays;

public class _1049最后一块石头的重量II {

    public int lastStoneWeightII(int[] stones) {
        stones = new int[]{2, 7, 4, 1, 8, 1};

        int N = stones.length;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + stones[i];
        }

        int C = sum/2;
//        int[][] max = new int[N][C+1];//要让C最大值为11， 则需要创建一个长度为C+1的范围，从0开始如果创建范围为C的长度，那么j的最大值就只有10
//        for (int i = 0; i < N; i++) {
//            for (int j = 1; j < C+1; j++) {
//                if (i == 0) {
//                    if (stones[i] <= j) {
//                        max[i][j] = stones[0];
//                    } else {
//                        max[i][j] = 0;
//                    }
//                } else {
//                    if (stones[i] <= j) {
//                        max[i][j] = Math.max(max[i - 1][j], stones[i] + max[i - 1][j - stones[i]]);
//                    } else {
//                        max[i][j] = max[i - 1][j];
//                    }
//                }
//            }
//        }
//        return sum-2*max[N-1][C];

        int dp[] = new int[C+1];
        for (int i = 0; i < N; i++) {
            for (int j = C; j >=stones[i]; j--) {
                dp[j] = Math.max(dp[i], dp[j-stones[i]]+stones[i]);

            }
        }

        return sum-2*dp[C];
    }
}
