package algorithms._03.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _015三数之和 {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        List<List<Integer>> r = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i]>0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
            int L = i + 1;
            int R = nums.length - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    r.add(List.of(nums[i], nums[L], nums[R]));
                    while (L < R && nums[L + 1] == nums[L]) L++;//去重
                    while (L < R && nums[R - 1] == nums[R]) R--;
                    L++;
                    R--;
                } else if (sum < 0) {
                    L++;
                } else {
                    R--;
                }
            }
        }
        return r;
    }
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> l = new ArrayList<>();
//        Arrays.sort(nums);
//
//        recursive(l, new ArrayList<>(), nums, 0, 0);
//        return l;
//    }
//
//    private void recursive(List<List<Integer>> l, List<Integer> list, int[] nums, int sum, int start){
//        if (list.size() > 3) {
//            return;
//        }
//        if (list.size() == 3 && sum == 0) {
//            if (!l.contains(list)) {
//                l.add(new ArrayList<>(list));
//            }
//        }
//
//        //loop
//        for (int i = start; i < nums.length; i++) {
//            list.add(nums[i]);
//            //try
//            recursive(l, list, nums, sum + nums[i], i + 1);
//            //backtrack
//            list.remove(list.size() - 1);
//        }
//    }

    public static void main(String[] args) {
        _015三数之和 s = new _015三数之和();
        s.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }
}
