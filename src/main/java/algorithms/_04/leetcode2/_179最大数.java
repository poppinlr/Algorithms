package algorithms._04.leetcode2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _179最大数 {

    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add("" + nums[i]);
        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });

        if (list.get(0).startsWith("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        _179最大数 s = new _179最大数();
        String t = s.largestNumber(new int[]{3, 30, 34, 5, 9});
    }
}
