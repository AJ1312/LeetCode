class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int be = nums[0];
        int minbe = nums[0];
        int ans = Math.abs(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            be = Math.max(be + nums[i], nums[i]);
            minbe = Math.min(minbe + nums[i], nums[i]);
            ans = Math.max(ans, Math.max(be, -minbe));
        }

        return ans;
    }
}