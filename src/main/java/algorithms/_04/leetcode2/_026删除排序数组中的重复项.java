package algorithms._04.leetcode2;

public class _026删除排序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int i = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == nums[i]) {
                continue;
            } else {
                nums[i] = nums[k];
                i++;
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        _026删除排序数组中的重复项 s = new _026删除排序数组中的重复项();
        s.removeDuplicates(new int[]{1,1,1});
    }
}
