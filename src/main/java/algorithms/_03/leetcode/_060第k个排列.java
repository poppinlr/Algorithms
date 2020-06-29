package algorithms._03.leetcode;

import algorithms._03.leetcode.unsolved.和为K的子数组;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _060第k个排列 {


    public String getPermutation(int n, int k) {
        int[] factorials = new int[n];
        List<Integer> nums = new ArrayList<>();
        factorials[0] = 1;
        nums.add(1);

        for (int i = 1; i < n; i++) {
            factorials[i] = factorials[i - 1] * i;
            nums.add(i + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i >-1 ; --i) {
            int idx = k / factorials[i];
            k = k - idx * factorials[i];

            sb.append(nums.get(idx));
            nums.remove(idx);
        }
        return sb.toString();
    }

    //回溯, 超时

    private int k = 0;
    private int n = 0;
    private String[] nums;
    private List<List<String>> r = new ArrayList<>();

    public String getPermutationR(int n, int k) {
        this.n = n;
        this.k = k;
        String[] nums = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = String.valueOf(i + 1);
        }
        this.nums = nums;

        recursive(new ArrayList<>());

        return String.join("", r.get(k - 1));
    }

    private void recursive(List<String> list) {
        if (list.size() == n) {
            r.add(new ArrayList<>(list));
            return;
        }

        //当获得k个排列时 没有必要继续递归下去
        for (int i = 0; i < n && r.size() < k; i++) {
            if (list.contains(nums[i])) {
                continue;
            } else {
                list.add(nums[i]);

                recursive(list);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        _060第k个排列 s = new _060第k个排列();
        s.getPermutation(3, 3);
    }
}
