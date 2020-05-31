package algorithms._03.leetcode;

import java.util.HashMap;

/**
 * 其实就是找两个重复字段中最长的子字符串
 * 如果不是再中间j++
 */
public class _M024无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        char[] sChar = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            char c = sChar[i];
            if (map.containsKey(c)) {
                max = Math.max(max, map.get(c) - i);

                j = 1;
            } else {
                j++;
                max = Math.max(max, j);
            }
            map.put(sChar[i], i);

        }

        return max;
    }

    public static void main(String[] args) {
        _M024无重复字符的最长子串 s = new _M024无重复字符的最长子串();
        int l = s.lengthOfLongestSubstring("dvdf");

    }
}
