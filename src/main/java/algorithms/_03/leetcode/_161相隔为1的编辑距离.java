package algorithms._03.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _161相隔为1的编辑距离 {
    public boolean isOneEditDistance(String s, String t) {
        if (Math.abs(s.length() - t.length()) != 1) {
            return false;
        }
        s = s.toLowerCase();
        t = t.toLowerCase();
        Map<String, Integer> maps = new HashMap<>();
        Map<String, Integer> mapt = new HashMap<>();
        maps.put(s, 0);
        mapt.put(t, 0);

        //s 删除一个=t
        //t 删除一个=s
        //s 替换一个=t
        for (int i = 0; i < Math.max(s.length(), t.length()); i++) {
            if (i < s.length()) {
                String sStr = putMap(maps, s, i);
                if (mapt.containsKey(sStr)) {
                    return true;
                }
            }

            if (i < t.length()) {
                String tStr = putMap(mapt, t, i);
                if (maps.containsKey(tStr)) {
                    return true;
                }
            }
        }

        return false;
    }

    private String putMap(Map<String, Integer> map, String t, int i) {
        String nStr = t.substring(0, i) + t.substring(i + 1);
        map.put(nStr, 1);
        return nStr;
    }

    public static void main(String[] args) {
        _161相隔为1的编辑距离 s = new _161相隔为1的编辑距离();
        s.isOneEditDistance("ab", "acb");
    }
}
