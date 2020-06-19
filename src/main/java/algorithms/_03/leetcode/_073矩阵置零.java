package algorithms._03.leetcode;

import edu.princeton.cs.algs4.StdOut;

public class _073矩阵置零 {
    public void setZeroes(int[][] matrix) {
        if (matrix != null) {
            int x = matrix.length;
            if (x > 0) {
                int y = matrix[0].length;

                int[] x0 = new int[x];
                int[] y0 = new int[y];

                for (int i = 0; i < x ; i++) {
                    for (int j = 0; j < y ; j++) {
                        if (matrix[i][j] == 0) {
                            x0[i] = 1;
                            y0[j] = 1;
                        }
                    }

                }

                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < y; j++) {
                        if (x0[i] == 1 || y0[j] == 1) {
                            matrix[i][j] = 0;
                        }
                    }
                }
                StdOut.println("");
            }
        }
    }

    public static void main(String[] args) {
        _073矩阵置零 s = new _073矩阵置零();
        s.setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }
}
