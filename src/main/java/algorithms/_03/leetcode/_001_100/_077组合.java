package algorithms._03.leetcode._001_100;

import java.util.ArrayList;
import java.util.List;

public class _077组合 {


    int n;
    int k;
    List<List<Integer>> output = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        recursive(1, new ArrayList<>());

        return output;
    }

    private void recursive(int first, ArrayList<Integer> curr) {
        if (curr.size() == k) {
            output.add(new ArrayList<>(curr));
//            return;
        }

        //loop
        for (int i = first; i <= n; i++) {
            curr.add(i);
            //recursive
            recursive(i + 1, curr);
            //backtrack
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {
        _077组合 s = new _077组合();
        List<List<Integer>> l = s.combine(4, 2);
    }
}
