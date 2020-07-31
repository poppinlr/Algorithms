package algorithms._03.leetcode._001_100;

public class _005最长回文子串 {
    public String longestPalindrome(String s) {
        int max = 1;
        String maxStr = "";
        for (int i = 0; i < s.length(); i++) {
            char begin = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                char end = s.charAt(j);
                if (begin == end) {
                    if (isPalindrome(s.substring(i, j + 1))) {
                        if (j - i + 1 > max) {
                            max = j - i + 1;
                            maxStr = s.substring(i, j + 1);
                        }
                    }
                }
            }
        }

        return maxStr;
    }

    private boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _005最长回文子串 m = new _005最长回文子串();
        m.longestPalindrome("cbbd");

//        StdOut.println("bb".substring(0, 0));
    }
}
