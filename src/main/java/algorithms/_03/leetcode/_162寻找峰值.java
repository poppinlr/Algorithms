package algorithms._03.leetcode;

public class _162寻找峰值 {

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        _162寻找峰值 s = new _162寻找峰值();
        s.findPeakElement(new int[]{1, 2, 3, 1});
    }
}
