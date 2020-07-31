package algorithms._03.leetcode._101_200;

public class _130被围绕的区域 {

    private char[][] board;

    public void solve(char[][] board) {
        this.board = board;
        if (board != null && board.length > 0 && board[0] != null && board[0].length > 0) {
            //围绕四边找到O, 和边相邻的 全部替换成#
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1) {
                        if (board[i][j] == 'O') {
                            dfs(i, j);
                        }
                    }
                }
            }
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == 'O') {
                        board[i][j] = 'X';
                    }
                }
            }

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == '#') {
                        board[i][j] = 'O';
                    }
                }
            }
        }
    }

    private void dfs(int i, int j) {
        if (i >= 0 && i < board.length && j >= 0 && j < board[0].length) {
            if (board[i][j] == 'O') {
                board[i][j] = '#';
                dfs(i - 1, j);
                dfs(i + 1, j);
                dfs(i, j + 1);
                dfs(i, j - 1);
            }
        }
    }
}
