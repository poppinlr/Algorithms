package algorithms._03.leetcode._001_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _039组合总和 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> r = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSumR(candidates, target, 0, 0, new ArrayList<>(), r);
        return r;
    }

    private void combinationSumR(int[] candidates, int target, int i, int sum, ArrayList<Integer> l, List<List<Integer>> r) {
        if (sum >= target) {
            if (sum == target) {
                if (!r.contains(l)) {
                    r.add(new ArrayList<>(l));
                }
            }
            return;
        }

        //loop
        for (int j = i; j < candidates.length; j++) {
            //try
            l.add(candidates[j]);
            //recursive
            combinationSumR(candidates, target, j + 1, sum + candidates[j], l, r);
            //backtrack
            l.remove(l.size() - 1);
        }
    }

    public static void main(String[] args) {
        _039组合总和 s = new _039组合总和();
        List<List<Integer>> r = s.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);

    }


}
