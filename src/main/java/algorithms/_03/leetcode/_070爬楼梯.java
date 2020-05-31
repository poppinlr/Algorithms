package algorithms._03.leetcode;

public class _070爬楼梯 {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        _070爬楼梯 s = new _070爬楼梯();
        int c = s.climbStairs(3);
        int c2 = s.climbStairs(4);
    }
}
