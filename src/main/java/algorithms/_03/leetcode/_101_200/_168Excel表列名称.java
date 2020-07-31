package algorithms._03.leetcode._101_200;

import edu.princeton.cs.algs4.StdOut;

public class _168Excel表列名称 {


    public String convertToTitle(int n) {

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            int t = n / 26;
            int a = n - t * 26;
            sb.append((char) ('A' + a));
            n = t;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        _168Excel表列名称 s = new _168Excel表列名称();
        String t = s.convertToTitle(5000);
        StdOut.println(t);
    }
}
