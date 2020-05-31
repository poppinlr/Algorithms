package algorithms._03.leetcode;

public class _215数组中的第K个最大元素 {

    public int findKthLargest(int[] nums, int k) {
        int lo = 0;
        int hi = nums.length-1;
        while (lo < hi) {
            int j = quickSort(nums, lo, hi);
            if (j+1 == k) {
                return nums[j];
            } else if (j+1 < k) {
                lo = j+1;
            } else {
                hi = j-1;
            }
        }

        return nums[k-1];
    }

    private int quickSort(int[] nums, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {
            while (nums[++i] > nums[lo]) {
                if (i == hi) {
                    break;
                }
            }

            while (nums[lo] > nums[--j]) {
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
        int t = nums[lo];
        nums[lo] = nums[j];
        nums[j] = t;
        return j;
    }

    public static void main(String[] args) {
        _215数组中的第K个最大元素 s = new _215数组中的第K个最大元素();
        s.findKthLargest(new int[]{2,1}, 2);
    }
}
