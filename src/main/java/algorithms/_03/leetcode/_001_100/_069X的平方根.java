package algorithms._03.leetcode._001_100;

public class _069X的平方根 {
    public int mySqrt(int x) {
        long lo = 0;
        long hi = x;

        while (lo <= hi) {//core
            long mid = lo + (hi-lo)/2;
            long sqrt = mid*mid;
            if (sqrt == x) {
                return Long.valueOf(mid).intValue();
            } else if (sqrt < x) {
                lo = mid+1;
            } else {
                hi = mid -1;
            }
        }

        return Long.valueOf(Math.min(lo, hi)).intValue();//core
    }

    public static void main(String[] args) {
        _069X的平方根 s = new _069X的平方根();
        int t = s.mySqrt(8);
    }
}
