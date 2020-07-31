package algorithms._03.leetcode._101_200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _179最大数 {
    public String largestNumber(int[] nums) {
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            strList.add(String.valueOf(nums[i]));
        }

        strList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String order1 = s1 + s2;
                String order2 = s2 + s1;
                return order2.compareTo(order1);
            }
        });
        StringBuilder sb = new StringBuilder();
        if (strList.get(0).startsWith("0")) {
            return "0";
        }
        for (String s : strList) {
            sb.append(s);
        }

        return sb.toString();
    }



    public static void main(String[] args) {
        _179最大数 s = new _179最大数();
        s.largestNumber(new int[]{3,30,34,5,9});
    }
}
