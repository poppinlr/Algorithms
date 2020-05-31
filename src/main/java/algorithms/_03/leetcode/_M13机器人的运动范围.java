package algorithms._03.leetcode;

public class _M13机器人的运动范围 {

    private int m;
    private int n;
    private int k;
    private int count = 0;
    private boolean[][] marked;
    private int[][] move = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        marked = new boolean[m][n];
        dfs(0, 0);
        return count;
    }

    private void dfs(int i, int j) {
        if (isValid(i, j)) {
            marked[i][j] = true;
            count++;
            for (int l = 0; l < move.length; l++) {
                dfs(i+move[l][0], j+move[l][1]);
            }
        } else {
            return;
        }
    }

    private boolean isValid(int i, int j) {
        //位数相加《=k
        if(0 <= i && i < m && 0 <= j && j < n && !marked[i][j]){
            int sum = 0;
            while (!(i==0)){
                sum = sum+i%10;
                i = i/10;
            }

            while (!(j==0)){
                sum = sum+j%10;
                j = j/10;
            }

            return sum <= k;
        }

        return false;
    }

    public static void main(String[] args) {
        _M13机器人的运动范围 s = new _M13机器人的运动范围();
        int c = s.movingCount(38, 15, 9);
    }
}
