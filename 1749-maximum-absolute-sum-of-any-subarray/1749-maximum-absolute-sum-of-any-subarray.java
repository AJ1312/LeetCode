class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int be = nums[0];
        int ans = nums[0];
        int minbe = nums[0];
        int n = nums.length;
        if(n==1){
            ans = Math.abs(nums[0]);
            return ans;
        }

        for(int i=1;i<n;i++){
            int v1 = be + nums[i];
            int v2 = nums[i];
            int v3 = minbe + nums[i];
            be = Math.max(v1, Math.max(v2,v3));
            minbe = Math.min(v1,Math.min(v2,v3));
            ans = Math.max(ans, Math.max(Math.abs(minbe), be));

        }

        return ans;

        
    }
}