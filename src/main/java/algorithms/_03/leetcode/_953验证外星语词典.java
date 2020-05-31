package algorithms._03.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class _953验证外星语词典 {



    class SCompar implements Comparator<String>{

        @Override
        public int compare(String s, String t1) {
            return 0;
        }
    }

    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = order.toCharArray();
        for (int i = 0; i < order.length(); i++) {
            map.put(chars[i], i);
        }

        for (int i = 0; i < words.length - 1; i++) {

            String s1 = words[i];
            String s2 = words[i + 1];

            for (int j = 0; j < Math.min(s1.length(), s2.length()); j++) {
                if (map.get(s1.charAt(j)) > map.get(s2.charAt(j))) {
                    return false;
                }

            }
            if (s1.length() < s2.length()) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        _953验证外星语词典 s = new _953验证外星语词典();
        s.isAlienSorted(new String[]{"hello", "leetcode"},
                "hlabcdefgijkmnopqrstuvwxyz");
    }
}
