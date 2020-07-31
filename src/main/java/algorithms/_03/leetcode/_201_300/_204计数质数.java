package algorithms._03.leetcode._201_300;

public class _204计数质数 {

    public int countPrimes(int n) {
        int[] marked = new int[n + 1];

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (marked[i] == 0) {
                for (int j = i; i * j <= n; j++) {
                    marked[i * j] = 1;
                }
            } else {
                continue;
            }
        }

        int count = 0;
        for (int i = 2; i <=n; i++) {
            if(marked[i]==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        _204计数质数 s = new _204计数质数();
        int t = s.countPrimes(10);
    }
}
