package algorithms._03.leetcode;

import edu.princeton.cs.algs4.StdOut;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _008字符串转换整数 {

    public int myAtoi(String str) {
        Pattern p = Pattern.compile("^(\\s)*(\\+|\\-)?[0-9]+");
        Matcher m = p.matcher(str);

        if (m.find()) {
            String s = m.group();
            try {
                return Integer.parseInt(s);
            } catch (Exception e) {
                if (s.startsWith("-")) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        _008字符串转换整数 s = new _008字符串转换整数();
        StdOut.println(s.myAtoi("42"));
        StdOut.println(s.myAtoi("-42"));
        StdOut.println(s.myAtoi("4193 with words"));
        StdOut.println(s.myAtoi("words and 987"));
        StdOut.println(s.myAtoi("20000000000000000000000000000000000000000000000000000"));
    }
}
