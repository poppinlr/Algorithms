package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//TODO 位运算
public class _187重复的DNA序列 {
    public List<String> findRepeatedDnaSequences(String s) {
        if (s == null || s.length() < 10) {
            return new ArrayList<>();
        }

        HashSet<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length() - 9; i++) {
            String sub = s.substring(i, i + 10);
            if (set.contains(sub) && !list.contains(sub)) {
                list.add(sub);
            } else {
                set.add(sub);
            }
        }

        return list;
    }
}
