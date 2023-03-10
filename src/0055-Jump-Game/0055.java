public class Solution {
    public boolean canJum(int[] nums) {
        int maxPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxPos) {
                return false;
            }
            maxPos = Math.max(maxPos, nums[i] + i);
        }
        return true;
    }
}
