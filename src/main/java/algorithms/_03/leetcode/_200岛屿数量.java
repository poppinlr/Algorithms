package algorithms._03.leetcode;

import java.util.Arrays;

public class _200岛屿数量 {

    private int[] init;
    private int count;

    private void union(int i, int j) {
        if (init[i] != init[j]) {
            for (int k = 0; k < init.length; k++) {
                if (init[k] == init[i]) {
                    init[k] = init[j];
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        if (grid.length > 0 && grid[0].length > 0) {
            int height = grid.length;
            int weight = grid[0].length;
            init = new int[height * weight];
            for (int i = 0; i < height * weight; i++) {
                init[i] = i;
            }

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < weight; j++) {
                    if (grid[i][j] == '1') {
                        if ((j - 1 >= 0) && grid[i][j - 1] == grid[i][j]) {//向左连接
                            union(i * weight + j, i * weight + j - 1);
                        }  if ((j + 1 < weight) && grid[i][j + 1] == grid[i][j]) {//向右
                            union(i * weight + j, i * weight + j + 1);
                        }  if ((i - 1 >= 0) && grid[i - 1][j] == grid[i][j]) {//向上
                            union( i * weight + j,(i - 1) * weight + j);
                        }  if ((i + 1 < height) && grid[i + 1][j] == grid[i][j]) {//向下
                            union(i * weight + j, (i + 1) * weight + j);
                        }
                    } else {
                        init[i * weight + j] = -1;
                    }
                }
            }
            int i = -1;
            Arrays.sort(init);
            for (int j = 0; j < init.length; j++) {
                if (init[j] != -1) {
                    if (init[j] != i) {
                        count++;
                        i = init[j];
                    }
                }
            }
        }


        return count;
    }
}
