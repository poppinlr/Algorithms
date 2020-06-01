package algorithms._03.leetcode;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class _169多数元素 {
    //TODO 投票算法
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//
//        int half = (nums.length) / 2;
//        int count = 1;
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == nums[i + 1]) {
//                count++;
//                if (count > half) {
//                    return nums[i];
//                }
//            } else {
//                count = 1;
//            }
//        }
//
//        return -1;
//    }

    //TODO!! 数学思维
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length >> 1];
    }


    public static void main(String[] args) {
        _169多数元素 s = new _169多数元素();
        int t = s.majorityElement(new int[]{2,2,1,1,1,2,2});
        StdOut.println(t);
    }
}
