package algorithms._03.leetcode._001_100;

public class _004寻找两个正序数组的中位数 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //把长度短的放到nums1
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }


        //在num1 中寻找分割点
        int low = 0;
        int hi = nums1.length;

        while (low <= hi) {
            int x = (low + hi) / 2;
            int y = (nums1.length + nums2.length + 1) / 2 - x;//为什么要+1, 奇数的时候选取

            //当partitionX=0, n1Left=Integer.MIN_VALUE,  n1Left <= n2Right 永远为true
            int n1Left = x == 0 ? Integer.MIN_VALUE : nums1[x - 1];
            //当partitionX=x, n1Right=Integer.MAX_VALUE, n2Left <= n1Right 永远为true
            int n1Right = x == nums1.length ? Integer.MAX_VALUE : nums1[x];

            //
            int n2Left = y == 0 ? Integer.MIN_VALUE : nums2[y - 1];
            int n2Right = y == nums2.length ? Integer.MAX_VALUE : nums2[y];

            //
            if (n1Left <= n2Right && n2Left <= n1Right) {
                if ((nums1.length + nums2.length) % 2 == 0) {
                    return (Math.max(n1Left, n2Left) + Math.min(n1Right, n2Right)) / 2.0;
                } else {
                    return Math.max(n1Left, n2Left);
                }
            } else if (n1Left > n2Right) {
                hi = x - 1;
            } else {
                low = x + 1;
            }
        }

        return 0.0;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE - 1);
//        _004寻找两个正序数组的中位数 s = new _004寻找两个正序数组的中位数();
//        s.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4, 5, 6, 7});
    }
}
