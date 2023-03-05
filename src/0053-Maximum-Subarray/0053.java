public class Solution {
    public int maxSubArray(int[] nums) {

        int maxSoFar = nums[0];
        int curMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curMax = Math.max(curMax + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, curMax);
        }

        return maxSoFar;
    }
}
