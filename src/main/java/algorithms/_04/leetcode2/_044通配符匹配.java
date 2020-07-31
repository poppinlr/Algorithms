package algorithms._04.leetcode2;

public class _044通配符匹配 {
    /**
     * '?' 可以匹配任何单个字符。
     * '*' 可以匹配任意字符串（包括空字符串）。
     *
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch(String s, String p) {
        if (p.length() == 0) {
            return s.length() == 0;
        }

        boolean isMatch = !s.isEmpty()&&(s.charAt(0)==p.charAt(0) || p.charAt(0)=='?');

        if (p.charAt(0) == '*') {
            return isMatch(s, p.substring(1)) || isMatch(s.substring(1), p);
        } else {
            return isMatch;
        }
    }
}
