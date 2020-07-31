package algorithms._04.leetcode2;

public class _079单词搜索 {

    private int[][] target = new int[][]{new int[]{-1, 0}, new int[]{1, 0}
        , new int[]{0, -1}, new int[]{0, 1}};
    private char[][] bord;
    private String word;
    boolean[][] marked;

    public boolean exist(char[][] board, String word) {
        this.bord = board;
        this.word = word;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                marked = new boolean[board.length][board[0].length];
                if (board[i][j] == word.charAt(0)) {
                    if ((dfs(i, j, 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int wordi) {
        //index valid
        if (0 <= i && i < this.bord.length && 0 <= j && j < this.bord[0].length) {
            if (!marked[i][j]) {

                //equal
                if (bord[i][j] == this.word.charAt(wordi)) {
                    marked[i][j] = true;
                    //find
                    if (wordi == this.word.length() - 1) {
                        return true;
                    } else {
                        for (int k = 0; k < target.length; k++) {
                            if(dfs(i + target[k][0], j + target[k][1], wordi + 1)){
                                return true;
                            }
                        }
                    }

                } else {
                    return false;
                }
            }

        } else {
            return false;
        }
        return false;
    }
}
