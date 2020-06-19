package algorithms._03.leetcode;

public class _060第k个排列 {

    private int k = 0;
    private int[] nums;

    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();

        int count = 0;
        while (count <= k) {
            boolean[] marked = new boolean[n];
            sb = new StringBuilder();
            while (n > 0) {
                for (int i = 1; i <= n; i++) {
                    if (!marked[i - 1]) {
                        sb.append(i);
                        marked[i - 1] = true;
                    } else {
                        continue;
                    }
                }
                n--;
            }

            count++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        _060第k个排列 s = new _060第k个排列();
        s.getPermutation(3, 3);
    }
}
