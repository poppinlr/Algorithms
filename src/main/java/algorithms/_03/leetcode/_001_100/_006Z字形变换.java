package algorithms._03.leetcode._001_100;

import edu.princeton.cs.algs4.StdOut;

public class _006Z字形变换 {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows && i < s.length(); i++) {
            if (i == 0 || i == numRows - 1) {
                sb.append(s.charAt(i));
                int j = i;
                while (j + 2 * numRows - 2 < s.length()) {
                    j = j + 2 * numRows - 2;
                    sb.append(s.charAt(j));
                }
            } else {
                sb.append(s.charAt(i));
                int j = i;
                while (j + 2 * numRows - 2 - i * 2 < s.length()) {
                    j = j + 2 * numRows - 2;
                    sb.append(s.charAt(j - i * 2));
                    if (j < s.length()) {
                        sb.append(s.charAt(j));
                    }
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        _006Z字形变换 z = new _006Z字形变换();
        String s = z.convert("A", 1);
        StdOut.println(s.equals("LCIRETOESIIGEDHN"));
//        LCIRETOESII EDHN
//        LCIRETOESIIGEDHN
    }
}
