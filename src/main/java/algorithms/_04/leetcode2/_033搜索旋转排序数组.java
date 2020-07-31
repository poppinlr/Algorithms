package algorithms._04.leetcode2;

public class _033搜索旋转排序数组 {

    //https://leetcode-cn.com/problems/search-in-rotated-sorted-array/solution/ji-bai-liao-9983de-javayong-hu-by-reedfan/
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (left == right) {
                if (target == nums[left]) {
                    return left;
                } else {
                    return -1;
                }
            }
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] < nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid-1;
                } else {
                    left = mid;
                }
            } else {//left >= mid
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid+1;
                } else {
                    right = mid;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        _033搜索旋转排序数组 s = new _033搜索旋转排序数组();
        s.search(new int[]{3,1}, 1);
    }
}
