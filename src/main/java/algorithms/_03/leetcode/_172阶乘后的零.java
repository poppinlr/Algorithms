package algorithms._03.leetcode;

import edu.princeton.cs.algs4.StdOut;

public class _172阶乘后的零 {

    /**
     * 5和任何偶数相乘个位都得0
     * 任何偶数都是2的倍数，并且在阶乘数中2的个数要比5多，因此只要考虑5的个数
     * 所以直接除去得到5的个数
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int count = 0;
        while (n >0) {
            count = count + n / 5;//阶乘, 5的个数累计
            n = n / 5;
        }

        return count;
    }

    public static void main(String[] args) {
        _172阶乘后的零 s = new _172阶乘后的零();
        StdOut.println(s.trailingZeroes(5));
    }
}
