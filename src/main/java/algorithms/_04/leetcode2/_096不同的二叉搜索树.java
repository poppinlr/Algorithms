package algorithms._04.leetcode2;

import java.util.HashMap;
import java.util.Map;

public class _096不同的二叉搜索树 {

    Map<Integer, Integer> map = new HashMap<>();

    public int numTrees(int n) {
        map.put(0, 1);
        map.put(1, 1);
        return sum(n);
    }

    private int sum(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int sum1 = sum(i - 1);
            int sum2 = sum(n - i);
            sum = sum + sum1 * sum2;
        }
        map.put(n, sum);
        return sum;
    }

    public static void main(String[] args) {
        _096不同的二叉搜索树 s = new _096不同的二叉搜索树();
        int t = s.numTrees(3);
    }
}
