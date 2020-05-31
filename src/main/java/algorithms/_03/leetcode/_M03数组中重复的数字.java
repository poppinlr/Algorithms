package algorithms._03.leetcode;

public class _M03数组中重复的数字 {

    public int findRepeatNumber(int[] nums) {
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == i){

            } else{
                if(nums[i]==nums[nums[i]]){

                    return nums[i];
                } else{

                    int tmp = nums[nums[i]];
                    nums[nums[i]] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
        char[] s = "".toCharArray();
        return -1;
    }

    public static void main(String[] args) {
        _M03数组中重复的数字 s = new _M03数组中重复的数字();
        int i = s.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3});
    }
}
