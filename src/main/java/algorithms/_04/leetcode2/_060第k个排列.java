package algorithms._04.leetcode2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _060第k个排列 {

    public String getPermutation(int n, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                map.put(1, 1);
            } else {
                map.put(i, map.get(i - 1) * i);
            }
            nums.add(i);
        }
        map.put(0, 1);//TODO 0!=1

        k--;//TODO core

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int m = map.get(n - 1 - i);
            int index = k / m;
            k = k - m * index;
            sb.append(nums.get(index));
            nums.remove(index);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        _060第k个排列 s = new _060第k个排列();
        s.getPermutation(3, 3);
    }
}
