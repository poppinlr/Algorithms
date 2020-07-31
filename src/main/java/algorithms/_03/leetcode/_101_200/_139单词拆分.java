package algorithms._03.leetcode._101_200;

import java.util.List;

public class _139单词拆分 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n + 1; j++) {
                if (dp[i] && wordDict.contains(s.substring(i + 1, j))) {
                    dp[j] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        _139单词拆分 s = new _139单词拆分();
        s.wordBreak("leetcode", List.of("leet", "code"));
    }
}
