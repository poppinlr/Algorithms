package algorithms._03.leetcode._001_100;

public class _026删除排序数组中的重复项 {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int move = 0;
        int max = nums[move];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == max) {
                continue;
            } else {
                max = nums[i];
                nums[++move] = max;
            }
        }

        for (int i = 0; i <= move; i++) {
            System.out.println(nums[i]);
        }

        return move + 1;
    }

    public static void main(String[] args) {
        _026删除排序数组中的重复项 s = new _026删除排序数组中的重复项();
        s.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }
}
