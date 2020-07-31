package algorithms._03.leetcode._001_100;

public class _063不同路径II {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0) {
            return 0;
        }

        int y = obstacleGrid.length;
        int x = obstacleGrid[0].length;

        if (obstacleGrid[0][0] == 1) {
            return 0;
        } else {
            obstacleGrid[0][0] = 1;
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }

                if (obstacleGrid[i][j] == 0) {
                    if (i == 0) {
                        obstacleGrid[i][j] = obstacleGrid[i][j-1];
                    } else if (j == 0) {
                        obstacleGrid[i][j] = obstacleGrid[i-1][j];
                    } else {
                        obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                    }

                } else {
                    obstacleGrid[i][j] = 0;
                }
            }
        }

        return obstacleGrid[y - 1][x - 1];
    }

    public static void main(String[] args) {
        _063不同路径II s = new _063不同路径II();
        int t = s.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}});
    }
}
