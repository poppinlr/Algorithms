package algorithms._04.leetcode2;

public class _004寻找两个正序数组的中位数 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int lo = 0;
        int hi = nums1.length;

        while (lo < hi) {
            int x = (lo + hi) / 2;
            int y = (nums1.length + nums2.length + 1) / 2 - x;
            int n1Left = x == 0 ? Integer.MIN_VALUE : nums1[x - 1];
            int n1Right = x == nums1.length ? Integer.MAX_VALUE : nums1[x];

            int n2Left = y == 0 ? Integer.MIN_VALUE : nums2[y - 1];
            int n2Right = y == nums2.length ? Integer.MAX_VALUE : nums2[y];

            if (n1Left < n2Right && n2Left < n1Right) {
                if ((nums1.length + nums2.length) % 2 == 0) {
                    return Math.max(n1Left, n2Left) + Math.min(n1Right, n2Right);
                } else{
                    return Math.max(n1Left, n2Left);
                }
            } else if (n2Right > n1Left) {//右移
                lo = x - 1;
            } else {//左移
                hi = x + 1;
            }
        }

        return 0;
    }
}
