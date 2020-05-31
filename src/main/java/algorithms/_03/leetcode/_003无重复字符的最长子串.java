package algorithms._03.leetcode;

public class _003无重复字符的最长子串 {


    public int lengthOfLongestSubstring(String s) {
        int[] m = new int[128];

        int count = 0;
        int i = 0;

        for (int j = 0; j < s.length(); j++) {
            i = Math.max(i, m[s.charAt(j)]);
            m[s.charAt(j)] = j + 1;
            count = Math.max(count, j - i + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        _003无重复字符的最长子串 s = new _003无重复字符的最长子串();
        int c = s.lengthOfLongestSubstring("dvdf");
        System.out.println(c);
    }
}
