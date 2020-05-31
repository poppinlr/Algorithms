package algorithms._03.leetcode;

public class _042接雨水 {

    public int trap(int[] height) {
        int sum = 0;

        if (height.length > 0) {
            int leftIndex = 0;
            int rightIndex = height.length - 1;
            int maxLeftHeight = height[leftIndex];
            int maxRightHeight = height[rightIndex];
            while (leftIndex < rightIndex) {
                if (maxRightHeight >= maxLeftHeight) {
                    leftIndex++;
                    if (height[leftIndex] > maxLeftHeight) {
                        maxLeftHeight = height[leftIndex];
                    }
                    sum = sum + maxLeftHeight - height[leftIndex];
                } else {
                    rightIndex--;
                    if (height[rightIndex] > maxRightHeight) {
                        maxRightHeight = height[rightIndex];
                    }
                    sum = sum + maxRightHeight - height[rightIndex];
                }

            }
        }
        return sum;
    }
}
