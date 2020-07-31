package algorithms._03.leetcode._001_100;

public class _011盛最多水的容器 {
    public int maxArea(int[] height) {
        height = new int[]{1,8,6,2,5,4,8,3,7};
        int N = height.length;
        int maxArea = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (height[i] > height[j]) {
                    maxArea = Math.max(maxArea, (j - i) * height[j]);
                } else {
                    maxArea = Math.max(maxArea, (j - i) * height[i]);
                }
            }
        }
        return maxArea;
    }

    /**
     * 双向指针
     * @param height
     * @return
     */
    public int maxAreaD(int[] height) {
        height = new int[]{1,8,6,2,5,4,8,3,7};
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while (left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            max = Math.max(max, (Math.min(leftHeight, rightHeight)) * (right - left));
            if (leftHeight < rightHeight) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
