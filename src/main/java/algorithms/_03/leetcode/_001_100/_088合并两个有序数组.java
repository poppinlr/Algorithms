package algorithms._03.leetcode._001_100;

public class _088合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] aux = new int[nums1.length];

        int i = 0;
        int j = 0;
        int index = 0;
        while (index < nums1.length) {
            if (j >= n) {
                aux[index++] = nums1[i++];
            } else if(i >= m) {
                aux[index++] = nums2[j++];
            } else  if (nums1[i] <= nums2[j]) {
                aux[index++] = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                aux[index++] = nums2[j++];
            }
        }


        for (int k = 0; k < nums1.length; k++) {
            nums1[k] = aux[k];
        }

    }
}
