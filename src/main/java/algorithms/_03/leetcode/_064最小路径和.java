package algorithms._03.leetcode;

public class _064最小路径和 {

    public int minPathSum(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int y = grid.length;
        int x = grid[0].length;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }

                if (i == 0) {
                    grid[i][j] = grid[i][j] + grid[i][j - 1];
                }

                if (j == 0) {
                    grid[i][j] = grid[i][j] + grid[i-1][j];
                }

                if (i > 0 && j > 0) {
                    grid[i][j] = Math.min(grid[i][j] + grid[i - 1][j], grid[i][j] + grid[i][j - 1]);
                }

            }
        }

        return grid[y - 1][x - 1];
    }

    public static void main(String[] args) {
    }
}
