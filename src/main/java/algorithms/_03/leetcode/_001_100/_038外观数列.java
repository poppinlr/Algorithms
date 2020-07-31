package algorithms._03.leetcode._001_100;

import edu.princeton.cs.algs4.StdOut;

public class _038外观数列 {

    public String countAndSay(int n) {
        //
        int i = 1;
        String str = "1";
        while (i < n) {
            str = countAnySayR(str);
            i++;
        }

        return str;
    }

    private String countAnySayR(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            int count = 0;
            char flag = str.charAt(i);
            while (i < str.length()&&str.charAt(i) == flag) {
                count++;
                i++;
            }
            sb.append(count);
            sb.append(flag);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        _038外观数列 s = new _038外观数列();
        String v = s.countAndSay(6);
        StdOut.println(v);
    }
}
