package algorithms._03.leetcode;

public class _036有效的数独 {

    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] box = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int num = board[i][j] - '1';
                if (num >= 0 && num < 9) {
                    if (row[i][num] == 1 || col[j][num] == 1 || box[i / 3 * 3 + j / 3][num] == 1) {
                        return false;
                    }
                    row[i][num] = 1;
                    col[j][num] = 1;
                    box[(i / 3) * 3 + j / 3][num] = 1;
                } else {
                    return false;
                }

            }
        }

        return true;
    }
}
