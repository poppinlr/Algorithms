package algorithms._03.leetcode;

public class _059螺旋矩阵II {
    public int[][] generateMatrix(int n) {
        if (n == 0) {
            return null;
        }
        int[][] r = new int[n][n];

        int l1 = n;
        int l2 = n - 2;
        int count = 0;
        int x = 0;
        int y = 0;

        while (count < n * n) {
            for (int i = 0; i < l1 && count < n * n; i++) {
                r[x][y++] = ++count;
            }
            y--;
            for (int i = 0; i < l2 && count < n * n; i++) {
                r[++x][y] = ++count;
            }
            x++;
            for (int i = 0; i < l1 && count < n * n; i++) {
                r[x][y--] = ++count;
            }

            y++;
            for (int i = 0; i < l2 && count < n * n; i++) {
                r[--x][y] = ++count;
            }
            y++;

            l1 = l1 - 2;
            l2 = l2 - 2;
        }

        return r;
    }

    public static void main(String[] args) {
        _059螺旋矩阵II s = new _059螺旋矩阵II();
        s.generateMatrix(4);
    }
}
