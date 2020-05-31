package algorithms._03.leetcode;

import edu.princeton.cs.algs4.StdOut;

public class _013罗马数字转整数 {

    public int romanToInt(String s) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int index = 0;
        int num = 0;
        while (!s.isEmpty()) {
            if (s.startsWith(romans[index])) {
                num = num + nums[index];
                s = s.substring(romans[index].length());
            } else {
                index++;
            }

        }

        return num;
    }

    public static void main(String[] args) {
        _013罗马数字转整数 s = new _013罗马数字转整数();
        StdOut.println(s.romanToInt("III"));
    }
}
