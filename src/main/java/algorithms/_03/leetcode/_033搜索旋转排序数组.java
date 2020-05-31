package algorithms._03.leetcode;

import javax.xml.stream.XMLInputFactory;

/**
 * 二分找到旋转点
 * 二分找到值
 */
public class _033搜索旋转排序数组 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = left+(right-left)/2;

        while (left < right) {
            if (target == nums[mid]) {
                return mid;
            }

            //左边升序 且
            if (nums[left] <= nums[mid]) {
                //target再左边范围
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid;
                } else {
                    left = mid+1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid;
                } else {
                    right = mid-1;
                }
            }
            mid = left+(right-left)/2;
        }
        return -1;
    }

//    public int search(int[] nums, int target) {
//
//        return binarySearch(nums, target, 0, nums.length - 1);
//
//    }
//
//    private int binarySearch(int[] nums, int target, int lo, int hi) {
//        if (lo <= hi) {
//            int mid = lo + (hi - lo) / 2;
//            if (target == nums[mid]) {
//                return mid;
//            }
//            if (nums[lo] <= nums[mid]) {
//                if (nums[lo] <= target && target <= nums[mid]) {
//                    return binarySearch(nums, target, lo, mid - 1);
//                } else {
//                    return binarySearch(nums, target, mid + 1, hi);
//                }
//
//            } else {
//                if (nums[mid] <= target && target <= nums[hi]) {
//                    return binarySearch(nums, target, mid + 1, hi);
//                } else {
//                    return binarySearch(nums, target, lo, mid - 1);
//                }
//            }
//        }
//        return -1;
//
//    }
}
