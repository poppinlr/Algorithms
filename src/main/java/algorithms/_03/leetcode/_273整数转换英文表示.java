package algorithms._03.leetcode;

import edu.princeton.cs.algs4.StdOut;

import java.util.HashMap;
import java.util.Map;

public class _273整数转换英文表示 {

    private Map<Integer, String> map = new HashMap<>();
    private Map<Integer, String> map1 = new HashMap<>();

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        map.put(1, "One ");
        map.put(2, "Two ");
        map.put(3, "Three ");
        map.put(4, "Four ");
        map.put(5, "Five ");
        map.put(6, "Six ");
        map.put(7, "Seven ");
        map.put(8, "Eight ");
        map.put(9, "Nine ");
        map.put(10, "Ten ");
        map.put(11, "Eleven ");
        map.put(12, "Twelve ");
        map.put(13, "Thirteen ");
        map.put(14, "Fourteen ");
        map.put(15, "Fifteen ");
        map.put(16, "Sixteen ");
        map.put(17, "Seventeen ");
        map.put(18, "Eighteen ");
        map.put(19, "Nineteen ");

        map1.put(2, "Twenty ");
        map1.put(3, "Thirty ");
        map1.put(4, "Forty ");
        map1.put(5, "Fifty ");
        map1.put(6, "Sixty ");
        map1.put(7, "Seventy ");
        map1.put(8, "Eighty ");
        map1.put(9, "Ninety ");

//        map.put(100, "Hundred ");
//        map.put(1000, "Thousand ");
//        map.put(1000000, "Million ");
//        map.put(1000000000, "Billion ");
        return numberToWordsSub(num).toString().trim();
    }

    public StringBuilder numberToWordsSub(int num) {

        if (num >= 1000000000) {
            return numberToWordsSub(num / 1000000000)
                    .append("Billion ")
                    .append(numberToWordsSub(num % 1000000000));
        } else if (num >= 1000000) {
            return numberToWordsSub(num / 1000000)
                    .append("Million ")
                    .append(numberToWordsSub(num % 1000000));

        } else if (num >= 1000) {
            return numberToWordsSub(num / 1000)
                    .append("Thousand ")
                    .append(numberToWordsSub(num % 1000));
        } else if (num >= 100) {
            return numberToWordsSub(num / 100)
                    .append("Hundred ")
                    .append(numberToWordsSub(num % 100));
        } else if (num >= 20) {
            int i = num / 10;
            StringBuilder sb = new StringBuilder();
            return sb.append(map1.get(i)).append(numberToWordsSub(num - i * 10));
        } else if (num > 0) {
            StringBuilder sb = new StringBuilder();
            return sb.append(map.get(num));
        } else {
            return new StringBuilder();
        }
    }

    public static void main(String[] args) {
        _273整数转换英文表示 s = new _273整数转换英文表示();
        String t = s.numberToWords(1234567);
        StdOut.println(t);
    }


}
