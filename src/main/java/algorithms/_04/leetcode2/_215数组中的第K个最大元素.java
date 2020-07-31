package algorithms._04.leetcode2;

import edu.princeton.cs.algs4.StdOut;

public class _215数组中的第K个最大元素 {

    private int k;

    public int findKthLargest(int[] nums, int k) {
        this.k = k;
        if (k > nums.length) {
            return -1;
        }
        sort(nums, 0, nums.length - 1);
        return -1;
    }

    private int sort(int[] nums, int lo, int hi) {
        int mid = partition(nums, lo, hi);
        if (k == mid) {
            return nums[k];
        }
        if (k < mid) {
            sort(nums, lo, mid - 1);
        } else {

        }
        return -1;
    }

    private int partition(int[] nums, int start, int end) {
        if (nums.length == 1) {
            return nums[0];
        }
        int lo = start + 1;
        int hi = end;
        while (lo < hi) {
            while (nums[start] > nums[lo] && lo < hi) {
                lo++;
            }

            while (nums[hi] < nums[start] && lo < hi) {
                hi--;
            }

            swap(nums, start, hi);
        }
        return lo;
    }

    private void swap(int[] nums, int lo, int hi) {
        int tmp = nums[lo];
        nums[lo] = nums[hi];
        nums[hi] = tmp;
    }

    public static void main(String[] args) {
        _215数组中的第K个最大元素 s = new _215数组中的第K个最大元素();
        s.findKthLargest(new int[]{1, 7, 3, 9, 0, 2}, 3);
    }
}
