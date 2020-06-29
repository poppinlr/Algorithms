package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _090子集II {

    private int[] nums;
    List<List<Integer>> r = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        this.nums = nums;

        recursive(0, new ArrayList<>());
        return r;
    }

    private void recursive(int start, ArrayList<Integer> list) {
        r.add(new ArrayList<>(list));

        for (int i = start; i < nums.length; i++) {
            //core
            //跳过相同层数的相同元素, 而不会跳过不同层数的相同元素
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            recursive(i + 1, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        _090子集II s = new _090子集II();
        s.subsetsWithDup(new int[]{1, 2, 2});
    }
}
