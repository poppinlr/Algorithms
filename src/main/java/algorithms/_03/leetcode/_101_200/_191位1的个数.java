package algorithms._03.leetcode._101_200;

public class _191位1的个数 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 31; i >= 0; i--) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
