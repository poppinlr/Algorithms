package algorithms._03.leetcode._001_100;

//TODO
public class _084柱状图中最大的矩形 {

    public int largestRectangleArea(int[] heights) {
        //暴力解法
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int left = i;
            int right = i;
            int height = heights[i];
            while (left >= 0 && heights[left] >= height) {
                left--;
            }

            left++;

            while (right < heights.length && heights[right] >= height) {
                right++;
            }

            right--;

            max = Math.max(max, height * (right - left + 1));
        }

        return max;
    }

    public static void main(String[] args) {
        _084柱状图中最大的矩形 s = new _084柱状图中最大的矩形();
        int m = s.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});
    }
}
