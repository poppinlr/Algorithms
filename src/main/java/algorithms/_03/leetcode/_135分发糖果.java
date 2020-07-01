package algorithms._03.leetcode;

import java.util.Arrays;

public class _135分发糖果 {

    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);


        for (int i = 0; i < ratings.length - 1; i++) {
            if (ratings[i] < ratings[i + 1]) {
                candies[i + 1] = candies[i] + 1;
            }
        }

        for (int i = ratings.length - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i] && candies[i - 1] <= candies[i]) {
                candies[i - 1] = candies[i] + 1;
            }
        }
        int count = 0;
        for (int candy : candies) {
            count = count + candy;
        }

        return count;
    }

    public static void main(String[] args) {
        _135分发糖果 s = new _135分发糖果();
        int t = s.candy(new int[]{1, 2, 3, 3, 3, 2, 1});
    }
}
