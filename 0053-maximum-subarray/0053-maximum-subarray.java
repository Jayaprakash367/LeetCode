class Solution {
    public int maxSubArray(int[] nums) {
        int currentMax = nums[0];   // best sum of a subarray ending at i
        int globalMax = nums[0];    // best sum seen anywhere

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }
}