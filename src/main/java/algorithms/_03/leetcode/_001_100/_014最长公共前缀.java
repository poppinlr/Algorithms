package algorithms._03.leetcode._001_100;

import edu.princeton.cs.algs4.StdOut;

public class _014最长公共前缀 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        _014最长公共前缀 s = new _014最长公共前缀();
        String v = s.longestCommonPrefix(new String[]{"aa"});
        StdOut.println(v);
    }
}
