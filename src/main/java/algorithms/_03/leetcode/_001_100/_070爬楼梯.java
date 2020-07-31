package algorithms._03.leetcode._001_100;

public class _070爬楼梯 {

//    /**
//     *  recursive
//     * @param n
//     * @return
//     */
//    public int climbStairs(int n) {
//        if (n <= 2) {
//            return n;
//        }
//        return climbStairs(n - 1) + climbStairs(n - 2);
//    }

//    /**
//     * dp
//     * O(n), O(n)
//     * @param n
//     * @return
//     */
//    public int climbStairs(int n) {
//        int[] dp = new int[n];
//        dp[0] = 1;
//        dp[1] = 1;
//        for (int i = 2; i < n; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//
//        return dp[n - 1];
//    }

    /**
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        int dp1 = 1;
        int dp2 = 1;
        for (int i = 2; i < n; i++) {
            int tmp = dp1 + dp2;
            dp1 = dp2;
            dp2 = tmp;
        }

        return dp2;
    }

    public static void main(String[] args) {
        _070爬楼梯 s = new _070爬楼梯();
        int c = s.climbStairs(3);
        int c2 = s.climbStairs(4);
    }
}
