package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _120三角形最小路径和 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.get(0) == null || triangle.get(0).size() == 0) {
            return 0;
        }

        int[][] dp = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
        for (int i = 0; i < triangle.size(); i++) {
            if (i == 0) {
                dp[0][0] = triangle.get(0).get(0);
            } else {
                for (int j = 0; j < triangle.get(i).size(); j++) {
                    if (j == 0) {
                        dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
                    } else if (j == triangle.get(i).size() - 1) {
                        dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j] + triangle.get(i).get(j), dp[i - 1][j - 1] + triangle.get(i).get(j));
                    }
                }
            }

        }

        int[] d = dp[triangle.size() - 1];
        Arrays.sort(d);
        return d[0];
    }

    public static void main(String[] args) {
        _120三角形最小路径和 s = new _120三角形最小路径和();
        List<List<Integer>> r = new ArrayList<>();
        r.add(List.of(2));
        r.add(List.of(3, 4));
        r.add(List.of(6, 5, 7));
        r.add(List.of(4, 1, 8, 3));
        s.minimumTotal(r);
    }
}
