package algorithms._03.leetcode;

public class _M07重建二叉树 {

    private int[][] move = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean[][] marked = new boolean[board.length][board[0].length];
                //find first
                if (dfs(i,j,word, 0, marked, board)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(int i, int j, String word, int wordi, boolean[][] marked, char[][] board) {
        if (wordi == word.length() -1) {
            return board[i][j] == word.charAt(wordi);
        }

        if (board[i][j] == word.charAt(wordi)) {
            marked[i][j] = true;
            for (int k = 0; k < move.length; k++) {
                int iNext = i+ move[k][0];
                int jNext = j + move[k][1];
                if(valid(iNext,jNext,board.length, board[0].length)&&!marked[iNext][jNext]){
                    if (dfs(iNext, jNext, word, wordi + 1, marked, board)) {
                        return true;
                    }

                }
            }
            marked[i][j] = false;
        }

        return false;
    }

    private boolean valid(int i, int j, int length, int length1) {
        return 0 <= i && i < length && 0 <= j && j < length1;
    }

    public static void main(String[] args) {
        _M07重建二叉树 s = new _M07重建二叉树();
        boolean b = s.exist(new char[][]{{'a'},{'a'}}, "aaa");
    }
}
