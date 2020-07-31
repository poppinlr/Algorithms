package algorithms._04.leetcode2;

public class _041缺失的第一个正数 {
    /**
     * 算法的时间复杂度应为O(n)，并且只能使用常数级别的额外空间
     *
     * @param nums
     * @return
     */
    public int firstMissingPositive(int[] nums) {
        /**
         * 如果nums 的长度为N,
         */
        int[] hashNum = new int[nums.length];
        //将nums hash成一个新的数组
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i] - 1;
            if (val >= 0 && val < nums.length) {
                hashNum[nums[i] - 1] = nums[i];
            }
        }

        //如果有缺口, 则最小正整数为缺口所在的数
        for (int i = 0; i < hashNum.length; i++) {
            if (hashNum[i] == i + 1) {
                continue;
            } else {
                return i + 1;
            }
        }

        //如果没有缺口, 即数组内由 1-N 的数顺序填满
        //那么, 最小的正整数为N+1
        return nums.length + 1;
    }
}
