package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _090子集II {

    private int[] nums;
    List<List<Integer>> r = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.nums = nums;
        recursive(0, new ArrayList<>());
        return r;
    }

    private void recursive(int start, List<Integer> list) {
        if (start < this.nums.length && !r.contains(list)) {
            r.add(new ArrayList<>(list));
//            return;
        }

        for (int i = start; i < this.nums.length; i++) {
            list.add(nums[i]);
            recursive(start + 1, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        _090子集II s = new _090子集II();
        s.subsetsWithDup(new int[]{1, 2, 2});
    }
}
