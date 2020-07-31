package algorithms._03.leetcode._101_200;

import edu.princeton.cs.algs4.StdOut;

public class _136只出现一次的数字 {

    public int singleNumber(int[] nums) {
//        Arrays.sort(nums);
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (i == nums.length - 1 && count == 0) {
//                return nums[nums.length - 1];
//            }
//            if (nums[i] == nums[i + 1]) {
//                count++;
//            } else {
//                if (count == 0) {
//                    return nums[i];
//                } else {
//                    count = 0;
//                }
//
//            }
//        }
//
//        return 0;

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        _136只出现一次的数字 s = new _136只出现一次的数字();
        int t = s.singleNumber(new int[]{4, 1, 2, 1, 2});
        StdOut.println(t);
    }
}
