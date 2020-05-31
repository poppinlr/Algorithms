package algorithms._03.leetcode;

public class _004寻找两个正序数组的中位数 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int x = nums1.length;
        int y = nums2.length;

        int low = 0;
        int hi = x;

        while (low <= hi) {
            int partitionX = (low + hi) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            int maxLeftX = partitionX == 0 ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = partitionX == x ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = partitionY == 0 ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = partitionY == y ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((x + y) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY)+Math.min(minRightX, minRightY))/2.0;
                } else {
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                hi = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }

        return 0.0;
    }

    public static void main(String[] args) {
        _004寻找两个正序数组的中位数 s = new _004寻找两个正序数组的中位数();
        s.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4, 5, 6, 7});
    }
}
