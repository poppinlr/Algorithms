package algorithms._03.leetcode;

public class _80删除排序数组中的重复项II {
    public int removeDuplicates(int[] nums) {
        int length = 1;

        int count = 1;
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count <= 1) {
                if (nums[i] == num) {
                    count++;
                } else {
                    count = 0;
                    num = nums[i];
                }
                length++;
//                if(length)
            } else {
                continue;
            }
        }

        return length + 1;
    }

    public static void main(String[] args) {
        _80删除排序数组中的重复项II s = new _80删除排序数组中的重复项II();
        int l = s.removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3});
    }
}
