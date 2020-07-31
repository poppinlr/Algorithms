package algorithms._03.leetcode._001_100;

public class _048旋转图像 {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][n - 1 - i];
                matrix[n - 1 - j][n - 1 - i] = tmp;
            }
        }

        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        _048旋转图像 s = new _048旋转图像();
        s.rotate(new int[][]{new int[]{1,2,3},new int[]{4,5,6},new int[]{7,8,9}});
    }
}
