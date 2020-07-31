package algorithms._03.leetcode._401_500;

public class _410分割数组的最大值 {

    public int splitArray(int[] nums, int m) {
        long lo = max(nums);
        long hi = sum(nums);
        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;

            if (check(nums, mid, m)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return (int)lo;
    }

    private boolean check(int[] nums, long mid, int m) {
        int sum = 0;
        int group = 1;
        //mid 可不可以让数组变成m组, 可以 return mid;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] > mid) {
                group++;
                sum = nums[i];
            } else {
                sum = sum + nums[i];
            }
        }

        return group <= m;
    }

    private long max(int[] nums) {
        long max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        return max;
    }

    private long sum(int[] nums) {
        long sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }

        return sum;
    }

    public static void main(String[] args) {
        _410分割数组的最大值 s = new _410分割数组的最大值();
        s.splitArray(new int[]{7, 2, 5, 10, 8}, 3);
    }
}
