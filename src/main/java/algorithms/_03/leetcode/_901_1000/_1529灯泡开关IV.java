package algorithms._03.leetcode._901_1000;

public class _1529灯泡开关IV {

    public int minFlips(String target) {
        int n = target.length();
        int[] dp = new int[n];
        dp[0] = target.charAt(0) == '0' ? 0 : 1;

        for (int i = 1; i < n; i++) {
            if (target.charAt(i) == target.charAt(i - 1)) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + 1;
            }
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        _1529灯泡开关IV s = new _1529灯泡开关IV();
        int t = s.minFlips("001011101");
    }
}
