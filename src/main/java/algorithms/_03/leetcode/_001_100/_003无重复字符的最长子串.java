package algorithms._03.leetcode._001_100;

import java.util.HashMap;
import java.util.Map;

public class _003无重复字符的最长子串 {


    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();

        int max = 0;
        int i = 0;
        map.put(s.charAt(0), 0);
        for (int j = 0; j < s.length(); j++) {
            max = Math.max(max, j - i + 1);
            map.put(s.charAt(j), j);
            if (map.containsKey(s.charAt(j))) {
                i = map.get(s.charAt(j)) + 1;
            }


        }

        return max;

//        int[] m = new int[128];
//
//        int count = 0;
//        int i = 0;
//
//        for (int j = 0; j < s.length(); j++) {
//            i = Math.max(i, m[s.charAt(j)]);
//            m[s.charAt(j)] = j + 1;
//            count = Math.max(count, j - i + 1);
//        }
//
//        return count;
    }

    public static void main(String[] args) {
        _003无重复字符的最长子串 s = new _003无重复字符的最长子串();
        int c = s.lengthOfLongestSubstring("dvdf");
        System.out.println(c);
    }
}
