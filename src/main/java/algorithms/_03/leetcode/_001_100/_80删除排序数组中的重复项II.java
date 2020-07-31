package algorithms._03.leetcode._001_100;

public class _80删除排序数组中的重复项II {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return 1;
        for (int j = 2; j < n; ++j) {
            if ((nums[j] != nums[i]) || (nums[j] != nums[i - 1])) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;

    }

    public static void main(String[] args) {
        _80删除排序数组中的重复项II s = new _80删除排序数组中的重复项II();
        int l = s.removeDuplicates(new int[]{1,1,1,2,2,2,3,3});
    }
}
