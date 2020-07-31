package algorithms._03.leetcode._101_200;

import edu.princeton.cs.algs4.StdOut;

public class _190颠倒二进制位 {

    public int reverseBits(int n) {
        int r = 0;
        for (int i = 31; i >= 0; i--) {
            r = r + ((n & 1) << i);
            n = n >> 1;
        }

        return r;
    }

    public static void main(String[] args) {
        StdOut.println(1>>1);
        StdOut.println(0>>1);
    }
}
