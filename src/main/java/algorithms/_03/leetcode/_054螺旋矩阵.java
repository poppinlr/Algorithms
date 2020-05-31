package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _054螺旋矩阵 {
    public List<Integer> spiralOrder(int[][] matrix) {

        if (matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }

//        if (matrix.length == 1 && matrix[0].length == 1) {
//            return new ArrayList<>(List.of(matrix[0][0]));
//        }

        int m = matrix.length;
        int n = matrix[0].length;
        int nn = n;
        int mm = m;

        List<Integer> l = new ArrayList<>();
        int row = 0;
        int col = 0;

        while (l.size() < nn * mm) {
            if (l.size() == nn * mm - 1) {
                l.add(matrix[row][col]);
            }
            while (l.size() < nn * mm && col < n - 1) {
                l.add(matrix[row][col]);
                col++;
            }
            while (l.size() < nn * mm && row < m - 1) {
                l.add(matrix[row][col]);
                row++;
            }

            while (l.size() < nn * mm && col > 0) {
                l.add(matrix[row][col]);
                col--;
            }

            while (l.size() < nn * mm && row > 0) {
                l.add(matrix[row][col]);
                row--;
            }
            m = m - 2;
            n = n - 2;
            n--;
            col++;
            row++;
        }

        return l;
    }

    public static void main(String[] args) {
        _054螺旋矩阵 s = new _054螺旋矩阵();
        s.spiralOrder(new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}});
        s.spiralOrder(new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}, new int[]{10, 11, 12}});
        s.spiralOrder(new int[][]{new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}, new int[]{9, 10, 11, 12}});
        s.spiralOrder(new int[][]{new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}, new int[]{9, 10, 11, 12}, new int[]{13, 14, 15, 16}});
        s.spiralOrder(new int[][]{new int[]{1}});
    }
}
