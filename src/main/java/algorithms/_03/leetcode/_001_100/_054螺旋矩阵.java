package algorithms._03.leetcode._001_100;

import java.util.ArrayList;
import java.util.List;

public class _054螺旋矩阵 {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int x = 0;
        int y = 0;

        int top = n;
        int left = m - 1;
        int bottom = n - 2;
        List<Integer> r = new ArrayList<>();
        while (r.size() < m * n) {
            for (int i = 0; i < top; i++) {
                r.add(matrix[x][y]);
                y++;
            }

            y--;
            for (int i = 0; i < left; i++) {
                x++;
                r.add(matrix[x][y]);
            }

            for (int i = 0; i < bottom && r.size() < m * n; i++) {
                y--;
                r.add(matrix[x][y]);
            }

            y--;
            for (int i = 0; i < left && r.size() < m * n; i++) {
                r.add(matrix[x][y]);
                x--;
            }
            x++;
            y++;

            top = top - 2;
            left = left - 2;
            bottom = bottom - 2;
        }

        return r;
    }

    public static void main(String[] args) {
        _054螺旋矩阵 s = new _054螺旋矩阵();
//        s.spiralOrder(new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}});
//        s.spiralOrder(new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}, new int[]{10, 11, 12}});
//        s.spiralOrder(new int[][]{new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}, new int[]{9, 10, 11, 12}});
//        s.spiralOrder(new int[][]{new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}, new int[]{9, 10, 11, 12}, new int[]{13, 14, 15, 16}});
        s.spiralOrder(new int[][]{new int[]{1}, new int[]{2}});
    }
}
