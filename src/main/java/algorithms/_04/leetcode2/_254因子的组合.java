package algorithms._04.leetcode2;

import java.util.ArrayList;
import java.util.List;

public class _254因子的组合 {

    private List<List<Integer>> r = new ArrayList<>();

    public List<List<Integer>> getFactors(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                loop(n, n / i, i, i, list);
            }

        }

        return r;
    }

    private void loop(int n, int leftN, int i, int left, List<Integer> list) {
        if (i * left == n) {
            r.add(new ArrayList<>(list));
        }
        for (int j = 2; j < leftN; j++) {
            if (leftN % i == 0) {
                //
                list.add(j);
                loop(leftN, leftN / i, j, left * j, list);
                list.remove(list.size() - 1);
            }
        }
    }
}
