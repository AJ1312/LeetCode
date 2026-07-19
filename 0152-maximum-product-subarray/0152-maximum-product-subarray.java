class Solution {
    public int maxProduct(int[] nums) {

        int size = nums.length;
        int be = nums[0];
        int ans = nums[0];

        int minBe = nums[0];


        for(int i=1;i<size;i++){
            int v1 = be * nums[i];
            int v2 = minBe * nums[i];
            int v3 = nums[i];

        
            

            be = Math.max(v3,Math.max(v1,v2));
            minBe = Math.min(v3,Math.min(v1,v2));
            ans = Math.max(ans, be);
        }

        return ans;
        
    }
}