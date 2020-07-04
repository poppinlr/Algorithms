package algorithms._03.leetcode;

import java.util.Map;

public class _161相隔为1的编辑距离 {
    public boolean isOneEditDistance(String s, String t) {
        if (Math.abs(s.length() - t.length()) > 1 || s.equals(t)) {
            return false;
        }

        if (t.length() > s.length()) {
            String tmp = s;
            s = t;
            t = tmp;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                continue;
            } else {
                return s.substring(i + 1).equals(t.substring(i))
                        || s.substring(i + 1).equals(t.substring(i + 1));
            }
        }

        return true;
    }

    private String putMap(Map<String, Integer> map, String t, int i) {
        String nStr = i == t.length() ?
                t.substring(0, i) :
                t.substring(0, i) + t.substring(i + 1);
        map.put(nStr, 1);
        return nStr;
    }

    public static void main(String[] args) {
        _161相隔为1的编辑距离 s = new _161相隔为1的编辑距离();
        s.isOneEditDistance("a", "b");
//        String t = "a";
//        int i = 1;
//
//        String nStr = t.substring(0, i) + t.substring(i + 1);
    }
}
