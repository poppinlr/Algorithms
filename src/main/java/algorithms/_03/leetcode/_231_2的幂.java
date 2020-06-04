package algorithms._03.leetcode;

import edu.princeton.cs.algs4.StdOut;

public class _231_2的幂 {

    public boolean isPowerOfTwo(int n) {

        return n>0&&(n & (n - 1)) == 0;
    }

    public static void main(String[] args) {

        StdOut.println(0 ^ 0);//0
        StdOut.println(0 ^ 1);//1
        StdOut.println(1 ^ 1);//0
        StdOut.println(1 ^ 0);//1

        StdOut.println(0 & 0);//0
        StdOut.println(0 & 1);//0
        StdOut.println(1 & 1);//1
        StdOut.println(1 & 0);//0
    }
}
