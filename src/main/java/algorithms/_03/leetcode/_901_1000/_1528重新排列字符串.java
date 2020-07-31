package algorithms._03.leetcode._901_1000;

import java.util.HashMap;
import java.util.Map;

public class _1528重新排列字符串 {

    public String restoreString(String s, int[] indices) {
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indices.length; i++) {
            sb.append(map.get(i));
        }

        return sb.toString();
    }
}
