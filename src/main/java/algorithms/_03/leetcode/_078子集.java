package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _078子集 {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> r = new ArrayList<>();
        recursive(r, new ArrayList<>(), nums, 0);

        return r;
    }

    private void recursive(List<List<Integer>> r, List<Integer> l, int[] nums, int index) {
        r.add(new ArrayList<>(l));

        //loop
        for (int i = index; i < nums.length; i++) {
            l.add(nums[i]);
            //recursive
            recursive(r, l, nums, i + 1);
            //backtrack
            l.remove(l.size() - 1);
        }
    }

    public List<List<Integer>> subsets1(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res, new ArrayList<Integer>());
        return res;

    }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> tmp) {
        res.add(new ArrayList<>(tmp));
        for (int j = i; j < nums.length; j++) {
            tmp.add(nums[j]);
            backtrack(j + 1, nums, res, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String[] args) {
        _078子集 s = new _078子集();
        List<List<Integer>> r = s.subsets(new int[]{1, 2, 3});
        List<List<Integer>> r1 = s.subsets1(new int[]{1, 2, 3});
    }
}
