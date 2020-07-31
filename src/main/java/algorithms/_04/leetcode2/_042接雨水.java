package algorithms._04.leetcode2;

public class _042接雨水 {
    public int trap(int[] height) {
        if (height.length < 3) {
            return 0;
        }
        int max = 0;

        int maxHeight = 0;
        int maxIndex = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] >= maxHeight) {
                maxIndex = i;
                maxHeight = height[i];
            }
        }
        //left to maxIndex
        int left = 0;
        int right = left + 1;
        while (right <= maxIndex) {
            while (height[right] < height[left]) {
                right++;
            }

            for (int i = left + 1; i < right; i++) {
                max = max + height[left] - Math.min(height[left], height[i]);
            }
            left = right;
            right = left + 1;
        }


        //right to maxIndex
        right = height.length - 1;
        left = right - 1;
        while (left > maxIndex) {
            while (height[left] < height[right]) {
                left--;
            }

            for (int i = left + 1; i < right; i++) {
                max = max + height[right] - Math.min(height[right], height[i]);
            }

            right = left;
            left = right - 1;
        }


        return max;
    }

    public static void main(String[] args) {
        _042接雨水 s = new _042接雨水();
        s.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
    }
}
