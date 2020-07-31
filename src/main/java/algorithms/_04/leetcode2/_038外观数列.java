package algorithms._04.leetcode2;

import edu.princeton.cs.algs4.StdOut;

public class _038外观数列 {

    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");
        int loop = 1;
        while (loop < n) {
            sb = countAndSay(sb);
            loop++;
        }

        return sb.toString();
    }

    private StringBuilder countAndSay(StringBuilder sb) {
        StringBuilder newSb = new StringBuilder();
        int i = 0;
        while (i < sb.length()) {
            char flag = sb.charAt(i);
            int count = 0;
            while (i < sb.length() && sb.charAt(i) == flag) {
                count++;
                i++;
            }
            newSb.append(count);
            newSb.append(flag);
        }
        return newSb;
    }

    public static void main(String[] args) {
        _038外观数列 s = new _038外观数列();
        StdOut.println(s.countAndSay(1));
        StdOut.println(s.countAndSay(2));
        StdOut.println(s.countAndSay(3));
        StdOut.println(s.countAndSay(4));
        StdOut.println(s.countAndSay(5));
    }
}
