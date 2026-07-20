class Solution {
    public int maxSubArray(int[] nums) {
        int be = nums[0];
        int ans = nums[0];
        int n = nums.length;
        int v1 = 0;
        int v2 = 0;



        for(int i=1;i<n;i++){
            v1 = be + nums[i];
            v2 = nums[i];
            be = Math.max(v1, v2);
            ans = Math.max(ans, be);
        }

        
        return ans;
        
    }
}