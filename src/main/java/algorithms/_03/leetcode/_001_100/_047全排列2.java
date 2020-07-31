package algorithms._03.leetcode._001_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _047全排列2 {

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] marked = new boolean[nums.length];
        Arrays.sort(nums);
        reserive(new ArrayList<>(), nums, marked, 0);
        return list;
    }

    private void reserive(ArrayList<Integer> l, int[] nums, boolean[] marked, int start) {
        if (l.size() == nums.length) {
            if (!list.contains(l)) {
                list.add(new ArrayList<>(l));
            }
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!marked[i]) {
                l.add(nums[i]);
                marked[i] = true;
                reserive(l, nums, marked, i + 1);
                l.remove(l.size() - 1);
                marked[i] = false;
            } else {
                continue;
            }

        }
    }

    public static void main(String[] args) {
        _047全排列2 s = new _047全排列2();
        s.permuteUnique(new int[]{1, 1, 2});

    }
}
