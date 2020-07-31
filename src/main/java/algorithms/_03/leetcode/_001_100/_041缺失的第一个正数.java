package algorithms._03.leetcode._001_100;

public class _041缺失的第一个正数 {

    public int firstMissingPositive(int[] nums) {
        int[] newNums = new int[nums.length];

        for (int num : nums) {
            if (num <= nums.length && num > 0) {
                newNums[num - 1] = num;
            }
        }

        for (int i = 0; i < newNums.length; i++) {
            if (i + 1 == newNums[i]) {
                continue;
            } else {
                return i + 1;
            }
        }

        return nums.length + 1;
    }

    public static void main(String[] args) {
        _041缺失的第一个正数 s = new _041缺失的第一个正数();

        int t = s.firstMissingPositive(new int[]{3, 4, -1, 1});
    }
}
