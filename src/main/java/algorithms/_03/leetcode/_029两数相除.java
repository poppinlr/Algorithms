package algorithms._03.leetcode;

import edu.princeton.cs.algs4.StdOut;

public class _029两数相除 {
    public int divide(int dividend, int divisor) {
        boolean flag = true;

        if (dividend >= 0 && divisor > 0) {

        } else if (dividend > 0 && divisor < 0) {
            divisor = -divisor;
            flag = false;
        } else if (dividend < 0 && divisor > 0) {
            dividend = -dividend;
            flag = false;
        } else {
            dividend = -dividend;
            divisor = -divisor;
        }

        int count = 0;
        while (dividend > divisor) {
            count++;
            dividend = dividend - divisor;
        }

        if (flag) {
            return count;
        } else {
            return -count;
        }
    }

    public static void main(String[] args) {
        _029两数相除 s = new _029两数相除();
//        s.divide(-2147483648, -1);

        StdOut.println(Integer.MAX_VALUE);
        StdOut.println(Integer.MIN_VALUE);
    }
}
