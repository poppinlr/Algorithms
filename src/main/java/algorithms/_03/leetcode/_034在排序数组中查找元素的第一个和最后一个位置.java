package algorithms._03.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class _034在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        nums = new int[]{5,7,7,8,8,10};
        target = 8;

        int N = nums.length;
        List<Integer> lists = new ArrayList<>();
        search(nums, 0, N-1, lists, target);
        if (lists.size() == 0) {
            return new int[]{-1, -1};
        } else {
            lists.sort(Integer::compareTo);
            return new int[]{lists.get(0), lists.get(lists.size() - 1)};
        }

    }

    private void search(int[] nums, int lo, int hi, List<Integer> lists, int target) {
        int mid = lo + (hi-lo)/2;
        if (lo <= hi) {
            if (target < nums[mid]) {//target 在左边
                search(nums, lo, mid-1, lists, target);
            } else if(target > nums[mid]){//target 在右边
                search(nums, mid + 1, hi, lists, target);
            } else {
                lists.add(mid);
                search(nums, lo, mid-1, lists, target);
                search(nums, mid + 1, hi, lists, target);

            }
        }
    }


}
