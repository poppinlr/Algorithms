package algorithms._03.leetcode._001_100;

import edu.princeton.cs.algs4.StdOut;

public class _029两数相除 {
    public int divide(int dividend, int divisor) {
        long dividendl = dividend;
        long divisorl = divisor;
        if (dividendl == 0) {
            return 0;
        }



        boolean flag = true;
        if (dividendl > 0 && divisorl > 0) {
        } else if (dividendl > 0 && divisorl < 0) {
            flag = false;
            divisorl = -divisorl;
        } else if (dividendl < 0 && divisorl < 0) {
            dividendl = -dividendl;
            divisorl = -divisorl;
        } else {
            dividendl = -dividendl;
            flag = false;
        }

//        if()

        int count = 0;
        while (dividendl >= divisorl) {
            count++;
            dividendl = dividendl - divisorl;
        }

        if (flag) {
            return count;
        } else {
            return -count;
        }
    }

    public static void main(String[] args) {
//        _029两数相除 s = new _029两数相除();
//        s.divide(-1, 1);
        StdOut.println(Integer.MIN_VALUE/1);
        StdOut.println(Integer.MIN_VALUE/-1);

    }
}
