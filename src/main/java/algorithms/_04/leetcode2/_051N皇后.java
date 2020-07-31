package algorithms._04.leetcode2;

import java.util.ArrayList;
import java.util.List;

public class _051N皇后 {

    List<List<String>> r = new ArrayList<>();
    List<List<String>> R = new ArrayList<>();
    private int n;

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        recursive();
        return R;
    }

    private void recursive() {
        if (r.size() == n) {
            R = new ArrayList<>(r);
            return;
        }
        //loop
        for (int i = 0; i < n; i++) {
            //add
            if (!legal(i)) {
                continue;
            }
            List<String> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    list.add("Q");
                } else {
                    list.add(".");
                }
            }
            r.add(list);
            //recursive
            recursive();
            //remove
            r.remove(r.size() - 1);
        }
    }

    private boolean legal(int i) {
        int left = i;
        int right = i;
        for (int j = r.size() - 1; j >= 0; j--) {
            boolean isMarked1 = "Q".equals(r.get(j).get(i));
            if (isMarked1) {
                return false;
            }

            if (left > 0 && "Q".equals(r.get(j).get(--left))) {
                return false;
            }

            if (right < n - 1 && "Q".equals(r.get(j).get(++right))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        _051N皇后 s = new _051N皇后();
        s.solveNQueens(4);
    }
}
