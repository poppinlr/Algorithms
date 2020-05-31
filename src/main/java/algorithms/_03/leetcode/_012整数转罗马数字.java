package algorithms._03.leetcode;

import edu.princeton.cs.algs4.StdOut;

public class _012整数转罗马数字 {

    public String intToRoman(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int index = 0;
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            while (num >= nums[index]) {
                num = num-nums[index];
                sb.append(romans[index]);
            }
            index++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        _012整数转罗马数字 s = new _012整数转罗马数字();
        String v = s.intToRoman(1994);
        StdOut.println(v);
    }
}
