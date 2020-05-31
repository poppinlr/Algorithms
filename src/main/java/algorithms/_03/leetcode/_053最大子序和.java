package algorithms._03.leetcode;

class _053最大子序和 {
    /**
     * 动态规划
     * @param nums
     * @return
     */
    public int maxSubArrayD(int[] nums) {
        if(nums == null || nums.length==0){
            return 0;
        } else {
            int currentMax = nums[0];
            int max = currentMax;
            for (int i = 1; i < nums.length; i++) {
                currentMax = Math.max(nums[i], nums[i] + currentMax);
                if (currentMax > max) {
                    max = currentMax;
                }
            }
            return max;
        }
    }

    /**
     * 分治法
     * @param nums
     * @return
     */
    public int maxSubArrayR(int[] nums){
        return recursive(nums, 0, nums.length - 1);
    }

    private int recursive(int[] nums, int lo, int hi) {
        if (lo == hi) {
            return nums[lo];
        } else {
            int mid = lo + (hi-lo)/2;

            int maxLeft = recursive(nums, lo, mid);
            int maxRight = recursive(nums, mid + 1, hi);

            int leftSumCross = nums[mid];
            int leftSum = 0;
            for (int i = mid; i >= lo ; i--) {
                leftSum = leftSum + nums[i];
                leftSumCross = Math.max(leftSum, leftSumCross);
            }

            int rightSumCross = nums[mid+1];
            int rightSum = 0;
            for (int i = mid+1; i <= hi; i++) {
                rightSum = rightSum + nums[i];
                rightSumCross = Math.max(rightSum, rightSumCross);
            }
            return Math.max(leftSumCross + rightSumCross, Math.max(maxLeft, maxRight));
        }
    }
}
