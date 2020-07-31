package algorithms._04.leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _039组合总和 {

    private List<List<Integer>> r = new ArrayList<>();
    private int[] candidates;
    private int target = 0;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0) {
            return new ArrayList<>();
        }
        Arrays.sort(candidates);
        this.candidates = candidates;
        this.target = target;
        recursive(0, 0, new ArrayList<>());

        return r;
    }

    private void recursive(int start, int sum, ArrayList<Integer> list) {
        if (sum >= target) {
            if (sum == target) {
                r.add(new ArrayList<>(list));
            }
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i - 1 >= start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            list.add(candidates[i]);
            recursive(i, sum + candidates[i], list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {

    }
}
