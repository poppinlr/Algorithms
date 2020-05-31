package algorithms._03.leetcode;

public class _027移除元素 {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            while(nums[i]!=val){
                i++;
            }

            while(nums[j]==val){
                j--;
            }

            if (i > j) {
                break;
            }

            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        return i;
    }

    public static void main(String[] args) {
        _027移除元素 s = new _027移除元素();
        s.removeElement(new int[]{3,2,2,3}, 3);
    }
}
