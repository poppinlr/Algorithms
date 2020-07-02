package algorithms._03.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _159至多包含两个不同字符的最长子串 {

    Map<Character, Integer> map = new HashMap<>();
    private String s = null;
    int max = 0;

    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s == null) {
            return 0;
        }

        if (s.length() <= 2) {
            return s.length();
        }
        this.s = s;
        int i = 0;
        int j = 1;
        put(i);
        put(j);

        while (j < s.length()-1) {
            j++;
            put(j);
            if (map.keySet().size() <= 2) {
                max = Math.max(max, j - i + 1);
            } else {
                max = Math.max(max, j - i);
                remove(i);
                i++;
            }

        }

        return max;
    }

    private void put(int i) {
        char c = s.charAt(i);
        if (map.containsKey(c)) {
            map.put(c, map.get(c) + 1);
        } else {
            map.put(c, 1);
        }
    }

    private void remove(int i) {
        char c = s.charAt(i);
        if (map.get(c) == 1) {
            map.remove(c);
        } else {
            map.put(c, map.get(c) - 1);
        }
    }

    public static void main(String[] args) {
        _159至多包含两个不同字符的最长子串 s = new _159至多包含两个不同字符的最长子串();
        int t = s.lengthOfLongestSubstringTwoDistinct("abc");
    }
}
