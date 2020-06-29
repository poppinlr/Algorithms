package algorithms._03.leetcode;

import edu.princeton.cs.algs4.StdOut;

public class _081搜索旋转排序数组II {

    public boolean search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private boolean search(int[] nums, int left, int right, int target) {
        if (left > right) {
            return false;
        }
        if (left == right) {
            return nums[left] == target;
        }

        int mid = left + (right - left) / 2;
        if (target == nums[left] || target == nums[right] || target == nums[mid]) {
            return true;
        }
        //前半部分有序
        if (nums[left] < nums[mid]) {
            if (nums[left] < target && target < nums[mid]) {
                return search(nums, left + 1, mid - 1, target);
            } else {
                return search(nums, mid + 1, right, target);
            }
        } else if (nums[mid] < nums[right]) {
            if (nums[mid] < target && target < nums[right]) {
                return search(nums, mid + 1, right - 1, target);
            } else {
                return search(nums, left, mid - 1, target);
            }
        } else {
            return search(nums, left, mid, target) || search(nums, mid + 1, right, target);
        }
    }

    public static void main(String[] args) {
        _081搜索旋转排序数组II s = new _081搜索旋转排序数组II();
        boolean b = s.search(new int[]{1}, 0);
        StdOut.println(b);
    }
}
