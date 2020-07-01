package algorithms._03.leetcode;

import java.util.HashMap;
import java.util.Map;

//TODO
public class _076最小覆盖子串 {

    private int count = Integer.MAX_VALUE;
    private String minStr = null;
    private Map<Character, Integer> tMap = new HashMap<>();
    private Map<Character, Integer> sMap = new HashMap<>();

    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }

        for (char c : t.toCharArray()) {
            put(c, tMap);
        }
        int tl = t.length();
        int lo = 0;
        int hi = tl;
        for (int i = 0; i < tl; i++) {
            put(s.charAt(i), sMap);
        }

        while (hi < s.length()) {
            //w contains t
            if (contains()) {
                while (contains()) {

                    remove(s.charAt(lo));
                    lo++;
                    if (hi - lo < count) {
                        count = hi - lo;
                        minStr = s.substring(lo, hi);
                    }
                }
                hi++;
                put(s.charAt(hi - 1), sMap);
            } else {
                hi++;
                put(s.charAt(hi - 1), sMap);
            }
        }
        return minStr;
    }

    private boolean contains() {
        for (Character c : tMap.keySet()) {
            if (!sMap.containsKey(c) || sMap.get(c) < tMap.get(c)) {
                return false;
            }
        }

        return true;
    }

    private void put(Character c, Map<Character, Integer> map) {
        if (map.containsKey(c)) {
            map.put(c, map.get(c) + 1);
        } else {
            map.put(c, 1);
        }
    }

    private void remove(Character c) {
        sMap.put(c, sMap.get(c) - 1);
    }

    public static void main(String[] args) {
        _076最小覆盖子串 s = new _076最小覆盖子串();
        String t = s.minWindow("ADOBECODEBANC", "ABC");
    }
}
