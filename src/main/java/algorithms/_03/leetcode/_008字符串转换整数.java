package algorithms._03.leetcode;

import edu.princeton.cs.algs4.StdOut;

import java.util.HashMap;
import java.util.Map;
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
//        StdOut.println(s.myAtoiN("42"));
//        StdOut.println(s.myAtoiN("-42"));
//        StdOut.println(s.myAtoiN("4193 with words"));
//        StdOut.println(s.myAtoiN("words and 987"));
        StdOut.println(s.myAtoiN("2147483649"));

        StdOut.println(Integer.MIN_VALUE);
        StdOut.println(Integer.MAX_VALUE);
    }

    private static final String START = "START";
    private static final String SIGNED = "SIGNED";
    private static final String NUMBER = "NUMBER";
    private static final String END = "END";
    Map<String, String[]> map = new HashMap<>();
    String state = START;
    long ans = 0;
    long sign = 1;

    public int myAtoiN(String str) {
        map.put(START, new String[]{START, SIGNED, NUMBER, END});
        map.put(SIGNED, new String[]{END, END, NUMBER, END});
        map.put(NUMBER, new String[]{END, END, NUMBER, END});
        map.put(END, new String[]{END, END, END, END});

        char[] cArray = str.toCharArray();
        for (char c : cArray) {
            getChar(c);
        }

        if (sign == 1) {
            if (ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else {
                return (int)ans;
            }
        } else {
            if (-ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else {
                return (int) (-ans);
            }
        }
    }

    private int getCol(char c) {
        if (c == ' ') {
            return 0;
        }
        if (c == '+' || c == '-') {
            return 1;
        }
        if (c >= '0' && c <= '9') {
            return 2;
        }

        return 3;
    }

    private void getChar(char c) {
        state = map.get(state)[getCol(c)];
        if (state.equals(NUMBER)) {
            ans = ans * 10l + (c - '0');
        } else if (state.equals(SIGNED)) {
            sign = c == '+' ? 1 : -1;
        }
    }


}
