package algorithms._03.leetcode._001_100;

import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.List;

public class _051N皇后 {

    int N;
    List<List<String>> board = new ArrayList<>();
    List<List<String>> r = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        this.N = n;

        //init board with "."
        for (int i = 0; i < n; i++) {
            board.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                board.get(i).add(".");
            }
        }

        //recursive
        queen(0);
        printQ();
        return r;
    }

    private void queen(int row) {
        if (row == this.N) {
            //add new plan to r
            List<String> rSub = new ArrayList<>();
            for (List<String> l : board) {
                rSub.add(String.join("", l));
            }
            r.add(rSub);
            return;
        }

        //loop
        for (int col = 0; col < this.N; col++) {
            if (legal(row, col)) {
                //try
                board.get(row).set(col, "Q");
                //recursive
                queen(row + 1);
                //backtrack
                board.get(row).set(col, ".");
            } else {
                continue;
            }
        }
    }

    private boolean legal(int row, int col) {
        //col
        for (int i = 0; i < row; i++) {
            if (board.get(i).get(col).equals("Q")) {
                return false;
            }
        }

        //↖
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).get(j).equals("Q")) {
                return false;
            }
        }

        //↗
        for (int i = row, j = col; i >= 0 && j < this.N; i--, j++) {
            if (board.get(i).get(j).equals("Q")) {
                return false;
            }
        }
        return true;
    }

    private void printQ() {
        StdOut.println("------------------------");
        for (List<String> l : board) {
            StdOut.println(String.join(",", l));
        }
    }

    public static void main(String[] args) {
        _051N皇后 n = new _051N皇后();
        n.solveNQueens(4);
    }


}
