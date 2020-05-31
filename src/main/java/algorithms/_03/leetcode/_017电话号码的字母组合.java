package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _017电话号码的字母组合 {
    Map<Integer, String> map;
    StringBuilder sb = new StringBuilder();
    List<String> l = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        this.map = map;
        recursive(digits, 0);
        return l;
    }

    private void recursive(String digits, int i) {
        if (i == digits.length()) {
            l.add(sb.toString());
            return;
        }

        //for loop
        String v = map.get(digits.charAt(i)-'0');
        for (int j = 0; j < v.length(); j++) {
            //try
            sb.append(v.charAt(j));
            //recursive
            recursive(digits, i + 1);
            //backtrack
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        _017电话号码的字母组合 s = new _017电话号码的字母组合();
        s.letterCombinations("23");
    }
}
