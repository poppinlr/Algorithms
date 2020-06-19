package algorithms._03.leetcode;

public class _074搜索二维矩阵 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int y = matrix.length;
        int x = matrix[0].length;

        int row = 0;
        for (int i = 0; i < y; i++) {
            if (matrix[i][0] <= target) {
                row = i;
            } else {
                break;
            }
        }

        if (target > matrix[row][x]) {
            return false;
        } else {
            for (int i = 0; i < x; i++) {
                if (target == matrix[row][i]) {
                    return true;
                }
            }
        }

        return false;
    }
}
